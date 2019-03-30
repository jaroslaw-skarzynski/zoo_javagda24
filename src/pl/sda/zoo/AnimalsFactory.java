package pl.sda.zoo;

import pl.sda.zoo.animals.Animal;
import pl.sda.zoo.animals.Bird;

import java.util.ArrayList;
import java.util.List;

public class AnimalsFactory {
    public static List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Bird("ćwirek", "ćwir ćwir", "Sparrow"));
        animals.add(new Bird("bociek", "kle kle", "Stork"));

        return animals;
    }
}
