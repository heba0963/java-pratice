package pratice;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("###### To Do List ######");
            System.out.println("1. Füge eine Aufgabe hinzu");
            System.out.println("2. Liste die Aufgabe auf");
            System.out.println("3. Lösche eine Aufgabe");
            System.out.println("4. App verlassen");
            System.out.print("Geben Sie bitte eine Option ein: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Fügen Sie eine Aufgabe hinzu: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    break;
                case 2:
                    System.out.println("Aufgaben:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Geben Sie eine Aufgabe-Nummer zum Löschen: ");
                    int index = sc.nextInt() - 1;
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                    } else {
                        System.out.println("Nummer nicht gefunden...");
                    }
                    break;
                case 4:
                    System.out.println("Auf wiedersehen!");
                    break;
                default:
                    System.out.println("Diese Option ist nicht gultig.");
            }
        } while (choice != 4);

        sc.close();
    }
}
