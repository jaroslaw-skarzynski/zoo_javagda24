package pl.sda.zoo;

import pl.sda.zoo.animals.Animal;
import pl.sda.zoo.animals.Mammal;

import java.util.ArrayList;
import java.util.List;

public class AnimalsFactory {
    public static List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Mammal("Leo", "Whrrroaaa", "Lion"));
        animals.add(new Mammal("Jurek", "Whiii", "Elephant"));
        animals.add(new Mammal("Zenon", "Wrrrr", "Pig"));
        animals.add(new Mammal("Wacek", "Grrrr", "Dog"));
        animals.add(new Mammal("Wacek2", "Grrrr", "Dog"));

        return animals;
    }
}
