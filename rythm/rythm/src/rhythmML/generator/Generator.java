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

import rhythmML.Beat;
import rhythmML.ClassicNote;
import rhythmML.Composition;
import rhythmML.DRUM_NOTES;
import rhythmML.DrumNote;
import rhythmML.NOTES;
import rhythmML.Note;
import rhythmML.NoteOffset;
import rhythmML.PatternLoop;
import rhythmML.PatternModification;
import rhythmML.Rhythm;
import rhythmML.Section;
import rhythmML.Tick;
import rhythmML.generator.DrumerUtils.InstrumentElement;
import rhythmML.impl.ClassicTrackImpl;
import rhythmML.impl.DrumTrackImpl;

import static rhythmML.generator.DrumerUtils.addDrumHit;
import static rhythmML.generator.DrumerUtils.addHit;
import static rhythmML.generator.DrumerUtils.toTick;

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
		double offsetNote = 0.05;

		// TODO : refactor this crap
		for (rhythmML.Track t : rhythm.getTracks()) {
			Composition c = t.getComposition();

			if (t instanceof DrumTrackImpl) {
				// special case as we have to use the dedicated track 10
			} else if (t instanceof ClassicTrackImpl) {
				String instrument = (((ClassicTrackImpl) t).getInstrument());
				InstrumentElement instrumentElement = DrumerUtils.InstrumentElement.convert(instrument);
				DrumerUtils.setInstrument(track, instrumentElement);
			}

			for (Section s : c.getSections()) {
				for (PatternLoop p : s.getPatternLoops()) {
					EList<Beat> beats = p.getPattern().getBeats();
					for (int i = 0; i < p.getLoopNumber(); i++) {
						for (int j = 0; j < beats.size(); j++) {
							Beat b = beats.get(j);

							for (PatternModification m : s.getPatternModifications()) {
								// TODO check if working
								if (m.getEveryIteration() == -1) {
									if (i >= m.getIterationBegin() && i <= m.getIterationEnd()
											&& j == m.getBeatNumber()) {
										b = m.getBeat();
									}
								} else {
									if (j == m.getBeatNumber() && (i % m.getEveryIteration()) == 0) {
										b = m.getBeat();
									}
								}
							}

							for (Tick tick : b.getTicks()) {
								for (Note note : tick.getNotes()) {
									double offset = 0.0;

									if (note instanceof DrumNote) {
										DRUM_NOTES n = ((DrumNote) note).getDrumNote();

										for (NoteOffset o : t.getOffsets()) {
											if (n.getName().equals(((DrumNote) o.getNote()).getDrumNote().getName())) {
												offset = o.getValue() * resolution / b.getTicks().size();
												System.out.println(offset);
												break;
											}
										}

										System.out.println(n.getName());
										int pos = toTick(bar, beat, tickPos, beats.size(), resolution, offset,
												offsetNote);
										addDrumNote(track, 9, n, pos);

									} else if (note instanceof ClassicNote) {

										NOTES n = ((ClassicNote) note).getNote();
										int pitch = note.getPitch();
										System.out.println("pitch : " + pitch);

										for (NoteOffset o : t.getOffsets()) {
											if (n.getName().equals(((ClassicNote) o.getNote()).getNote().getName())) {
												offset = (o.getValue() * 1.0 / b.getTicks().size()) * 50;
												System.out.println(offset);
												break;
											}
										}
										System.out.println(n.getName());
										int pos = toTick(bar, beat, tickPos, beats.size(), resolution, offset,
												offsetNote);
										addNote(track, n, pos, pitch);
									}
								}
								tickPos += 1.0 / b.getTicks().size();
								// System.out.println(tickPos);
							}

							tickPos = 0;
							beat++;
						}
						beat = 0;
						bar++;
					}

				}
			}
		}

		return sequence;
	}

	private void addNote(Track track, NOTES n, int pos, int pitch) {
		switch (n) {
		case DO:
			addHit(track, DrumerUtils.Element.DO, pos, 90, pitch);
			break;
		case DO_SHARP:
			addHit(track, DrumerUtils.Element.DO_SHARP, pos, 90, pitch);
			break;
		case FA:
			addHit(track, DrumerUtils.Element.FA, pos, 90, pitch);
			break;
		case FA_SHARP:
			addHit(track, DrumerUtils.Element.FA_SHARP, pos, 90, pitch);
			break;
		case LA:
			addHit(track, DrumerUtils.Element.LA, pos, 90, pitch);
			break;
		case LA_SHARP:
			addHit(track, DrumerUtils.Element.LA_SHARP, pos, 90, pitch);
			break;
		case MI:
			addHit(track, DrumerUtils.Element.MI, pos, 90, pitch);
			break;
		case RE:
			addHit(track, DrumerUtils.Element.RE, pos, 90, pitch);
			break;
		case RE_SHARP:
			addHit(track, DrumerUtils.Element.RE_SHARP, pos, 90, pitch);
			break;
		case SI:
			addHit(track, DrumerUtils.Element.SI, pos, 90, pitch);
			break;
		case SOL:
			addHit(track, DrumerUtils.Element.SOL, pos, 90, pitch);
			break;
		case SOL_SHARP:
			addHit(track, DrumerUtils.Element.SOL_SHARP, pos, 90, pitch);
			break;
		default:
			break;
		}
	}

	private void addDrumNote(Track track, int chan, DRUM_NOTES n, int pos) {
		switch (n) {
		case BD:
			addDrumHit(track, DrumerUtils.DrumElement.AcousticBassDrum, pos, 90);
			break;
		case CC:
			addDrumHit(track, DrumerUtils.DrumElement.CrashCymbal, pos, 90);
			break;
		case CH:
			addDrumHit(track, DrumerUtils.DrumElement.ClosedHiHat, pos, 90);
			break;
		case OH:
			addDrumHit(track, DrumerUtils.DrumElement.OpenHiHat, pos, 90);
			break;
		case RC:
			addDrumHit(track, DrumerUtils.DrumElement.RideCymbal, pos, 90);
			break;
		case SD:
			addDrumHit(track, DrumerUtils.DrumElement.ElectricSnare, pos, 90);
			break;
		case BLANK:
			addDrumHit(track, DrumerUtils.DrumElement.AcousticBassDrum, pos, 0);
			break;
		default:
			break;
		}
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
