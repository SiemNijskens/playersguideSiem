package les_oefeningen.ronde1;
import java.util.Scanner;

public class kerstboom1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        //i Print een vierkant van een gekozen symbool
        System.out.println("welk symbool wil je gebruiken?");
        char symbool = scanner.next().charAt(0);

        System.out.println("hoeveel regels wil je hebben?");
        int regels = scanner.nextInt();

        System.out.println("hoeveel symbolen wil je hebben?");
        int symbolen = scanner.nextInt();

        for (int i = 1; i <= regels; i++){
            for (int j=1; j<=symbolen; j++){
            System.out.print(symbool);}
            System.out.print("\n");
        }
    }
}
