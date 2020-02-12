package fr.polytech.unice.deantoni.midi.tests;

import com.sun.media.sound.DLSInstrument;

import javax.sound.midi.*;
import java.io.File;
import java.io.IOException;

import static javax.sound.midi.ShortMessage.NOTE_OFF;
import static javax.sound.midi.ShortMessage.NOTE_ON;

public class MyMidiPlayer{

    public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, InterruptedException, IOException {


        try (Sequencer sequencer = MidiSystem.getSequencer()) {
            sequencer.open();
            sequencer.setTempoInBPM(400.0f);
            Sequence sequence = new Sequence(Sequence.PPQ, 1);
            Track track = sequence.createTrack();

            ShortMessage noteOnMsg = new ShortMessage();
            noteOnMsg.setMessage(NOTE_ON, 9, DrumElement.BassDrum1.noteNumber, 110);

            ShortMessage noteOnMsg2 = new ShortMessage();
            noteOnMsg2.setMessage(NOTE_ON, 9, DrumElement.AcousticSnare.noteNumber, 110);


            ShortMessage noteOffMsg = new ShortMessage();
            noteOffMsg.setMessage(NOTE_OFF, 9, DrumElement.BassDrum1.noteNumber, 100);

            ShortMessage noteOffMsg2 = new ShortMessage();
            noteOffMsg2.setMessage(NOTE_OFF, 9, DrumElement.AcousticSnare.noteNumber, 100);

            //track.add();

            //makeEvent(144, 1, i, 100, i);

            for (int x = 0; x < 50; x += 2){
                track.add(new MidiEvent(noteOnMsg, x * 5));
                track.add(new MidiEvent(noteOffMsg, x * 5 + 1));
                track.add(new MidiEvent(noteOnMsg2, (x + 1) * 5));
                track.add(new MidiEvent(noteOffMsg2, (x + 1) * 5 + 1));
            }
            //track.add(new MidiEvent(noteOffMsg, 30));
            //sequencer.setSequence(sequence);


            File f = new File("mid\\midifile.mid");
            MidiSystem.write(sequence,1,f);

            Sequence sequence2 = MidiSystem.getSequence(new File("mid\\midifile.mid"));
            analyzeSequence(sequence2);
            sequencer.setSequence(sequence2);
            sequencer.start();
            Thread.sleep(50000);
            //sequencer.stop();
        }

    }

    public static final int NOTE_ON = 0x90;
    public static final int NOTE_OFF = 0x80;

    /*
        DO   RÉ  MI  FA  SOL LA  SI
        C    D   E   F   G   A   B
    */
    public static final String[] NOTE_NAMES = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};

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
    public enum DrumElement {
        AcousticBassDrum(35), BassDrum1(36), SideStick(37), AcousticSnare(38), HandClap(39), ElectricSnare(40),
        LowFloorTom(41), ClosedHiHat(42), OpenHiHat(46);

        /*
         * "High floor tom", "Pedal hi-hat", "Low tom", "Open hi-hat", "Low-mid tom",
         * "Hi-mid tom", "Crash cymbal 1", "High tom", "Ride cymbal 1",
         * "Chinese cymbal", "Ride bell", "Tambourine", "Splash cymbal", "Cowbell",
         * "Crash cymbal 2", "Vibraslap", "Ride cymbal 2", "Hi bongo", "Low bongo",
         * "Mute hi conga", "Open hi conga", "Low conga", "High timbale", "Low timbale",
         * "High agogo", "Low agogo", "Cabasa", "Maracas", "Short whistle",
         * "Long whistle", "Short guiro", "Long guiro", "Claves", "Hi wood block",
         * "Low wood block", "Mute cuica", "Open cuica", "Mute triangle",
         * "Open triangle" };
         */
        public int noteNumber;

        private DrumElement(int noteNumber) {
            this.noteNumber = noteNumber;
        }
    }

} 