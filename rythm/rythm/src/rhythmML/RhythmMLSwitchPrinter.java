package rhythmML;

import rhythmML.generator.Generator;
import rhythmML.util.RhythmMLSwitch;

public class RhythmMLSwitchPrinter extends RhythmMLSwitch<String> {

    private Generator generator;

    public RhythmMLSwitchPrinter() {
        this.generator = new Generator();
    }

    @Override
    public String caseRhythm(Rhythm rhythm) {
        generator.generate(rhythm);
        return generator.getResult();
    }
}