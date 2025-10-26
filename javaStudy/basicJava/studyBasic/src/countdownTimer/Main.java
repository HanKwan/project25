package countdownTimer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Celebration word: ");
        String response2 = scanner.nextLine();

        System.out.print("Set timer in second: ");
        int response1 = scanner.nextInt();       // cannot set the count = scanner.nextint here

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {

            int count = response1;      // count should be in anonymous
            String celebrate = response2;

            @Override
            public void run() {

                if (count == 0) {
                    System.out.println(celebrate);
                    timer.cancel();
                } else {
                    System.out.println(count);
                    count--;
                }
            }
        };

        timer.schedule(timerTask, 300, 1000);
    }

}
