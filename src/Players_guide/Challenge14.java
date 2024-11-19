package Players_guide;

import java.util.Scanner;

public class Challenge14 {
    public static void main(String[] args) {
        /*It is time to resupply. A nearby outfitter shop has the supplies you need but is so disorganized that they
cannot sell things to you. “Can’t sell if I can’t find the price list,” Tortuga, the owner, tells you as he turns
over and attempts to go back to sleep in his reclining chair in the corner.
There’s a simple solution: use your programming powers to build something to report the prices of
various pieces of equipment, based on the user’s selection:
The following items are available:

Rope
Torches
Climbing Equipment
Clean Water
Machete
Canoe
Food Supplies
What number do you want to see the price of? 2
Torches cost 15 gold.
You search around the shop and find ledgers that show the following prices for these items: Rope: 10
gold, Torches: 15 gold, Climbing Equipment: 25 gold, Clean Water: 1 gold, Machete: 20 gold, Canoe: 200
gold, Food Supplies: 1 gold.

Objectives:

Build a program that will show the menu illustrated above.
Ask the user to enter a number from the menu.
Using the information above, use a switch (either type) to show the item’s cost.
         */
        System.out.println("Here's what I have for sale");
        System.out.println("1 Rope\n" +
                "2 Torches\n" +
                "3 Climbing Equipment\n" +
                "4 Clean Water\n" +
                "5 Machete\n" +
                "6 Canoe\n" +
                "7 Food Supplies\n");
        System.out.println("What would you like to know the price of?");

        Scanner scanner = new Scanner (System.in);
        int keuze = scanner.nextInt();
        switch (keuze){
            case 1:
                System.out.println("Rope costs 10 gold for 20 yards");
                break;
            case 2:
                System.out.println("Torches costs 15 gold a piece");
                break;
            case 3:
                System.out.println("Climbing equipment costs 25 gold");
                break;
            case 4:
                System.out.println("Clean water costs 1 gold");
                break;
            case 5:
                System.out.println("A machete costs 20 gold.\nDon't hurt yourself with it");
                break;
            case 6:
                System.out.println("A canoe costs 200 gold");
                break;
            case 7:
                System.out.println("Food supplies cost 1 gold");
                break;
            default:
                System.out.println("If you're not going to pick one of the options you can get the hell out of my shop");
                break;
        }


    }
}
