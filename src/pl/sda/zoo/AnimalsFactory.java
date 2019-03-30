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
        animals.add(new Mammal("Bartek", "uuu-haaa", "Monkey"));
        animals.add(new Mammal("Halina", "wrrrrr", "Tiger"));
        animals.add(new Mammal("Janusz", "prrrrr", "Horse"));
        animals.add(new Mammal("Wiesław", "hauhau", "Dog"));
        animals.add(new Mammal("Konstanty", "miau", "Cat"));

        return animals;
    }
}
