/*
 * Naam  : S Nijskens
 * Datum : 6-5-2025
 *
 *  challenge31.java:
 *  dit programma simuleert een deur die gesloten geopend op slot gedraaid en van het slot gedraaid kan worden
 *  ik gebruik hiervoor een paar switch -es en een boel aparte methodes en een constructor
 *
 */

package Players_guide.Challenge31TheLockedDoor;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("Please enter a starting passcode for the door");
        System.out.println("It should consist of a few numbers");
        Scanner scanner = new Scanner(System.in);
        int startingPasscode = 0;

        //het try catch block elimineert non int input voor de passcode en zet een default passcode op 123
        try {
            startingPasscode = scanner.nextInt();
        } catch (Exception e) {
            startingPasscode = 123;
            System.out.println("that's not a number. the default passcode is set to 123");
            scanner.next();
            throw new RuntimeException(e);
        } finally {

            // starting passcode aanmaken en deze in de constructor van de deur doen
            Door door = new Door(startingPasscode, Lockstate.Closed);

            // while true loop gemaakt waarin het programma continu door lust
            while (true) {

                System.out.println("----------------------------------------------------------");

                System.out.println("The door is currently " + Door.getLockstate(door));
                // getlockstate methode staat in door.java bestand
                System.out.println("What do you want to do with the door");

                // getOptions is een grote switch statement die aangeeft wat de mogelijkheden zijn voor de deur afhankelijk in welke staat de deur zich bevindt
                getOptions(door);

                char input = scanner.next().charAt(0);
                // ik pak de input van de user maar daarvan pak ik alleen het eerste teken


                // de input checker controleerd of je niet de deur open wilt doen terwijl hij al open is of open wilt doen als hij op slot zit e.d.
                // als de input checker true returnt dan voert de action methode uit. deze methode verandert zo nodig de doorstate ook het stukje om de passcode te veranderen zit hierin verwerkt
                if (inputChecker(input, door)) {
                    action(input, door);
                } else {
                    System.out.println("your input is invalid");
                }

                // als de input 9 is dan wil de gebruiker het programma sluiten. dit doet hij door de main functie te returnen
                if (input == '9') {
                    return;
                }
            }
        }
    }

    public static boolean inputChecker(char input, Door door) {
        // this method checks if the input of the user is even possible. i.e. you can't close a door that is already closed or even locked
        switch (input) {
            case '1':
                if (door.state == Lockstate.Locked) {
                    return true;
                }
                break;
            case '2':
            case '3':
                if (door.state == Lockstate.Closed) {
                    return true;
                }
                break;
            case '4':
                if (door.state == Lockstate.Open) {
                    return true;
                }
                break;
            case '5':
            case '9':
                return true;
            default:
                return false;
        }
        return false;
    }
/*reminder possible door actions
1 unlock the door
2 lock the door
3 open the door
4 close the door
5 change passcode
9 end the program*/

    public static void action(char input, Door door) {
        //this method checks the user input and reacts accordingly. changing the doorstate or changing the passcode
        switch (input) {
            case '1':
                System.out.println("Please provide the passcode");
                Scanner scanner = new Scanner(System.in);
                int passcode = scanner.nextInt();
                door.unlockDoor(passcode);
                break;
            case '2':
                System.out.println("you lock the door");
                door.lockDoor();
                break;
            case '3':
                System.out.println("you open the door");
                door.openDoor();
                break;
            case '4':
                System.out.println("you close the door");
                door.closeDoor();
                break;
            case '5':
                System.out.println("If you want to change the password please enter the old password and the new password");
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("please enter the old passcode");
                int oldPassword = scanner2.nextInt();
                System.out.println("please enter the new passcode");
                int newPassword = scanner2.nextInt();
                door.ChangePasscode(oldPassword, newPassword);
                break;
            case '9':
                System.out.println("Thanks for using this program");
                System.out.println("Bye bye");
                break;
            default:
                System.out.println("wrong input!");

        }
    }

    public static void getOptions(Door door) {

        // this method/switch returns the possible options depending on the current doorstate
        switch (door.state) {
            case Closed:
                System.out.println("You can open the door or lock it. You can also change the passcode or close the program");
                System.out.println("Enter 3 to open the door");
                System.out.println("Enter 2 to lock the door");
                System.out.println("Enter 5 to change the passcode");
                System.out.println("Enter 9 to end the program");
                break;
            case Locked:
                System.out.println("You can unlock the door. You can also change the passcode or close the program");
                System.out.println("Enter 1 to unlock the door");
                System.out.println("Enter 5 to change the passcode");
                System.out.println("Enter 9 to end the program");
                break;
            case Open:
                System.out.println("You can close the door. You can also change the passcode or close the program");
                System.out.println("Enter 4 to close the door");
                System.out.println("Enter 5 to change the passcode");
                System.out.println("Enter 9 to end the program");
                break;
            default:
                System.out.println("You kick in the door");
        }

    }
}
/*1 unlock the door
2 lock the door
3 open the door
        4 close the door
        9 end the program*/
