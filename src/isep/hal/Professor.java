package isep.hal;

import java.util.Scanner;

public class Professor extends Player {

    public Professor() {
        this.getPokemons().add("Tiplouf");
        this.getPokemons().add("Ouisticram");
        this.getPokemons().add("Tortipouss");
    }

    public String askForPokemon() {

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

        String pokemon = this.getPokemons().remove(index);
        return pokemon;
    }
}
