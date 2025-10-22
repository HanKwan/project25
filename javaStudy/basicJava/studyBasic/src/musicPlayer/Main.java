package musicPlayer;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public void main(String[] args) {

        String filePath = "src/musicPlayer/d6b2ece0.wav";
        File file = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            System.out.println("it's fine for now");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported file");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Something is wrong");
        }
    }
}
