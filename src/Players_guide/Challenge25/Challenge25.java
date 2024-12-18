package Players_guide.Challenge25;

import java.util.Scanner;

public class Challenge25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Head head;
        Fletching fletching;
        float length;

        System.out.println("welcome to Vin Fletcher's custom arrowshop");
        System.out.println("what kind of arrowhead do you want on your arrow");
        do {
            System.out.println("i have the following options");
            for (Head myVar : Head.values()) {
                System.out.println(myVar);
            }
            String usersHead = scanner.next().toLowerCase();
            head = headSelection(usersHead);
            if (head == null) {
                System.out.println("invalid input");
            }
        } while (head == null);
        System.out.println("no problemo, i'll make you an arrow with a " + head + " arrowhead on it.");


        System.out.println("what kind of fletching do you want on your arrow");

        do {
            System.out.println("i have the following options");
            for (Fletching myVar : Fletching.values()) {
                System.out.println(myVar);
            }
            String usersFletching = scanner.next().toLowerCase();
            fletching = fletchingSelection(usersFletching);

        } while (head == null);
        System.out.println(fletching);

        System.out.println("how long do you want your arrow to be");
        do {
            System.out.println("arrows can be between 60 and 100 cm long");
            length = scanner.nextFloat();

        } while (length < 60f || length > 100f);

        Arrow arrow = new Arrow(length, fletching, head);

        float cost = getCost(head, fletching, length);

        System.out.println("your arrow costs: " + cost + " gold.");
    }

    private static Head headSelection(String head) {
        switch (head) {
            case "steel":
                return Head.STEEL;
            case "wood":
                return Head.WOOD;
            case "obsidian":
                return Head.OBSIDIAN;
            default:
                return null;
        }
    }

    private static Fletching fletchingSelection(String fletching) {
        switch (fletching) {
            case "plastic":
                return Fletching.PLASTIC;
            case "turkey feathers":
                return Fletching.TURKEY_FEATHERS;
            case "goose feathers":
                return Fletching.GOOSE_FEATHERS;
            default:
                return null;
        }
    }

    private static float getLenthCost(float length) {
        return length * 0.05f;
    }

    private static float getFletchingCost(Fletching fletching) {
        switch (fletching) {
            case Fletching.PLASTIC:
                return 10f;
            case Fletching.GOOSE_FEATHERS:
                return 3f;
            case Fletching.TURKEY_FEATHERS:
                return 5f;
        }
        return 0;
        //For arrowheads, steel costs 10 gold, wood costs 3 gold, and obsidian costs 5 gold.
        //For fletching, plastic costs 10 gold, turkey feathers cost 5 gold, and goose feathers cost 3 gold.
    }

    private static float getHeadCost(Head head) {
        switch (head) {
            case Head.WOOD:
                return 3f;
            case Head.OBSIDIAN:
                return 5f;
            case Head.STEEL:
                return 10f;
        }
        return 0;
    }

    private static float getCost(Head head, Fletching fletching, float length) {
        float headcost = getHeadCost(head);
        float fletchingcost = getFletchingCost(fletching);
        float lengthCost = getLenthCost(length);
        return (headcost + fletchingcost + lengthCost);
    }

}