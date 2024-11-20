package Players_guide;

import java.util.Scanner;

public class Challenge18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hoeveel getallen wil je opslaan");
        int aantal = scanner.nextInt();

        //maakt een array aan
        int[] eenrsteArray = new int[aantal];

        //vraag om userinput voor welke getallen in de array geplaatst moeten worden
        for (int i = 1; i <= aantal; i++) {
            System.out.println("what is number " + (i));
            eenrsteArray[i-1] = scanner.nextInt();
        }
        // maakt een tweede array
        int [] tweedeArray = new int[aantal];

        // dit loopje kopieert de waarden uit de eersteArray naar de tweedeArray
        for (int i=0; i < aantal; i++)
            tweedeArray[i]=eenrsteArray[i];

        //print beide arrays naast elkaar
        System.out.println("de eerste array print aan de linker kant en de tweede array print aan de rechterkant");
        for (int i = 0; i <= (aantal-1); i++) {
            System.out.print(eenrsteArray[i] + " ");
            System.out.println(tweedeArray[i]);
        }

        /* Objectives:
        Make a program that creates an array of length 5.
        Ask the user for five numbers and put them in the array.
        Make a second array of length 5.
        Use a loop to copy the values out of the original array and into the new one.
        Display the contents of both arrays one at a time to illustrate that the Replicator of D’To works again.*/
    }
}

