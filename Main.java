import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n1. Show tasks");
            System.out.println("2. Add task");
            System.out.println("3. Delete task");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.next();
                continue;
            }

            if (choice == 1) {
                if (tasks.isEmpty()) {
                    System.out.println("List is empty. Salam Aleykum nebesa visokiye");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }
            } else if (choice == 2) {
                System.out.print("Enter task: ");
                String t = scanner.nextLine();
                tasks.add(t);
                System.out.println("Added");
            } else if (choice == 3) {
                System.out.print("Enter number to delete: ");
                if (scanner.hasNextInt()) {
                    int index = scanner.nextInt() - 1;
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                        System.out.println("Deleted");
                    } else {
                        System.out.println("Wrong index");
                    }
                }
            }
        }
        scanner.close();
    }
}
