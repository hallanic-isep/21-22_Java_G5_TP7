package isep.hal;

import java.util.ArrayList;
import java.util.List;

public class Player {

    public Player() {
        this.pokemons = new ArrayList<>();
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    private List<Pokemon> pokemons;
    // Sans constructeur : private List<Pokemon> pokemons = new ArrayList<>();

}
