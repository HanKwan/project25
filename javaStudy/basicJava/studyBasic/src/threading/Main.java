package threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Myrunnable myrunnable = new Myrunnable();
        Thread thread = new Thread(myrunnable);
        thread.setDaemon(true);         // ending thread when the main thread finished (the time up message)
        thread.start();

        System.out.print("Enter name in 5sec: ");
        String name = scanner.nextLine();

        System.out.println("hello, " + name);

    }
}
