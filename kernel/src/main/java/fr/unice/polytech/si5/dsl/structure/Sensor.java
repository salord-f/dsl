package fr.unice.polytech.si5.dsl.structure;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public abstract class Sensor<T> extends Brick<Sensor> {
}
