package rhythmML.generator;

import rhythmML.Rhythm;

public abstract class Visitor<T> {

    protected T result;

    public T getResult() {
        return result;
    }

    public abstract void visit(Rhythm rhythm);
}
