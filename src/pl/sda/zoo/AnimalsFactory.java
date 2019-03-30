package pl.sda.zoo;

import pl.sda.zoo.animals.Animal;
import pl.sda.zoo.animals.Fish;
import pl.sda.zoo.animals.Bird;
import pl.sda.zoo.animals.Mammal;

import java.util.ArrayList;
import java.util.List;

public class AnimalsFactory {
    public static List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Mammal("Leo", "Whrrroaaa", "Lion"));
        animals.add(new Mammal("Jurek", "Whiii", "Elephant"));
        animals.add(new Fish("Kasia", "BulBul", "Salomon"));
        animals.add(new Fish("Zosia", "BulBul", "Orka"));
        animals.add(new Mammal("Bartek", "uuu-haaa", "Monkey"));
        animals.add(new Mammal("Halina", "wrrrrr", "Tiger"));
        animals.add(new Mammal("Janusz", "prrrrr", "Horse"));
        animals.add(new Mammal("Wiesław", "hauhau", "Dog"));
        animals.add(new Mammal("Konstanty", "miau", "Cat"));
        animals.add(new Bird("ćwirek", "ćwir ćwir", "Sparrow"));
        animals.add(new Bird("bociek", "kle kle", "Stork"));
        animals.add(new Bird("Ziomek", "huhu huhu", "Sowa"));


        return animals;
    }
}
