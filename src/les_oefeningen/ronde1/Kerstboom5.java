package les_oefeningen.ronde1;

import java.util.Scanner;

public class Kerstboom5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("hoeveel regels wil je hebben?");
        int regels = scanner.nextInt();

        for (int i = 1; i <= regels; i++) {
            for (int j = 1; j <= regels - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<i*2; k++){
                System.out.print(i);
            }
            System.out.print('\n');
        }
    }
}
