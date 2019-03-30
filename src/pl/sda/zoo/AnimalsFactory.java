package pl.sda.zoo;

import pl.sda.zoo.animals.Animal;
import pl.sda.zoo.animals.Mammal;

import java.util.ArrayList;
import java.util.List;

public class AnimalsFactory {
    public static List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<>();

        // ANIMALS
        animals.add(new Mammal("Leo", "Whrrroaaa", "Lion"));
        animals.add(new Mammal("Jurek", "Whiii", "Elephant"));

        animals.add(new Mammal("Burek", "Whof", "Police Dog"));
        animals.add(new Mammal("Wiesław", "Hejo", "Nosacz Sundajski"));


        animals.add(new Mammal("ZENEK", "AAAAA", "Rabit"));
        animals.add(new Mammal("Romek", "BeBeBe", "Dragon"));
        animals.add(new Mammal("Tytus", "Kwi", "coś"));
        animals.add(new Mammal("Atomek", "Ble", "ktoś"));
        animals.add(new Mammal("Tytus2", "Kwi", "coś"));
        animals.add(new Mammal("Atomek2", "Ble", "ktoś"));


        animals.add(new Mammal("Roman Kwiatkowski", "Woof", "Police Dog"));
        animals.add(new Mammal("Aldona", "Kraaa", "Wrona"));


        return animals;
    }
}
