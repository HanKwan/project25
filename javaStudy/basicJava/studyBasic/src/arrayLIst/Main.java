package arrayLIst;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main () {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<String>();

        System.out.print("How many things to do today: ");
        int numOfToDo = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numOfToDo; i++) {
            System.out.print("To do No." + i + " = ");
            String toDo = scanner.nextLine();
            toDoList.add(toDo);
        }

        System.out.println("Today todolist = " + toDoList);
    }
}
