package javapractice;
import java.util.Scanner;

public class TaschenRechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("######### MEINE TASCHENRECHNER #########");
        System.out.println("Hier sind die verfügbaren Operationen: +, -, *, /");
        
        System.out.print("Bitte geben Sie die erste Zahl an: ");
        double zahl1 = scanner.nextDouble();
        
        System.out.print("Geben Sie ihre Operator ein (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Bitte geben Sie die zweite Zahl an: ");
        double zahl2 = scanner.nextDouble();
        
        double ergebnis = 0;
        boolean gultigeOperation = true;
        
        switch(operator) {
            case '+':
                ergebnis = zahl1 + zahl2;
                break;
            case '-':
                ergebnis = zahl1 - zahl2;
                break;
            case '*':
                ergebnis = zahl1 * zahl2;
                break;
            case '/':
                if(zahl2 != 0) {
                    ergebnis = zahl1 / zahl2;
                } else {
                    System.out.println("Fehler -> Die Division durch Null ist nicht möglich!");
                    gultigeOperation = false;
                }
                break;
            default:
                System.out.println("Sie habe leider einen ungültigen Operator eingegeben...");
                gultigeOperation = false;
        }
        
        if(gultigeOperation) {
            System.out.println("Das Ergebnis: " + zahl1 + " " + operator + " " + zahl2 + " = " + ergebnis);
        }
        
        scanner.close();
    }
}
