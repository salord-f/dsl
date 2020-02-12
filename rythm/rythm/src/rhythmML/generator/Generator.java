package rhythmML.generator;

import rhythmML.Rhythm;

public class Generator extends Visitor<StringBuilder> {

    public Generator() {
        super.result = new StringBuilder();
    }

    private void write(String s) {
        result.append(String.format("%s\n", s));
    }


    @Override
    public void visit(Rhythm rhythm) {
        write("// MIDI code generation");
        write(String.format("// Rhythm name: %s\n", rhythm.getName()));
    }
}
