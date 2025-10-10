package bankingProgram;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {

        // banking program

        int choice;
        int balance = 0;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Banking program");
            System.out.println("---------------");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select your desire: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid");
            }
        }
    }

        // show balance
        static void showBalance (int balance) {
            System.out.println("Your balance is " + balance);
            System.out.println("********************");
        }

        // deposit
        static int deposit () {
            int amount;
            System.out.print("Deposit amount: ");
            amount = scanner.nextInt();
            if (amount <= 0 ) {
                System.out.println("Cannot deposit " + amount + " yen");
                return 0;
            } else {
                return amount;
            }
        }

        // withdraw
        static int withdraw (int balance) {
            int withdrawAmount;
            System.out.print("Withdraw amount: ");
            withdrawAmount = scanner.nextInt();
            if (balance < withdrawAmount) {
                System.out.println("Your balance is lower than " +withdrawAmount);
                return 0;
            } else {
                return withdrawAmount;
            }
        }
}
