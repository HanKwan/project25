package multithreading;

public class Main {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Myrunnable("hiii"));
        Thread thread2 = new Thread(new Myrunnable("hooo"));

        thread1.start();
        thread2.start();

    }

}
