package Players_guide;

import java.util.Scanner;

public class Challenge15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey there partner. What's your name again?");
        String name = scanner.next();
        System.out.println("Here's what I have for sale:");
        System.out.println("1 Rope\n" +
                "2 Torches\n" +
                "3 Climbing Equipment\n" +
                "4 Clean Water\n" +
                "5 Machete\n" +
                "6 Canoe\n" +
                "7 Food Supplies\n");
        System.out.println("What would you like to know the price of?");

        int keuze = scanner.nextInt();

        if (name.equalsIgnoreCase("Siem")) {
            switch (keuze) {
                case 1:
                    System.out.println("Rope costs 5 gold for 20 yards.");
                    break;
                case 2:
                    System.out.println("Torches costs 7.5 gold a piece.");
                    break;
                case 3:
                    System.out.println("Climbing equipment costs 12.5 gold.");
                    break;
                case 4:
                    System.out.println("Clean water costs 0.5 gold.");
                    break;
                case 5:
                    System.out.println("A machete costs 10 gold.\nDon't hurt yourself with it.");
                    break;
                case 6:
                    System.out.println("A canoe costs 100 gold.");
                    break;
                case 7:
                    System.out.println("Food supplies cost 0.5 gold.");
                    break;
                default:
                    System.out.println("If you're not going to pick one of the options you can get the hell out of my shop!");
                    break;
            }
        } else {
            switch (keuze) {
                case 1:
                    System.out.println("Rope costs 10 gold for 20 yards.");
                    break;
                case 2:
                    System.out.println("Torches costs 15 gold a piece.");
                    break;
                case 3:
                    System.out.println("Climbing equipment costs 25 gold.");
                    break;
                case 4:
                    System.out.println("Clean water costs 1 gold.");
                    break;
                case 5:
                    System.out.println("A machete costs 20 gold.\nDon't hurt yourself with it.");
                    break;
                case 6:
                    System.out.println("A canoe costs 200 gold.");
                    break;
                case 7:
                    System.out.println("Food supplies cost 1 gold.");
                    break;
                default:
                    System.out.println("If you're not going to pick one of the options you can get the hell out of my shop!");
                    break;
            }
        }
    }
}

