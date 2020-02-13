package rhythmML;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import rhythmML.generator.Generator;
import rhythmML.util.RhythmMLSwitch;

public class RhythmMLSwitchPrinter extends RhythmMLSwitch<String> {

    private Generator generator;

    public RhythmMLSwitchPrinter() {
        this.generator = new Generator();
    }

    @Override
    public String caseRhythm(Rhythm rhythm) {
        try {
			generator.generate(rhythm);
		} catch (MidiUnavailableException | IOException | InvalidMidiDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return generator.getResult();
    }
}