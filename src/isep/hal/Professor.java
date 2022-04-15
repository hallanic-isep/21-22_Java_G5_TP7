package isep.hal;

import java.util.Scanner;

import static isep.hal.Pokemon.*;

public class Professor extends Player {

    public static Professor createProfessorSorbier() {
        return new Professor(TIPLOUF, OUISTICRAM, TORTIPOUSS);
    }

    public static Professor createProfessorSeko() {
        return new Professor(ARCKO, POUSSIFEU, GOBOU);
    }

    public static Professor createProfessorChen() {
        return new Professor(BULBIZARRE, SALAMECHE, CARAPUCE);
    }

    public Pokemon askForPokemon() {

        System.out.println("Quel Pokemon ?");
        for (int i = 0; i < this.getPokemons().size(); i++) {
            System.out.printf("%d: %s\n", i, this.getPokemons().get(i));
        }

        int index;
        while (true) {
            try {
                System.out.print("=> ");
                Scanner scanner = new Scanner(System.in);
                index = scanner.nextInt();
                System.out.println("Vous avez choisi " + this.getPokemons().get(index));
                break;
            }
            catch (java.util.InputMismatchException exception) {
                System.out.println("Il faut saisir un nombre...");
            }
            catch (java.lang.IndexOutOfBoundsException exception) {
                System.out.println(exception.getMessage());
            }
            finally {
                System.out.println("Controle termine...");
            }
        }

        Pokemon pokemon = this.getPokemons().remove(index);
        return pokemon;
    }

    private Professor(Pokemon ... pokemons) {
        for (Pokemon pokemon: pokemons) {
            this.getPokemons().add(pokemon);
        }
    }
}
