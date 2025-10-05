import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // first printing out
        System.out.println("hello java");

        // reading the input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.println("you are " + name + " and is " + age + " years old");

    }
}
