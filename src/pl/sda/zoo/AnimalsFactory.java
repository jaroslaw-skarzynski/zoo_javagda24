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
        animals.add(new Mammal("Azor", "Wow wow wow", "Dog"));
        animals.add(new Mammal("Burek", "Wow", "Dog"));
        animals.add(new Mammal("Lew", "wrr", "Lion"));


        return animals;
    }
}
