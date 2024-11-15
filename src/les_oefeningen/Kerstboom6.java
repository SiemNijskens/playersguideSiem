package les_oefeningen;

import java.util.Scanner;

public class Kerstboom6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("hoeveel regels wil je hebben?");
        int regels = scanner.nextInt();

        for (int i = 1; i <= regels; i++) {
            for (int j = 1; j <= regels - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<i*2; k++){
                System.out.print((Math.abs(i-k))+1);
            }
            System.out.print('\n');
        }
    }
}