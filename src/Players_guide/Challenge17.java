package Players_guide;
import java.awt.*;

public class Challenge17 {
    public static void main(String[] args) {
        // for loop die checkt of de modulus van de index van 3 en 5 0 is. dit doet ie appart van elkaar
        // als de modulus van allebei 0 is dan print powerblast
        // als de modulus van 3 0 is doe iets
        // als de modulus van 5 0 is doe iets


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(ConsoleColors.BLUE_BRIGHT + i + ": Watch out, a big double blast is comming" + ConsoleColors.RESET);
            }
            else if (i % 3 == 0)
            {
                System.out.println(ConsoleColors.RED_BRIGHT + i + ": Fire" + ConsoleColors.RESET);
            }
            else if (i % 5 == 0){
                System.out.println(ConsoleColors.YELLOW_BRIGHT + i + ": Electric" + ConsoleColors.RESET);
            } else{
                System.out.println(i + ": Normal");
            }
        }

        /*
        Change the color of the output based on the type of blast. (For example, red for Fire, yellow for
        Electric, and blue for Electric and Fire).
        */
    }
}
