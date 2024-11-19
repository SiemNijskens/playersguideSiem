package Players_guide;

import java.util.Scanner;

public class Challenge15v2 {
    // ik vond dat ik de opdracht te makkelijk had afgemaakt dus hierbij een nieuwe poging met gebruik van een zelfgemaakte metnode en een array
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        String[] items = {"Rope", "Torches", "Climbing Equipment", "Clean Water", "Machete", "Canoe", "Food Supplies"};

        System.out.println("Hello partner, what's your name again?");
        String name = scanner.next();

        System.out.println("Here's what I have for sale");
        // dit for loopje print de inhoud van de array items met het nummer ervoor
        for (int i = 0; i < items.length; i++) {
            System.out.println((i+1) + " " + items[i]);
        }

        // deze do while loop zorgt ervoor dat er alleen een keuze gemaatk kan worden tussen 1 en 7 en dat ie meerdere pogingen geeft om dat te doen
        do {
            System.out.println("What item would you like to know the price of?");
            choice = scanner.nextInt();
        } while ((choice > 7) || (choice < 1));
        int price = getPrices(choice);

        // als je vriendjes bent met de eigenaar krijg je korting en anders niet
        if (name.equalsIgnoreCase("Siem")) {
            System.out.println("For you my friend prices are half off");
            System.out.println(items[choice-1] + " costs " + (double)(price/2) + " gold.");
        } else {
            System.out.println(items[choice-1] + " costs " + price + " gold.");
        }
    }

    // getPrices methode geschreven zodat de prijzen van de items hierin bewaard
    public static int getPrices(int choice) {
        switch (choice) {
            case 1:
                //rope
                return 10;
            case 2:
                //torches
                return 15;
            case 3:
                //climbing equipment
                return 25;
            case 4:
                //clean water
                return 1;
            case 5:
                //machete
                return 20;
            case 6:
                //canoe
                return 200;
            case 7:
                //food supplies
                return 1;
            default:
                System.out.println("If you're not going to pick one of the options you can get the hell out of my shop");
                return 0;
        }
    }
}
