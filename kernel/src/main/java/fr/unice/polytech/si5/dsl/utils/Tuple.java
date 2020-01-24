package fr.unice.polytech.si5.dsl.utils;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Tuple<Left, Right> {
    private final Left left;
    private final Right right;

    public Tuple(Left left, Right right) {
        this.left = left;
        this.right = right;
    }
}