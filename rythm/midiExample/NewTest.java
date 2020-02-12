package fr.polytech.unice.deantoni.midi.tests;

import javax.sound.midi.*;
import java.io.File;
import java.io.IOException;

import static fr.polytech.unice.deantoni.midi.tests.DrumerUtils.addDrumHit;
import static fr.polytech.unice.deantoni.midi.tests.DrumerUtils.toTick;
import static fr.polytech.unice.deantoni.midi.tests.MyMidiPlayer.analyzeSequence;

public class NewTest {

    public static void main(String[] args)
            throws InvalidMidiDataException, MidiUnavailableException, InterruptedException, IOException {
        Sequencer sequencer = MidiSystem.getSequencer();
        sequencer.open();

        int tempo = 80;
        Sequence sequence = test2();

        File f = new File("mid\\midifile.mid");
        MidiSystem.write(sequence,1,f);

        Sequence sequence2 = MidiSystem.getSequence(new File("mid\\midifile.mid"));

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

    public static Sequence test2() throws InvalidMidiDataException {
        int nbBar = 5;
        int nbBeatPerBar = 2;
        int resolution = 200; // in slices per beat

        Sequence sequence = new Sequence(Sequence.PPQ, resolution);
        Track track = sequence.createTrack();

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

        return sequence;
    }

    public static Sequence test1() throws InvalidMidiDataException {

        System.out.println("start");
        int tempo = 80;
        int nbBar = 2;
        int nbBeatPerBar = 4;
        int resolution = 200; // in slices per beat
        Sequence sequence = new Sequence(Sequence.PPQ, resolution);
        Track track = sequence.createTrack();

        // set kick drum
        for (int bar = 0; bar < nbBar; bar++) {
            for (int beat = 0; beat < nbBeatPerBar; beat += 2) {
                int pos = toTick(bar, beat, 0, nbBeatPerBar, resolution, 0);
                addDrumHit(track, DrumerUtils.DrumElement.AcousticBassDrum, pos, 90);
            }
        }

        // add snare drum
        for (int bar = 0; bar < nbBar; bar++) {
            for (int beat = 1; beat < 4; beat += 2) {
                int pos = toTick(bar, beat, 0, nbBeatPerBar, resolution, 0);
                addDrumHit(track, DrumerUtils.DrumElement.HandClap, pos, 100);
            }
        }

        // add hihat
        for (int bar = 0; bar < nbBar; bar++) {
            for (int beat = 0; beat < nbBeatPerBar; beat += 1) {
                for (int d = 0; d < 4; d++) {
                    int pos = toTick(bar, beat, d / 4d, nbBeatPerBar, resolution, 0);
                    int velocity = 50 + (int) (Math.random() * 50);
                    addDrumHit(track, DrumerUtils.DrumElement.ClosedHiHat, pos, velocity);
                }
            }
        }

        return sequence;

    }

}
