package pl.sda.zoo;

import pl.sda.zoo.animals.Animal;
import pl.sda.zoo.animals.Fish;
import pl.sda.zoo.animals.Mammal;

import java.util.ArrayList;
import java.util.List;

public class AnimalsFactory {
    public static List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Mammal("Leo", "Whrrroaaa", "Lion"));
        animals.add(new Mammal("Jurek", "Whiii", "Elephant"));
        animals.add(new Mammal("Hania", "UuuuEE", "Hippo"));
        animals.add(new Mammal("Chian Ho", "Omnomnom", "Panda"));
        animals.add(new Fish("Nemo", "bulbul", "Błazenek"));
        animals.add(new Fish("Sebastian", "ruururu", "Dolphin"));

        return animals;
    }
}
