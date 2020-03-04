package rhythmML.generator;

import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import org.eclipse.emf.common.util.EList;

import rhythmML.*;
import rhythmML.generator.MusicUtils.InstrumentElement;
import rhythmML.impl.ClassicTrackImpl;
import static rhythmML.generator.MusicUtils.addDrumHit;
import static rhythmML.generator.MusicUtils.addHit;
import static rhythmML.generator.MusicUtils.toTick;

public class Generator {

	private StringBuilder builder;

	public String getResult() {
		return builder.toString();
	}

	public Generator() {
		this.builder = new StringBuilder();
	}

	public static final String[] NOTE_NAMES = { "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" };
	public static final int NOTE_ON = 0x90;
	public static final int NOTE_OFF = 0x80;

	public void generate(Rhythm rhythm) throws MidiUnavailableException, IOException, InvalidMidiDataException {
		Sequencer sequencer = MidiSystem.getSequencer();
		sequencer.open();

		int tempo = rhythm.getBPM();

		Sequence sequence = generateSequence(rhythm);
		File f = new File("./result/" + rhythm.getName() + ".mid");
		MidiSystem.write(sequence, 1, f);

		Sequence sequence2 = MidiSystem.getSequence(new File("./result/" + rhythm.getName() + ".mid"));

		analyzeSequence(sequence2);

		sequencer.setSequence(sequence2);
		System.out.println(tempo);
		sequencer.setTempoInBPM(tempo);
		sequencer.start();

		while (true) {
			if (sequencer.isRunning()) {
				try {
					Thread.sleep(1000); // Check every second
				} catch (InterruptedException ignore) {
					break;
				}
			} else {
				break;
			}
		}
		// Close the MidiDevice & free resources

		sequencer.stop();
		sequencer.close();
	}

	public Sequence generateSequence(Rhythm rhythm) throws InvalidMidiDataException {

		int resolution = 200; // in slices per beat

		Sequence sequence = new Sequence(Sequence.PPQ, resolution);
		Track track = sequence.createTrack();
		int bar = 0;
		int beat = 0;
		double tickPos = 0;
		int trackNumber = 0;

		// TODO : refactor this crap
		for (rhythmML.Track t : rhythm.getTracks()) {
			Composition c = t.getComposition();

			if (t instanceof ClassicTrackImpl) {
				try {
					String instrument = (((ClassicTrackImpl) t).getInstrument());
					InstrumentElement instrumentElement = MusicUtils.InstrumentElement
							.convert(instrument.toLowerCase());
					MusicUtils.setInstrument(track, instrumentElement, trackNumber);
				} catch (Exception e) {
					System.out.println(
							"--------------------WARNING --------------------------The instrument you selected is unknown, piano is selected as default");
				}
			}

			for (Section s : c.getSections()) {
				for (PatternLoop p : s.getPatternLoops()) {
					EList<Beat> beats = p.getPattern().getBeats();
					for (int i = 0; i < p.getLoopNumber(); i++) {
						for (int j = 0; j < beats.size(); j++) {
							
							Beat b = applyPatternModification(s, i, j);
							if (b == null) {
								b = beats.get(j);
							}
									
							for (Tick tick : b.getTicks()) {
								for (Note note : tick.getNotes()) {

									if (note instanceof DrumNote) {
										DRUM_NOTES n = ((DrumNote) note).getDrumNote();
										double offset = applyOffset(t, n, b);
										int pos = toTick(bar, beat, tickPos, beats.size(), resolution, offset);
										addDrumNote(track, 9, n, pos);

									} else if (note instanceof ClassicNote) {

										NOTES n = ((ClassicNote) note).getNote();
										double offset = applyOffset(t, n, b);
										int pitch = note.getPitch() + 1;
										//System.out.println("pitch : " + pitch);
										int pos = toTick(bar, beat, tickPos, beats.size(), resolution, offset);
										addNote(track, trackNumber, n, pos, pitch);
									}
								}
								tickPos += 1.0 / b.getTicks().size();
							}
							tickPos = 0;
							beat++;
						}
						beat = 0;
						bar++;
					}
				}
			}
			bar = 0;
			beat = 0;
			tickPos = 0;
			trackNumber++;
		}

		return sequence;
	}

	private void addNote(Track track, int trackNumber, NOTES n, int pos, int pitch) {
		try {
			addHit(track, trackNumber, MusicUtils.Element.valueOf(n.toString()), pos, 90, pitch);
		} catch (Exception e) {
			addHit(track, trackNumber, MusicUtils.Element.DO, pos, 0, pitch);
		}
	}

	private void addDrumNote(Track track, int chan, DRUM_NOTES n, int pos) {
		try {
			addDrumHit(track, MusicUtils.DrumElement.getFromName(n.toString()), pos, 90);
		} catch (Exception e) {
			addDrumHit(track, MusicUtils.DrumElement.AcousticBassDrum, pos, 0);
		}
	}
	
	private Beat applyPatternModification(Section s, int i, int j) {
		for (PatternModification m : s.getPatternModifications()) {
			if (j == m.getBeatNumber()) {
				if (m.getEveryIteration() == -1) {
					if (i >= m.getIterationBegin() && i <= m.getIterationEnd()) {
						return m.getBeat();
					}
				} else if ((i % m.getEveryIteration()) == 0) {
					return m.getBeat();
				}
			}
		}
		return null;
	}

	private double applyOffset(rhythmML.Track t, DRUM_NOTES n, Beat b) {
		for (NoteOffset o : t.getOffsets()) {
			if (n.getName().equals(((DrumNote) o.getNote()).getDrumNote().getName())) {
				return (o.getValue() * 1.0 / b.getTicks().size()) * 50;
			}
		}
		return 0.0;
	}

	private double applyOffset(rhythmML.Track t, NOTES n, Beat b) {
		for (NoteOffset o : t.getOffsets()) {
			if (n.getName().equals(((ClassicNote) o.getNote()).getNote().getName())) {
				return (o.getValue() * 1.0 / b.getTicks().size()) * 50;
			}
		}
		return 0.0;
	}

	public static void analyzeSequence(Sequence sequence) {
		int trackNumber = 0;
		for (Track track : sequence.getTracks()) {
			trackNumber++;
			System.out.println("Track " + trackNumber + ": size = " + track.size());
			System.out.println();
			for (int i = 0; i < track.size(); i++) {
				MidiEvent event = track.get(i);
				System.out.print("@" + event.getTick() + " ");
				MidiMessage message = event.getMessage();
				if (message instanceof ShortMessage) {
					ShortMessage sm = (ShortMessage) message;
					System.out.print("Channel: " + sm.getChannel() + " ");
					if (sm.getCommand() == NOTE_ON) {
						int key = sm.getData1();
						int octave = (key / 12) - 1;
						int note = key % 12;
						String noteName = NOTE_NAMES[note];
						int velocity = sm.getData2();
						System.out.println("Note on, " + noteName + octave + " key=" + key + " velocity: " + velocity);
					} else if (sm.getCommand() == NOTE_OFF) {
						int key = sm.getData1();
						int octave = (key / 12) - 1;
						int note = key % 12;
						String noteName = NOTE_NAMES[note];
						int velocity = sm.getData2();
						System.out.println("Note off, " + noteName + octave + " key=" + key + " velocity: " + velocity);
					} else {
						System.out.println("Command:" + sm.getCommand());
					}
				} else {
					System.out.println("Other message: " + message.getClass());
				}
			}

			System.out.println();

		}

	}

}
