package les_oefeningen.ronde1;

import java.util.Scanner;

public class tafeltjes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hoeveel tafeltjes wil je printen");
        int aantal = scanner.nextInt();
        int j;

        int maxLength = aantal * aantal;
        int length = (int) (Math.log10(maxLength) + 1);
        // System.out.println(length);
        int minLength = (int) (Math.log10(aantal) + 1);

        for (int i = 0; i <= aantal; i++) {
            for (j = 0; j <= aantal; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("* |");
                } else {
                    if (i == 0) {
                        if ((int) (Math.log10(j) + 1) < length) {
                            for (int k = 1; k <= (length-((int) (Math.log10(j) + 1))); k++) {
                                System.out.print(" ");
                            }
                        }
                        System.out.print(j);
                        if ((int) (Math.log10(j) + 1) < length) {
                            for (int k = 1; k <= ((int) (Math.log10(j) + 1)); k++) {
                                System.out.print(" ");
                            }
                        }

                    } else {
                        if (j == 0) {
                            System.out.print(i + " | ");
                        } else {
                            System.out.print(j * i + " ");
                            if ((int) (Math.log10(j * i) + 1) < length) {
                                for (int k = 1; k <= (length-((int) (Math.log10(j * i) + 1))); k++) {
                                    System.out.print(" ");
                                }
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}