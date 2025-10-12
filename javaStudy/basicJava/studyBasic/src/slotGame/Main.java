package slotGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bet;
        int balance = 1000;
        String row;
        String playAgain;

        while (balance > 0) {
            System.out.println("Welcome to slot game");
            System.out.println("Your balance: " + balance);
            System.out.print("Enter your bet: ");
            bet = scanner.nextInt();

            if (bet <= 0) {
                System.out.println("Can't bet that amount");
            } else {
                System.out.println("Spinning ....");
                balance -= bet;
                spinTheWheel();
            }
        }
        System.out.println("Your balance is empty");

    }
    static String[] spinTheWheel() {
        String[] symbols = {"🍇", "🍉", "🔔", "⭐"};
        String[] displaySymbols = new String[3];
        Random random = new Random();

        System.out.println();
        for (int i = 0; i<3; i++) {     // not i<symbol.length
            displaySymbols[i] = symbols[random.nextInt(symbols.length)];
        }
        System.out.println(displaySymbols[0] + displaySymbols[1] + displaySymbols[2]);
        return displaySymbols;
    }
}
