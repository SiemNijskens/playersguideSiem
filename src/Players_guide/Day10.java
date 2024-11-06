package Players_guide;
import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        /*
        set the view distance at 100 units/meters
        check for non overlapping cones of view
        the ratio of x to y should be 1:4 at the limit to change the classification
         */
        System.out.println("Maximum view distance of this watchtower is 100 meters");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What are the enemy's x coordinates");
        double xCoord = scanner.nextDouble();

        System.out.println("What are the enemy's y coordinates");
        double yCoord = scanner.nextDouble();

      /*  if (5 < Math.abs (xCoord) && yCoord < 100) {
        // bulk van het programma komt hier

        }
        else if (xCoord < 5 && yCoord < 5) {
            System.out.println("The enemy is at the door");

        } else if (xCoord > 100 || yCoord > 100) {
            System.out.println("This enemy is still far away focus on another enemy");
        }*/

        double radius = Math.sqrt((xCoord*xCoord) + (yCoord*yCoord));
        System.out.println(radius);
        double phi = Math.asin (yCoord/radius);
        System.out.println(phi);
        double conversiefactor = 57.2957795; //1 radiaal is zoveel graden
        System.out.println(phi);
        double phi2 = phi*conversiefactor;
        System.out.println(phi2);
    }

}

