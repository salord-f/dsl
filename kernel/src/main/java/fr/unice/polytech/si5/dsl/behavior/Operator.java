package fr.unice.polytech.si5.dsl.behavior;

public enum Operator {
    OR("||"), AND("&&");

    public String value;

    Operator(String value) {
        this.value = value;
    }
}