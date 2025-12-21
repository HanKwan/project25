package multithreading;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Myrunnable("hiii"));
        Thread thread2 = new Thread(new Myrunnable("hooo"));

        System.out.println("start!");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }

        System.out.println("stopppp!");

    }

}
