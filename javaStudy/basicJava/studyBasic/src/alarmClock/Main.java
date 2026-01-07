package alarmClock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
        LocalTime alarmTime = null;

        while (alarmTime == null) {
            try {
                System.out.print("set an alarm: ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("setting alarm on " + alarmTime);
            } catch (Exception e) {
                System.out.println("input TIME");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
    }
}
