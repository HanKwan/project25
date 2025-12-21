package alarmClock;

import java.time.LocalTime;

public class AlarmClock implements Runnable{

    private LocalTime alarmTime;

    public AlarmClock(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }

    @Override
    public void run() {

        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);
                System.out.println(LocalTime.now());
            } catch (InterruptedException e) {
                System.out.println("thread interrupted");
            }
        }

    }
}
