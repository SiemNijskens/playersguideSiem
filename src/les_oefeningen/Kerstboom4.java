package les_oefeningen;

import java.util.Scanner;

public class Kerstboom4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ii Print een driehoek met een gekozen symbool
        System.out.println("welk symbool wil je gebruiken?");
        char symbool = scanner.next().charAt(0);

        System.out.println("hoeveel regels wil je hebben?");
        int regels = scanner.nextInt();

        for (int i = 1; i <= regels; i++) {
            for (int j = 1; j <= regels - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<i*2; k++){
                System.out.print(symbool);
            }
            System.out.print('\n');
        }
    }
}
