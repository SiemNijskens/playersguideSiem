package les_oefeningen.ronde2.week4;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int NumItems;

        Scanner scanner = new Scanner(System.in);

        System.out.print("voer aantal items in: ");
        NumItems = scanner.nextInt();
        System.out.println(NumItems);
        int[] items = new int[NumItems];

        System.out.print("voer de waarde van alle items in (gescheiden door spatie): ");
        scanner.nextLine();
        String list = scanner.nextLine();
        System.out.println(list);

        System.out.print("de waarden zij: [");
        String[] numberlist = list.split(" ");
        for (int i = 0; i < numberlist.length; i++) {
            System.out.print(numberlist[i]);
            if (i < numberlist.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println();
        int[] numbers = new int[numberlist.length];
        for (int i = 0; i < numberlist.length; i++) {
            numbers[i] = Integer.parseInt(numberlist[i]);
        }

        for (int i = 0; i < numberlist.length; i++) {
            for (int j = 0; j < numbers[i]; j++) {
                System.out.print("*");
            }
            System.out.println("(" +numbers[i] + ")" );
        }

    }
}

