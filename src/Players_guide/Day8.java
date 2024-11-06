package Players_guide;

import java.awt.*;
import java.util.Scanner;

public class Day8 {
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the target row?");
        int targetRow = scanner.nextInt();

        System.out.println("What is the target column?");
        int targetColumn = scanner.nextInt();

       /* System.out.println(ConsoleColors.RED + "RED COLORED" +
                ConsoleColors.RESET + " NORMAL");*/

        System.out.println(ConsoleColors.RED + "Deploy to:" + ConsoleColors.RESET);
        int[] coord1 = {targetRow, targetColumn - 1};
        int[] coord2 = {targetRow, targetColumn + 1};
        int[] coord3 = {targetRow - 1, targetColumn};
        int[] coord4 = {targetRow + 1, targetColumn};

        System.out.println(ConsoleColors.PURPLE_BRIGHT + "(" + coord1[0] + "," + coord1[1] + ")" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.PURPLE + "(" + coord2[0] + "," + coord2[1] + ")" + ConsoleColors.RESET);
        System.out.println("(" + coord3[0] + "," + coord3[1] + ")");
        System.out.println("(" + coord4[0] + "," + coord4[1] + ")");
        Toolkit.getDefaultToolkit().beep();
    }
}