package guessThePokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String pokemon = "charmander";

        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuess = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < pokemon.length(); i++) {
            wordState.add('_');
        }

        System.out.println("Guess the pokemon");
        System.out.println("*****************");
        System.out.println();
        for (char c : wordState) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Guess the pokemon'n name: ");
        char userGuess = scanner.next().toLowerCase().charAt(0);
        System.out.println(userGuess);
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
