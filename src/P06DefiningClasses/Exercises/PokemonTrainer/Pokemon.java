package P06DefiningClasses.Exercises.PokemonTrainer;

public class Pokemon {

    private String pokemonName;
    private String pokemonElement;
    private int pokemonHealth;

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public String getPokemonElement() {
        return pokemonElement;
    }

    public void setPokemonElement(String pokemonElement) {
        this.pokemonElement = pokemonElement;
    }

    public int getPokemonHealth() {
        return pokemonHealth;
    }

    public void setPokemonHealth(int pokemonHealth) {
        this.pokemonHealth = pokemonHealth;
    }
}
