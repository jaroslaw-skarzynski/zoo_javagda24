package pl.sda.zoo.animals;

public class Fish implements Animal{
    @Override
    public String getName() {
        return "Nemo";
    }

    @Override
    public String makeNoise() {
        return "Bullbull hello";
    }

    @Override
    public String getSpecies() {
        return "Błazenek";
    }

    @Override
    public String getType() {
        return "Fish";
    }
}
