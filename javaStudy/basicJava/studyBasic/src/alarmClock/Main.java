package alarmClock;

import java.io.File;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
        LocalTime alarmTime = null;

        String filePath = "src/alarmClock/forAlarmNoise.wav";

        while (alarmTime == null) {
            try {
                System.out.print("set an alarm: ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("setting alarm on " + alarmTime);
            } catch (Exception e) {
                System.out.println("input valid TIME");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
    }
}
