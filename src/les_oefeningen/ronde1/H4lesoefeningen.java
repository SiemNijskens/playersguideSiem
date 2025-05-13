package les_oefeningen.ronde1;

import java.util.Scanner;

public class H4lesoefeningen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NUM_ITEMS;
        do {
            System.out.println("How many elements in your array? Only positive integers.");
            NUM_ITEMS = scanner.nextInt();
        } while (NUM_ITEMS <= 0);

        int [] numbers = new int [NUM_ITEMS];

        for (int i=0; i<= NUM_ITEMS-1; i++){
            System.out.println("what is element " + (i+1));
            numbers[i] = scanner.nextInt();
        }
        System.out.print("De waarden zijn: [");
        for (int i = 0 ; i < NUM_ITEMS ; i++){
            System.out.print(numbers[i]);
        }
        System.out.println("]");

        // bonus
        for (int i = 0 ; i < NUM_ITEMS; i++){
            for (int j = 0 ; j<(numbers[i]);j++){
                System.out.print("*");
            } System.out.println(numbers[i]);
        }
    }
}