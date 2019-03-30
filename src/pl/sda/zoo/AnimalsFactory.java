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
        animals.add(new Mammal("Adam", "Wrrr", "Elephant"));
        animals.add(new Mammal("Adam2", "Wrrr", "Elephant"));
        animals.add(new Mammal("Adam3", "Wrrr", "Elephant"));
        animals.add(new Mammal("Tigru", "Wryy", "Tiger"));
        animals.add(new Mammal("Wanda", "mute", "Fish"));
        animals.add(new Mammal("Ptasiek", "ćwirćwir", "Bird"));


        return animals;
    }
}
