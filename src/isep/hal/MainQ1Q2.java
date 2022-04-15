package isep.hal;

import java.util.Random;

public class MainQ1Q2 {

    // Question 1
    public static void main(String[] args) {
	    Player alex = new Player();
        Professor sorbier = Professor.createProfessorSorbier();
        System.out.println(sorbier.getPokemons());

        // Question 2...
        Random random = new Random();
        int index = random.nextInt( sorbier.getPokemons().size() );
        sorbier.getPokemons().remove( index );
        // Version sur une seule instruction :
        //      sorbier.getPokemons().remove(
        //         ( new Random() ).nextInt( sorbier.getPokemons().size() )
        //      );
        // ...Question 2

        sorbier.askForPokemon();
        System.out.println(sorbier.getPokemons());
    }
}
