package pl.sda.zoo.animals;

public class Bird implements Animal {
    private static final String TYPE = "Bird";
    private String name;
    private String noise;
    private String species;

    public Bird(String name, String noise, String species) {
        this.name = name;
        this.noise = noise;
        this.species = species;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String makeNoise() {
        return noise;
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public String getType() {
        return TYPE;
    }
}
