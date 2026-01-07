package alarmClock;

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalTime;

public class AlarmClock implements Runnable{

    private final LocalTime alarmTime;
    private final String filePath;

    public AlarmClock(LocalTime alarmTime, String filePath) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
    }

    @Override
    public void run() {

        if (LocalTime.now().isBefore(alarmTime)) {
            while (LocalTime.now().isBefore(alarmTime)) {
                try {
                    Thread.sleep(1000);
                    LocalTime now = LocalTime.now();

                    System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());
                } catch (InterruptedException e) {
                    System.out.println("thread interrupted");
                }
            }
        } else {
            System.out.println("The time entered had been passed.");
        }

        System.out.println();
        System.out.println("Alarm noise");
        playAlarmSound(filePath);

    }
    public void playAlarmSound(String filePath) {
        File file = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            Thread.sleep(5000);

        } catch (UnsupportedAudioFileException | LineUnavailableException e) {
            System.out.println("The file is unsupported");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Something is wrong");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
