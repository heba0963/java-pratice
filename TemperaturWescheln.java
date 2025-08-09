package pratice;
import java.util.Scanner;

public class TemperaturWescheln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius in Fahrenheit");
        System.out.println("2. Fahrenheit in Celsius");
        System.out.print("Choose conversion: ");
        int choice = sc.nextInt();

        System.out.print("Bitte geben Sie die Temperatur ein: ");
        double temp = sc.nextDouble();

        if (choice == 1) {
            double result = (temp * 9/5) + 32;
            System.out.println("Fahrenheit: " + result);
        } else if (choice == 2) {
            double result = (temp - 32) * 5/9;
            System.out.println("Celsius: " + result);
        } else {
            System.out.println("Flasche Eingabe...");
        }

        sc.close();
    }
}
