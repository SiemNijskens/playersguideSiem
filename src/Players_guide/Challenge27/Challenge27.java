package Players_guide.Challenge27;

import java.util.Scanner;

public class Challenge27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrow arrow = new Arrow();
        System.out.println("welcome to Vin Fletcher's arrowshop");

        System.out.println("I make custom arrow and i have a few standard options. Here's a list of the options");
        System.out.println("Custom, beginner arrow, marksman arrow or elite arrow");
        String arrowtype="henk";
        ArrowType usertype = null;
        int flag = 1;
        while (flag == 1) {
            try {
                arrowtype = scanner.nextLine().toLowerCase();
                usertype = ArrowType(arrowtype);
                flag = 0;
            } catch (Exception e) {
                System.out.println("i don't sell " + arrowtype);
                System.out.println("what kind of arrow do you want");
                System.out.println("Custom, beginner arrow, marksman arrow or elite arrow");
            }
        }

        switch (usertype) {
            case ArrowType.CUSTOM: {
                System.out.println("what kind of arrowhead do you want on your arrow");
                do {
                    System.out.println("i have the following options");
                    for (Head myVar : Head.values()) {
                        System.out.println(myVar);
                    }
                    String usersHead = scanner.nextLine().toLowerCase();
                    arrow.setHead(headSelection(usersHead));
                    if (arrow.getHead() == null) {
                        System.out.println("invalid input");
                    }
                } while (arrow.getHead() == null);
                System.out.println("no problemo, i'll make you an arrow with a " + arrow.getHead() + " arrowhead on it.");


                System.out.println("what kind of fletching do you want on your arrow");

                do {
                    System.out.println("i have the following options");
                    for (Fletching myVar : Fletching.values()) {
                        System.out.println(myVar);
                    }
                    String usersFletching = scanner.nextLine().toLowerCase();
                    arrow.setFletching(fletchingSelection(usersFletching));

                } while (arrow.getFletching() == null);
                System.out.println(arrow.getFletching());

                System.out.println("You got it buddy, i'll put " + arrow.getFletching() + " fletching on your arrow with the " + arrow.getHead() + " arrrowhead");

                System.out.println("how long do you want your arrow to be");
                do {
                    System.out.println("arrows can be between 60 and 100 cm long");
                    try {
                        String s = scanner.nextLine();
                        arrow.setLength(Float.parseFloat(s));
                    } catch (NumberFormatException e) {
                        arrow.setLength(0);
                    }
                } while (arrow.getLength() < 60f || arrow.getLength() > 100f);
                break;
            }

            case ArrowType.BEGINNER:
                arrow = Arrow.createBeginnerArrow();
                break;
            case ArrowType.MARKSMAN:
                arrow = Arrow.createMarksmanArrow();
                break;
            case ArrowType.ELITE:
                arrow = Arrow.createEliteArrow();
                break;
        }

        float cost = getCost(arrow);

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

    private static float getCost(Arrow arrow) {
        float headcost = getHeadCost(arrow.getHead());
        float fletchingcost = getFletchingCost(arrow.getFletching());
        float lengthcost = getLenthCost(arrow.getLength());
        return (headcost + fletchingcost + lengthcost);
    }

    private static ArrowType ArrowType(String arrowtype) throws Exception {
        switch (arrowtype) {
            case "custom":
            case "custom arrow":
                return ArrowType.CUSTOM;
            case "beginner":
            case "beginner arrow":
                return ArrowType.BEGINNER;
            case "marksman":
            case "marksman arrow":
                return ArrowType.MARKSMAN;
            case "elite":
            case "elite arrow":
                return ArrowType.ELITE;
        }
        throw new Exception("input invalid");
    }
}