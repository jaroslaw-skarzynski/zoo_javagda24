package pl.sda.zoo.animals;

import java.util.Currency;

public interface Animal {
    String getName();

    String makeNoise();

    String getSpecies();

    public String getType();

    boolean canFly();

    boolean canSwim();
}
