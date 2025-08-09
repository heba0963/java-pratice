package pratice;
import java.util.Scanner;
import java.util.Random;

public class GuessingSpiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("#### SPIEL: ZAHLEN-RATESPIEL ###");
        System.out.println("Ich denke an eine Zahl zwischen 1 und 10...");
        
        int zufallZahl = random.nextInt(10) + 1;
        int versuche = 0;
        int maxVersuche = 3;
        boolean gewonnen = false;
        
        while(versuche < maxVersuche && !gewonnen) {
            versuche++;
            System.out.print("Versuch " + versuche + "/" + maxVersuche + " - Ihre Vermutung: ");
            
            int vermutung = scanner.nextInt();
            
            if(vermutung == zufallZahl) {
                System.out.println("GRATULIERE! Sie haben die Zahl " + zufallZahl + " in " + versuche + " Versuchen erraten!");
                gewonnen = true;
            } else if(vermutung < zufallZahl) {
                System.out.println("Zu klein, die gesuchte Zahl ist größer.");
            } else {
                System.out.println("Zu hoch, die gesuchte Zahl ist kleiner.");
            }
            
            if(!gewonnen && versuche < maxVersuche) {
                System.out.println("Noch Versuche: " + (maxVersuche - versuche));
            }
        }
        
        if(!gewonnen) {
            System.out.println("Oh schade! die richtige Zahl war: " + zufallsZahl);
        }
        
        scanner.close();
    }
}
