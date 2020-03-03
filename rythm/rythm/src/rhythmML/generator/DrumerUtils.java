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
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Soundbank;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.Track;
import javax.sound.midi.Transmitter;

public class DrumerUtils {
	/**
	 * load a new soundBank
	 * 
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
	 * give the ``global'' tick position based on the relatives bar, beat and tick
	 * numbers; for a specific settings in term of numbers of beats per Bar and the
	 * chosen resolution
	 * 
	 * @param bar
	 * @param beat
	 * @param division
	 * @param nbBeatPerBar
	 * @param resolution
	 * @return
	 */
	public static int toTick(int bar, int beat, double division, int nbBeatPerBar, int resolution, double offset,
			double offsetNote) {
		int pos = bar * nbBeatPerBar * resolution;
		pos += beat * resolution;
		pos += division * resolution;

		//double nbTicks = resolution / nbBeatPerBar;

		/*
		 * double concreteOffset = (nbTicks * offsetNote) / 2;
		 * 
		 * pos += new Random().nextInt((int)concreteOffset * 2) - concreteOffset; if
		 * (pos < 0){ pos = 0; }
		 */
		pos += offset;
		// pos += resolution;
		return pos <= 0 ? 0 : pos;
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

		createEvent(track, NOTEON, 9, de.noteNumber, tick, velocity);
		createEvent(track, NOTEOFF, 9, de.noteNumber, tick + 1, velocity);
	}

	public static void addHit(Track track, int trackNumber, Element elem, long tick, int velocity, int pitch) {
		final int NOTEON = 144;
		final int NOTEOFF = 128;

		createEvent(track, NOTEON, trackNumber, elem.noteNumber + pitch * 12, tick, velocity);
		createEvent(track, NOTEOFF, trackNumber, elem.noteNumber + pitch * 12, tick + 1, velocity);
	}

	public static void setInstrument(Track track, InstrumentElement instrument, int trackNumero) {

		ShortMessage sm = new ShortMessage();
		try {
			// 1
			// 25
			// 115
			// 57
			// 106
			sm.setMessage(ShortMessage.PROGRAM_CHANGE, trackNumero, instrument.instrumentID, 0);
			track.add(new MidiEvent(sm, 0));
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}

	}

	/**
	 * create a MIDI message in the current Track
	 * 
	 * @param track
	 * @param type
	 * @param chan
	 * @param de
	 * @param tick
	 * @param velocity
	 */
	private static void createEvent(Track track, int type, int chan, int noteNumber, long tick, int velocity) {
		ShortMessage message = new ShortMessage();

		try {
			message.setMessage(type, chan, noteNumber, velocity);
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
		AcousticBassDrum(35), BassDrum(36), SideStick(37), AcousticSnare(38), HandClap(39), ElectricSnare(40),
		LowFloorTom(41), ClosedHiHat(42), OpenHiHat(46), CrashCymbal(49), RideCymbal(51);

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

	public enum Element {
		DO(0), DO_SHARP(1), RE(2), RE_SHARP(3), MI(4), FA(5), FA_SHARP(6), SOL(7), SOL_SHARP(8), LA(9), LA_SHARP(10),
		SI(11), BLANK(0);

		public int noteNumber;

		private Element(int noteNumber) {
			this.noteNumber = noteNumber;
		}
	}

	public enum InstrumentElement {
		piano(1), guitar(25), trumpet(57), banjo(106);

		public int instrumentID;

		private InstrumentElement(int instrumentID) {
			this.instrumentID = instrumentID;
		}

		public static InstrumentElement convert(String name) {
			InstrumentElement instrumentElement = InstrumentElement.valueOf(name);
			return instrumentElement;
		}
	}
}
