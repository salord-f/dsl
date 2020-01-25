package fr.unice.polytech.si5.dsl.behavior;

public enum OPERATOR {
    NONE(""), OR("||"), AND("&&");

    public String value;

    OPERATOR(String value) {
        this.value = value;
    }
}