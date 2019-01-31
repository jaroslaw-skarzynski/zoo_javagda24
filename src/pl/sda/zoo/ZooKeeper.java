package pl.sda.zoo;

import pl.sda.zoo.animals.Animal;

import java.util.List;

public class ZooKeeper {
    public static void main(String[] args) {
        List<Animal> animals = AnimalsFactory.getAnimals();
        for (Animal animal : animals) {
            String message = String.format("%s[%s] of name: %s says: %s", animal.getSpecies(), animal.getType(), animal.getName(), animal.makeNoise());
            System.out.println(message);
        }
    }
}
