package musicPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public void main(String[] args) {

        String filePath = "src/musicPlayer/d6b2ece0.wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equals("q")) {     // not !response = "q"

                System.out.println("Java music player");
                System.out.println("p for play");
                System.out.println("s for stop");
                System.out.println("r for reset");
                System.out.println("q for quit");
                System.out.print("Please select: ");

                response = scanner.next().toLowerCase();

                switch (response) {
                    case "p" -> clip.start();
                    case "s" -> clip.stop();
                    case "r" -> clip.setMicrosecondPosition(0);
                    case "q" -> clip.close();
                    default -> System.out.println("not valid");
                }
            }

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported file");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (LineUnavailableException e) {
            System.out.println("line unavailable");
        }  catch (IOException e) {
            System.out.println("Something is wrong");
        } finally {
            System.out.println("bye");
        }
    }
}
