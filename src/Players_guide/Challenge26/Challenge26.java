package Players_guide.Challenge26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("welcome to Vin Fletcher's custom arrowshop");
        System.out.println("what kind of arrowhead do you want on your arrow");
        do {
            System.out.println("i have the following options");
            for (Head myVar : Head.values()) {
                System.out.println(myVar);
            }
            String usersHead = scanner.nextLine().toLowerCase();
            Arrow.setHead(headSelection(usersHead));
            if (Arrow.getHead() == null) {
                System.out.println("invalid input");
            }
        } while (Arrow.getHead() == null);
        System.out.println("no problemo, i'll make you an arrow with a " + Arrow.getHead() + " arrowhead on it.");


        System.out.println("what kind of fletching do you want on your arrow");

        do {
            System.out.println("i have the following options");
            for (Fletching myVar : Fletching.values()) {
                System.out.println(myVar);
            }
            String usersFletching = scanner.nextLine().toLowerCase();
            Arrow.setFletching(fletchingSelection(usersFletching));

        } while (Arrow.getFletching() == null);
        System.out.println(Arrow.getFletching());

        System.out.println("You got it buddy, i'll put " + Arrow.getFletching() + " fletching on your arrow with the " + Arrow.getHead() + " arrrowhead");

        System.out.println("how long do you want your arrow to be");
        do {
            System.out.println("arrows can be between 60 and 100 cm long");
                try {
                    String s = scanner.nextLine();
                    Arrow.setLength(Float.parseFloat(s));
                }
                catch (NumberFormatException e){
                    Arrow.setLength(0);
                    }
        } while (Arrow.getLength() < 60f || Arrow.getLength() > 100f);

        Arrow arrow = new Arrow(Arrow.getLength(), Arrow.getFletching(), Arrow.getHead());

        float cost = getCost(Arrow.getHead(), Arrow.getFletching(), Arrow.getLength());

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
            case PLASTIC:
                return 10f;
            case GOOSE_FEATHERS:
                return 3f;
            case TURKEY_FEATHERS:
                return 5f;
        }
        return 0;
    }

    private static float getHeadCost(Head head) {
        switch (head) {
            case WOOD:
                return 3f;
            case OBSIDIAN:
                return 5f;
            case STEEL:
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