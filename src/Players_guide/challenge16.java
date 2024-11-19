package Players_guide;

import java.util.Scanner;

public class challenge16 {
    public static void main(String[] args) {
        // v vraag een airschip pilot om een getal tussen 0 en 100 in een do while loop

        // v clear het scherm door een paar blanco regels te printen

        // nieuwe while loop die input van een hunter checkt met de vorige waarde.
        // check of ie goed is en zo ja print goed geraden
        // anders check of ie te hoog of te laag is
        // als ie te hoog is print dat
        // als ie te laag is print dat

        Scanner scanner = new Scanner(System.in);
        int coords = 1;
        do {
            System.out.println("What are your coordinates airship pilot? (number between 0 and 100)");
            coords = scanner.nextInt();

        } while (!(coords > 0 && coords <= 100));

        for (int j = 0; j < 50; ++j) {
            System.out.println();
        }
        int gok = -1;
        do {
            do {
                System.out.println("Hey hunter, where do you think the pilot is right now? (number between 0 and 100)");
                gok = scanner.nextInt();
            }
            while (!(gok > 0 && gok <= 100));
            if (gok == coords){
                System.out.println("Great job hunter you guessed the right coordinates");
            }
            else if (gok>coords){
                System.out.println(gok + " is too high. \n What is your next guess?");
            }else{
                System.out.println(gok + " is too low. \n What is your next guess?");
            }

        } while (!(gok == coords));
    }
}
