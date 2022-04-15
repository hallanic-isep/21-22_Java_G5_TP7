package isep.hal;

import java.util.ArrayList;
import java.util.List;

public class Player {

    public Player() {
        this.pokemons = new ArrayList<>();
    }

    public List<String> getPokemons() {
        return pokemons;
    }

    private List<String> pokemons;
    // Sans constructeur : private List<String> pokemons = new ArrayList<>();

}
