package Players_guide.Challenge24;

import java.util.Scanner;

public class Challenge24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SoupType type;
        MainIngredient ingredient;
        Seasoning seasoning;

        System.out.println("Now that i have my seasoning i can finaly make soup again.\nWhat type of soup would you like?\nI have the following options:");

        //show the options of the enum SoupType
        for (SoupType myVar : SoupType.values()) {
            System.out.println(myVar);
        }
        // ask for user input and disregard capitalisation of words
        String usersType = scanner.next().toLowerCase();
        // use method typeSelection to convert user input of type String to one of the Enum values
        type = typeSelection(usersType);

        // this while loop checks if the user input is valid. If it isn't valid it asks the user again until the input is valid
        while (type == null) {
            System.out.println("Invalid selection!\nPlease pick one of the following options");
            for (SoupType myVar : SoupType.values()) {
                System.out.println(myVar);
            }
            usersType = scanner.next().toLowerCase();
            type = typeSelection(usersType);
        }

        // asks the user for the type of filling using the same method used for the type of soup
        System.out.println("and what type of filling do you want? \nI have these options:");

        for (MainIngredient myVar : MainIngredient.values()) {
            System.out.println(myVar);
        }

        String usersIngredient = scanner.next().toLowerCase();
        ingredient = ingredientSelection(usersIngredient);
        while (ingredient == null) {
            System.out.println("Invalid selection!\nPlease pick one of the following options");
            for (MainIngredient myVar : MainIngredient.values()) {
                System.out.println(myVar);
            }
            usersIngredient = scanner.next().toLowerCase();
            ingredient = ingredientSelection(usersIngredient);
        }

        System.out.println("and what kind of seasoning do you want? \nI have these options:");
        for (Seasoning myVar : Seasoning.values()) {
            System.out.println(myVar);
        }

        String usersSeasoning = scanner.next().toLowerCase();
        seasoning = seasoningSelection(usersSeasoning);
        while (seasoning == null) {
            System.out.println("Invalid selection!\nPlease pick one of the following options");
            for (Seasoning myVar : Seasoning.values()) {
                System.out.println(myVar);
            }
            usersSeasoning = scanner.next().toLowerCase();
            seasoning = seasoningSelection(usersSeasoning);
        }

        Soup mySoup = new Soup(type, seasoning, ingredient);

    }

    // this method converts user input in String form to enum values or returns null if the user input is not one of the enum values
    public static SoupType typeSelection(String type) {
        switch (type) {
            case "soup":
                return SoupType.SOUP;
            case "stew":
                return SoupType.STEW;
            case "gumbo":
                return SoupType.GUMBO;
            default:
                return null;
        }
    }

    public static MainIngredient ingredientSelection(String ingredient) {
        switch (ingredient) {
            case "mushrooms":
                return MainIngredient.MUSHROOMS;
            case "chicken":
                return MainIngredient.CHICKEN;
            case "carrots":
                return MainIngredient.CARROTS;
            case "potatoes":
                return MainIngredient.POTATOES;
            default:
                return null;
        }
    }

    public static Seasoning seasoningSelection(String seasoning) {
        switch (seasoning) {
            case "spicy":
                return Seasoning.SPICY;
            case "salty":
                return Seasoning.SALTY;
            case "sweet":
                return Seasoning.SWEET;
            default:
                return null;
        }
    }
}