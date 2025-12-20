package multithreading;

public class Myrunnable implements Runnable{

    final String text;

    public Myrunnable(String text) {
        this.text = text;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            try {
                Thread.sleep(1000);
                System.out.println(text);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
