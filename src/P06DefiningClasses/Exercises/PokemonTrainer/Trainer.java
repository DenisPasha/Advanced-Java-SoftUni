package P06DefiningClasses.Exercises.PokemonTrainer;

import java.util.List;

public class Trainer {

    private String name;
    private  int badges;
    private List<Pokemon> pokemon;

    public Trainer(String name, List<Pokemon> pokemon) {
        this.name = name;
        this.pokemon = pokemon;
        this.badges = 0;
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public String getName() {
        return name;
    }

    public int getBadges() {
        return badges;
    }


}
