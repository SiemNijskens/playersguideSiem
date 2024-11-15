package les_oefeningen;

import java.util.Scanner;

public class Kerstboom2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ii Print een driehoek met een gekozen symbool
        System.out.println("welk symbool wil je gebruiken?");
        char symbool = scanner.next().charAt(0);

        System.out.println("hoeveel regels wil je hebben?");
        int regels = scanner.nextInt();

        for (int i = 1; i <= regels; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbool);
            }
            System.out.print('\n');
        }
    }
}