package Players_guide.Challenge22;

import java.util.Scanner;

public class Challenge22 {
    public static void main(String[] args) {
        // let player one set the location of the manticore using the method askForNumberInRange
        int manticoreLocation = askForNumberInRange("What is the location of the Manticore?", 0, 100);

        // clears the console so player 2 doesn't see the input of player 1
        for (int j = 0; j < 50; ++j) {
            System.out.println();
        }

        // innitialize a manticore opbject and a city and name them
        Manticore manticore = new Manticore("manticore1", manticoreLocation);
        City city = new City("Consolidas");

        // set the round variable to 1 and getting the max health of the city and manticore
        int round = 1;
        int manticoreMaxHealth = manticore.health;
        int cityMaxHealth = city.health;

        //start of a round shows the status of the battlefield using a method getStatus
        do {
            getStatus(round, city.health, cityMaxHealth, manticore.health, manticoreMaxHealth);
            System.out.println("Player 2, it's your turn");

            // using method askForNumberInRange get the target id from player 2
            int target = askForNumberInRange("Enter desired cannon range: ", 0, 100);

            //check if the cannon shot hits or misses
            if (target < manticoreLocation) {
                System.out.println("that round FELL SHORT of the target");
                city.health -= 1;
            } else if (target > manticoreLocation) {
                System.out.println("that round OVERSHOT the target");
                city.health -= 1;
            } else {
                System.out.println("That round was a DIRECT HIT!");
                // determine the damage dealt using the cannonDammage method in the City class
                manticore.health = manticore.health - City.cannonDamage(round);
                // as per the assignment, checks if the manticore is still alive before assigning damage to the city
                // this also makes sure the manticore and the city can't both get destroyed in the same turn
                if (manticore.health > 0) {
                    city.health -= 1;
                } else {
                    break;
                }
            }
            //increments the round counter
            round = round + 1;
        }
        while (manticore.health > 0 && city.health > 0);

        // displays who wins and how many hitpoints are left
        if (manticore.health < 1) {
            System.out.println("You've defeated the Manticore! " + city.name + " is saved");
            System.out.println("The city has " + city.health + " hitpoints left");
        } else {
            System.out.println("Oh the humanity!! The manticore has destroyed " + city.name);
            System.out.println("The manticore has " + manticore.health + " hitpoints left.");
        }
    }

    public static int askForNumberInRange(String text, int min, int max) {
        // this method asks the user for a number within a range. if the number isn't in range the method loops until a number in range is given
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println(text);
        do {
            System.out.println("Enter a number between " + min + " and " + max);
            number = scanner.nextInt();
        } while (!(number <= max && number >= min));
        return number;
    }


    public static void getStatus(int round, int cityHealth, int cityMaxHealth, int manticoreHealth, int manticoreMaxHealth) {
        // this method shows the status of the battlefield by displaying the round and the remaining hitpoints of the manticore and the city
        // it also shows how much damage the city's cannon will deal this round
        System.out.println("-------------------------------------------------------");
        System.out.println("STATUS: Round: " + round + " City health: " + cityHealth + "/" + cityMaxHealth + " Manticore health: " + manticoreHealth + "/" + manticoreMaxHealth);
        System.out.println("the cannon is expected to deal " + City.cannonDamage(round) + " damage this round.");
    }
}