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

        double radius = Math.sqrt((xCoord * xCoord) + (yCoord * yCoord));
        System.out.println(radius);

        if (radius <= 5) {
            System.out.println("The enemy is at the door");
        } else if (radius >= 100) {
            System.out.println("The enemy is out of view");
        } else if (radius > 5 && radius < 100) {

            if (xCoord == 0 && yCoord > 0) {
                System.out.println("The enemy is directly to the north");
            } else if (xCoord == 0 && yCoord < 0) {
                System.out.println("The enemy is directly to the south");

            } else if (xCoord > 0 && yCoord == 0) {
                System.out.println("The enemy is directly to the east");
            } else if (xCoord < 0 && yCoord == 0) {
                System.out.println("The enemy is directly to the west");
            }
            //bulk van de code
            // als de enemy in range is checkt ie eerst in welk kwadrant hij valt daarna berekent hij de hoek pas




        }


        double phi = Math.asin(yCoord / radius); //geeft de hoek met het noorden met de klok mee in radialen
        System.out.println(phi);
        double conversiefactor = 1*180/Math.PI ; //1 radiaal is zoveel graden
        System.out.println(conversiefactor);
        double phi2 = phi * conversiefactor;
        System.out.println(phi2);
        if (phi2 < 0){
            phi2 = (phi2 + 360);

            //checken welk quadrant wel werkt en of tangens niet beter werkt
        }
    }
}

