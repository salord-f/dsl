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
import rhythmML.Composition;
import rhythmML.DRUM_NOTES;
import rhythmML.PatternLoop;
import rhythmML.PatternModification;
import rhythmML.Rhythm;
import rhythmML.Section;

import static rhythmML.generator.DrumerUtils.addDrumHit;
import static rhythmML.generator.DrumerUtils.toTick;

public class Generator {

    private StringBuilder builder;

    public String getResult() {
        return builder.toString();
    }

    public Generator() {
        this.builder = new StringBuilder();
    }

    private void write(String s) {
        builder.append(String.format("%s\n", s));
    }

    public static final String[] NOTE_NAMES = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
    public static final int NOTE_ON = 0x90;
    public static final int NOTE_OFF = 0x80;
    
    
    public void generate(Rhythm rhythm) throws MidiUnavailableException, IOException, InvalidMidiDataException {
        write("// MIDI code generation");
        write(String.format("// Rhythm name: %s\n", rhythm.getName()));

        rhythm.getTracks().get(0).getSections().get(0).getPatternLoops().get(0).getPattern().getBeats().get(0).getTicks().get(0).getValue();
        
        Sequencer sequencer = MidiSystem.getSequencer();
        sequencer.open();
        
        int tempo = rhythm.getBPM();
        write("" + tempo);
        write(rhythm.getName());
        Sequence sequence = generateSequence(rhythm);
        File f = new File("./result/" + rhythm.getName() + ".mid");
        MidiSystem.write(sequence,1,f);
        
        Sequence sequence2 = MidiSystem.getSequence(new File("./result/" + rhythm.getName() + ".mid"));

        sequencer.setSequence(sequence2);
        sequencer.setTempoInBPM(tempo);
        sequencer.start();


        analyzeSequence(sequence2);

        //int durationOfTheTrackMS = nbBar * nbBeatPerBar * 60000 / tempo;
        //System.out.println("sleeping " + (durationOfTheTrackMS) + "ms");
        //Thread.sleep(durationOfTheTrackMS);
        //System.out.println("stop sleeping");
        //seq1uencer.stop();
        //sequencer.close();
        while (true);
    }
    
    public Sequence generateSequence(Rhythm rhythm) throws InvalidMidiDataException {
    	
    	
        int nbBar = 5;
        int nbBeatPerBar = 2;
        int resolution = 200; // in slices per beat

        Sequence sequence = new Sequence(Sequence.PPQ, resolution);
        Track track = sequence.createTrack();
        int bar = 0;
        int beat = 0;
        double tickPos = 0;
        
        // TODO : refactor this crap
        for (rhythmML.Track t : rhythm.getTracks()) {
        	Composition c = t.getComposition();
        	for (Section s : c.getSections()) {
        		for (PatternLoop p : s.getPatternLoops()) {
        			for(int i = 0; i < p.getLoopNumber(); i++) {
        				EList<Beat> beats = p.getPattern().getBeats();
        				for(int j = 0; j < beats.size(); j++) {
        					
        					Beat b = beats.get(j);
        					for(PatternModification m : s.getPatternModifications()) {
        						if(i == m.getIteration() && j == m.getBeatNumber()) {
        							b = m.getBeat();
        						}
        	        		}
        					
            				for(DRUM_NOTES tick : b.getTicks()) {
            					System.out.println(tick.getName());
            					int pos = toTick(bar, beat, tickPos, nbBeatPerBar, resolution, 0.5);
            					switch (tick) {
	            					case BD:
	            		                addDrumHit(track, DrumerUtils.DrumElement.AcousticBassDrum, pos, 90);
	            		                break;
	    							case CC:
	    								break;
	    							case CH:
	            		                addDrumHit(track, DrumerUtils.DrumElement.ClosedHiHat, pos, 90);
	    								break;
	    							case OH:
	    								break;
	    							case RC:
	    								break;
	    							case SD:
	    				                addDrumHit(track, DrumerUtils.DrumElement.ElectricSnare, pos, 90);
	    								break;
	    							case BLANK:
	    								break;
	    							default:
	    								break;
            					}
            					// TODO : remove hardcoded value
            					tickPos += 0.25;
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

        /*
          for (int bar = 0; bar < nbBar; bar++) {
         
            for (int beat = 0; beat < nbBeatPerBar; beat += 5) {
                int pos = toTick(bar, beat, 0, nbBeatPerBar, resolution, 0.5);
                addDrumHit(track, DrumerUtils.DrumElement.AcousticBassDrum, pos, 90);

                int pos2 = toTick(bar, beat + 1, 0, nbBeatPerBar, resolution, 0.5);
                addDrumHit(track, DrumerUtils.DrumElement.AcousticBassDrum, pos2, 90);
            }
        }

        for (int bar = 0; bar < nbBar; bar++) {
            for (int beat = 0; beat < nbBeatPerBar; beat += 5) {
                int pos = toTick(bar, beat, 0.75, nbBeatPerBar, resolution, 0.5);
                addDrumHit(track, DrumerUtils.DrumElement.ElectricSnare, pos, 90);

                int pos2 = toTick(bar, beat + 1, 0.75, nbBeatPerBar, resolution, 0.5);
                addDrumHit(track, DrumerUtils.DrumElement.ElectricSnare, pos2, 90);
            }
        }
        */

        return sequence;
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
