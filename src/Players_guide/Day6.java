package Players_guide;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
    /*    Objectives:

        Create a program that lets the user enter the number of chocolate eggs gathered that day.
        Using / and %, compute how many eggs each sister should get and how many are left over for the
        duckbear.
                Answer this question: What are the total egg counts where the duckbear gets more than each
        sister does? You can use the program you created to help you find the answer.*/
        System.out.println("How many chocolate eggs did you find?");
        Scanner scanner = new Scanner(System.in);
        int eggs = scanner.nextInt();
        int eggsforbear = eggs%4;
        int eggspersister = (eggs-eggsforbear)/4;

        System.out.println("Each sister gets " + eggspersister + " chocolate eggs");
        System.out.println("The bear gets " + eggsforbear + " chocolate eggs");
    }
}