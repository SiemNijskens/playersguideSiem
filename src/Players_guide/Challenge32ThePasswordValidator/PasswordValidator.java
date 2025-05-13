/*
 * Naam  : S Nijskens
 * Datum : 13-5-2025
 *
 *  challenge32.java:
 *  this program  can be used to validate wether a password has several features like upper case or lowwercase letters.
 *
 */


package Players_guide.Challenge32ThePasswordValidator;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        while (true) {
            System.out.println("provide a password to be validated");
            System.out.println("your password should be at least 6 letters long and no more than 13 letters long");
            System.out.println("your password must contain at least one uppercase letter, one lowercase letter, and one number");
            System.out.println("your password cannot contain a capital T or an ampersand (&) because Ingelmar in IT has decreed it");
            Scanner scanner = new Scanner(System.in);
            //ask user for a password
            String password = scanner.next();

            // validates all different requirements to the password using the different methods
            if (validateAll(password)){
                System.out.println("your password is valid");
            }
            else {
                System.out.println("your password is not valid");
            }

            // this program loops through a while true loop and the input and action method select what the user wants to do like a menu
            int input;
            input = action();

            // if the user inputs 9 the whole program ends by returning to the main
            if (input == 9) {
                return;
            }
        }


    }

    // calls all checker methods in this program to validate the password and returns true if the password meets te requirements
    public static boolean validateAll(String password){
        if (lenghtChecker(password) && uppercaseChecker(password) && lowercaseChecker(password) && numberChecker(password) && ampersandAndTChecker(password)){
            return true;
        }
        return false;
    }

    // allows the user to navigate the program
    public static int action() {
        System.out.println("what do you want to do");
        System.out.println("enter 1 to enter a new password");
        System.out.println("enter 9 to end the program");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        switch (input) {
            case 1:
                return 1;
            case 9:
                System.out.println("thanks for using this program");
                System.out.println("bye bye");
                return 9;
            default:
                System.out.println("wrong input!");
                System.out.println("shutting down");
                return 9;
        }
    }

    // checks if the length of the password is between 6 and 13 incl.
    public static boolean lenghtChecker(String password) {
        return password.length() >= 6 && password.length() <= 13;
    }

    //pulls the input password apart into a char array and then checks each char for uppercases.
    // if a char is an uppercase letter i becomes 1. if, at the end of the password, i = one, the method returns true
    public static boolean uppercaseChecker(String password) {
        int i = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                i = 1;
            }
        }
        return i == 1;
    }

    // like above but for lowercase letters
    public static boolean lowercaseChecker(String password) {
        int i = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                i = 1;
            }
        }
        return i == 1;
    }

    // like above but for numbers
    public static boolean numberChecker (String password){
        int i = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                i = 1;
            }
        }
        return i == 1;
    }


    // old method to check for numbers. this method uses a switch statement to check for numbers
    /*public static boolean numberChecker(String password) {
        int i = 0;
        for (char ch : password.toCharArray())
            switch (ch) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    i = 1;
                    break;
                default:
            }
        return i == 1;
    }*/

    // this method uses a switch to check for the characters T and &. if they are found the function returns false
    public static boolean ampersandAndTChecker(String password) {
        int i = 0;
        for (char ch : password.toCharArray())
            switch (ch) {
                case '&':
                case 'T':
                    i = 1;
                    break;
                default:
            }
        return !(i == 1);
    }
}