package slotGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bet;
        int balance = 1000;
        String[] symbols;
        String playAgain;
        int win;

        while (balance > 0) {
            System.out.println("********************");
            System.out.println("Welcome to slot game");
            System.out.println("********************");
            System.out.println("Your balance: " + balance);
            System.out.print("Enter your bet: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (bet <= 0) {
                System.out.println("Can't bet that amount");
            } else {
                System.out.println("Spinning ....");
                balance -= bet;
                symbols = spinTheWheel();
                showSymbols(symbols);
                win = checkWin(symbols, bet);

                if (win > 0) {
                    System.out.println("Nice, u had won " + win + " yen");
                    balance += win;
                } else {
                    System.out.println("Better luck next time");
                }
                System.out.print("Play again? (y/n): ");
                playAgain = scanner.next().toLowerCase();

                if (!playAgain.equals("y")) {
                System.out.println("Your final balance is :" + balance);
                System.out.println("Have a nice day");
                    break;
                }
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
        return displaySymbols;
    }

    static void showSymbols(String[] displaySymbol) {
        System.out.println("--------------");
        System.out.println(" " + String.join(" | ", displaySymbol));
        System.out.println("--------------");
    }

    static int checkWin(String[] symbols, int bet) {        // not String symbols
        if (symbols[0].equals(symbols[1]) && symbols[1].equals(symbols[2])) {
            return switch (symbols[0]) {
                case "🍇" -> bet * 4;
                case "🍉" -> bet * 8;
                case "🔔" -> bet * 12;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        } else if (symbols[0].equals(symbols[1])) {
            return switch (symbols[0]) {
                case "🍇" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🔔" -> bet * 4;
                case "⭐" -> bet * 5;
                default -> 0;
            };
        } else if (symbols[1].equals(symbols[2])) {
            return switch (symbols[1]) {
                case "🍇" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🔔" -> bet * 4;
                case "⭐" -> bet * 5;
                default -> 0;
            };
        } else {
            bet = 0;
        }
        return bet;
    }
}
