package threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name in 5sec: ");
        String name = scanner.nextLine();

        for (int i=1; i<=5; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("got interrupted");
            }
            if (i == 5) {
                System.out.println("time's up");
            }
        }

        System.out.println("hello, " + name);

    }
}
