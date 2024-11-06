package Players_guide;

import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int number = scanner.nextInt();

        if (number % 2 == 0
        ) {
            System.out.println("tick");
        } else {
            System.out.println("tock");
        }
    }
}