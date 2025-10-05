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
        int salaryAmount;
        float savingPercentage;
        byte amountOfYears;

        // salary
        while (true) {
            System.out.print("Salary: ");
            if (!input.hasNextInt()) {
                System.out.println("That's not a number");
                input.next();
                continue;
            }

            salaryAmount = input.nextInt();

            if (salaryAmount <= 1000 || salaryAmount >= 400000) {
                System.out.println("Input valid number between 70k and 400k");
            } else {
                break;
            }
        }

        // saving percentage
        while (true) {
            System.out.print("Saving in %: ");
            if (!input.hasNextInt()) {
                System.out.println("That's not a number");
                input.next();
                continue;
            }

            savingPercentage = input.nextFloat();

            if (savingPercentage < 100)
                break;
            System.out.println("Be reasonable");
        }

        //period
        while (true) {
            System.out.print("Period (year): ");
            if (!input.hasNextInt()) {
                System.out.println("That's not a number");
                input.next();
                continue;
            }

            amountOfYears = input.nextByte();

            if (amountOfYears < 100)
                break;
            System.out.println("You not gonna live that long");
        }

        // calculation
        double totalSaving = ((salaryAmount * (savingPercentage/100)) * 12) * amountOfYears;
        String formatedSaving = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(totalSaving);
        System.out.println("Your saving: " + formatedSaving);

    }
}
