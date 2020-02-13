/**
* --------------------------------------------------------------------------------------
* "THE BEER-WARE LICENSE" (Revision 42):
* Julien Deantoni and Luc Hogie wrote this file.  As long as you retain this notice you
* can do whatever you want with this stuff. If we meet some day, and you think
* this stuff is worth it, you can buy me/us a beer in return. 
* --------------------------------------------------------------------------------------
**/

package rhythmML.generator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Soundbank;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.Track;
import javax.sound.midi.Transmitter;


public class DrumerUtils {
	/**
	 * load a new soundBank
	 * @param sequencer
	 * @param soundBankPath
	 * @throws FileNotFoundException
	 * @throws InvalidMidiDataException
	 * @throws IOException
	 * @throws MidiUnavailableException
	 */
	private static void loadSoundbank(Sequencer sequencer, String soundBankPath)
			throws FileNotFoundException, InvalidMidiDataException, IOException, MidiUnavailableException {
		FileInputStream fis = new FileInputStream(new File(soundBankPath));
		BufferedInputStream bis = new BufferedInputStream(fis);
		Soundbank soundfont = MidiSystem.getSoundbank(bis);
		Synthesizer synthesizer = MidiSystem.getSynthesizer();

		sequencer.open();
		synthesizer.open();

		System.out.println(Arrays.toString(synthesizer.getAvailableInstruments()));

		synthesizer.loadAllInstruments(soundfont);

		System.out.println("##############################################################");
		System.out.println(Arrays.toString(synthesizer.getAvailableInstruments()));

		for (Transmitter tm : sequencer.getTransmitters()) {
			tm.close();
		}
		sequencer.getTransmitter().setReceiver(synthesizer.getReceiver());
		return;
	}

	/**
	 * give the ``global'' tick position based on the relatives bar, beat and tick numbers; for a specific settings in term of numbers of beats per Bar and the chosen resolution
	 * @param bar
	 * @param beat
	 * @param division
	 * @param nbBeatPerBar
	 * @param resolution
	 * @return
	 */
	public static int toTick(int bar, int beat, double division, int nbBeatPerBar, int resolution, double offset) {
		int pos = bar * nbBeatPerBar * resolution;
		pos += beat * resolution;
		pos += division * resolution;
		pos += offset * resolution;
		return pos;
	}

	/**
	 * add a note on a drum element at a specific beat(tick)
	 *
	 * @param note the {@link DrumElement} id
	 * @param tick the beat where the kick appends
	 */
	public static void addDrumHit(Track track, DrumElement de, long tick, int velocity) {
		final int NOTEON = 144;
		final int NOTEOFF = 128;

		createEvent(track, NOTEON, 9, de, tick, velocity);
		createEvent(track, NOTEOFF, 9, de, tick + 1, velocity);
	}

	/**
	 * create a MIDI message in the current Track
	 * @param track
	 * @param type
	 * @param chan
	 * @param de
	 * @param tick
	 * @param velocity
	 */
	private static void createEvent(Track track, int type, int chan, DrumElement de, long tick, int velocity) {
		ShortMessage message = new ShortMessage();

		try {
			message.setMessage(type, chan, de.noteNumber, velocity);
			MidiEvent event = new MidiEvent(message, tick);
			track.add(event);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Partial list of Drum elements to ease the reading
	 */
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
