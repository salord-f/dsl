package rhythmML.generator;

import rhythmML.Rhythm;

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


    public void generate(Rhythm rhythm) {
        write("// MIDI code generation");
        write(String.format("// Rhythm name: %s\n", rhythm.getName()));
    }
}
