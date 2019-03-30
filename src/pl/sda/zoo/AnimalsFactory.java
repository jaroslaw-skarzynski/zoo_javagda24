package pl.sda.zoo;

import pl.sda.zoo.animals.Animal;
import pl.sda.zoo.animals.Bird;
import pl.sda.zoo.animals.Fish;
import pl.sda.zoo.animals.Mammal;

import java.util.ArrayList;
import java.util.List;

public class AnimalsFactory {
    public static List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Mammal("Leo", "Whrrroaaa", "Lion"));
        animals.add(new Mammal("Jurek", "Whiii", "Elephant"));
        animals.add(new Mammal("piesekleszek", "hau hau", "Dog"));
        animals.add(new Mammal("Kasia", "hihi", "Żyrafa"));
        animals.add(new Mammal("Wacek", "wof wof", "Nosorn"));

        animals.add(new Mammal("Edek", "rrrr", "Hedgehog"));
        animals.add(new Bird ("Kelly", "ćwirrr", "Dove"));
        animals.add(new Bird("Fiona", "ćwiiii", "Duck"));

        return animals;
    }
}
