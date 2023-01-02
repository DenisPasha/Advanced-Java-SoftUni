package P06DefiningClasses.Exercises.PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String trainerName;
    private List<Pokemon> pokemonList = new ArrayList<>();
    private int numOfBadges=0;

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public int getNumOfBadges() {
        return numOfBadges;
    }

    public void setNumOfBadges(int numOfBadges) {
        this.numOfBadges = numOfBadges;
    }
}
