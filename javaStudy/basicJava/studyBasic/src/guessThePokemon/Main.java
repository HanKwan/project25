package guessThePokemon;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String pokemon = "charmander";

        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuess = 0;

        for (int i = 0; i < pokemon.length(); i++) {
            wordState.add('_');
        }

        for (char c : wordState) {
            System.out.print(c + " ");
        }
    }
}
