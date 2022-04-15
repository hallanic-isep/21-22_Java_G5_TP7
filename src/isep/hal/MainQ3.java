package isep.hal;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

// Question 3
public class MainQ3 {

    public static void main(String[] args) {
	    Player alex = new Player();

        Map<String,Professor> register = new HashMap<>();
        register.put("Sorbier", Professor.createProfessorSorbier());
        register.put("Seko", Professor.createProfessorSeko());
        register.put("Chen", Professor.createProfessorChen());
        System.out.println(register);

        String profName;
        while (true) {
            try {
                System.out.print("Professeur ? ");
                Scanner scanner = new Scanner(System.in);
                profName = scanner.nextLine();
                if ( ! register.containsKey(profName)) {
                    throw new RuntimeException("Ce professeur n'existe pas...");
                }
                break;
            }
            catch (RuntimeException exception) {
                System.out.println(exception);
            }
        }

        register.get(profName).askForPokemon();
    }
}
