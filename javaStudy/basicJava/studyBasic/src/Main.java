import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // first printing out
        // System.out.println("hello java");

        // reading the input
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Name: ");
        // String name = scanner.nextLine().trim();
        // System.out.print("Age: ");
        // int age = scanner.nextInt();
        // System.out.println("you are " + name + " and is " + age + " years old");

        // simple saving calculator
        Scanner input = new Scanner(System.in);
        // salary
        System.out.print("Salary: ");
        int salaryAmount = input.nextInt();

        // saving percentage
        System.out.print("Saving in %: ");
        float savingPercentage = input.nextFloat();

        //period
        System.out.print("Period (year): ");
        byte amountOfYears = input.nextByte();

        // calculation
        double totalSaving = ((salaryAmount * (savingPercentage/100)) * 12) * amountOfYears;
        String formatedSaving = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(totalSaving);
        System.out.println("Your saving: " + formatedSaving);

    }
}
