package guessThePokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String pokemon = "charmander";

        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuess = 0;
        Scanner scanner = new Scanner(System.in);

        // make the words blank
        for (int i = 0; i < pokemon.length(); i++) {
            wordState.add('_');
        }

        // game body
        while (wrongGuess < 5) {

            System.out.println("Guess the pokemon");
            System.out.println("*****************");
            System.out.println("Your health " + health(wrongGuess));
            // System.out.println();

            // better format for the word display
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess the pokemon's name: ");
            char userGuess = scanner.next().toLowerCase().charAt(0);
            System.out.println(userGuess);

            // check if correct
            if (pokemon.indexOf(userGuess) >= 0) {
                System.out.println("correct guess^^");
                System.out.println();

                // replacing character
                for (int i = 0; i < pokemon.length(); i++) {
                    if (pokemon.charAt(i) == userGuess) {
                        wordState.set(i, userGuess);
                    }
                }
                // all correct guess
                if (!wordState.contains('_')) {
                    System.out.print("Your health " + health(wrongGuess));
                    System.out.println("YOU GUESSED THE POKEMON");
                    System.out.println();
                    break;
                }

            } else {
                System.out.println(userGuess + " is not in the word:<");
                System.out.println();
                wrongGuess++;
            }
        }

        if (wrongGuess == 5) {
            System.out.print("Your health " + health(wrongGuess));
            System.out.println("GAME OVER");
        }
    }

    static String health (int wrongGuess) {
        return switch (wrongGuess) {
            case 0 -> """
                     [❤️❤️❤️❤️❤️]
                     """;
            case 1 -> """
                     [❤️❤️❤️❤️❤]
                     """;
            case 2 -> """
                     [❤️❤️❤️❤❤]
                     """;
            case 3 -> """
                     [❤️❤️❤❤❤]
                     """;
            case 4 -> """
                     [❤️❤❤❤❤]
                     """;
            case 5 -> """
                     [❤❤❤❤❤]
                     """;
            default -> "";
        };
    }
}
