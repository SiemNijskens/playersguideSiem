package Players_guide;

import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        /*Objectives:

        Create a program that allows users to enter how many provinces, duchies, and estates they have.
                Add up the user’s total score, giving 1 point per estate, 3 per duchy, and 6 per province.
        Display the point total to the user.*/
        Scanner scanner = new Scanner(System.in);

        System.out.println(("How many kingdoms do you want to compare?"));
        int kingdoms = scanner.nextInt();
        scanner.nextLine();
// I initialize 2 arrays with the length of the number of kingdoms to be compared these wil be used later to store some values in a for loop
        String[] users = new String[kingdoms];
        int[] scores = new int[kingdoms];

// In this for loop I collect input from the user, calculate a final score and store the username and score in two arrays
        for (int i = 0; i <= kingdoms - 1; i++) {
            System.out.println("What is your name?");
            String user = scanner.nextLine();

            System.out.println("How many provinces do you have?");
            int provinces = scanner.nextInt();

            System.out.println("How many duchies do you have?");
            int duchies = scanner.nextInt();

            System.out.println("How many estates do you have?");
            int estates = scanner.nextInt();
            scanner.nextLine();

            int score = provinces * 6 + duchies * 3 + estates;
            System.out.println(user + "'s score is " + score);

            users[i] = user;
            scores[i] = score;

        }
        System.out.println("The final score is:");

        // these variables are initialized to check what user has the highest score
        int highestScore = 0;
        String kingWithHighestScore = "";

        // this loop prints the entire array with users and scores for an overview
        for (int j = 0; j < users.length; j++) {
            System.out.print(users[j] + " ");
            System.out.println(scores[j] + " ");

            // this loop checks the position of the highest score in the array with scores and stores that score and the corresponding user
            if (scores[j] > highestScore) {
                highestScore = scores[j];
                kingWithHighestScore = users[j];
            }
        }
        System.out.println(kingWithHighestScore + " wins with " + highestScore + " points");
    }
}