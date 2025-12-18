package threading;

public class Myrunnable implements Runnable {

    @Override
    public void run() {
        for (int i=1; i<=5; i++) {

            try {
                Thread.sleep(1000); // imicking time
            } catch (InterruptedException e) {
                System.out.println("got interrupted");
            }
            if (i == 5) {
                System.out.println("time's up");
                System.exit(0);     // after 5sec, the system exit
            }

        }
    }

}
