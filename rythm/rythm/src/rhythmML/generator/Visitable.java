package rhythmML.generator;

public interface Visitable {

    @SuppressWarnings("rawtypes")
    void accept(Visitor visitor);
}
