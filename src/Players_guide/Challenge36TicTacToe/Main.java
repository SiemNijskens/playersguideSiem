package Players_guide.Challenge36TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Player1;
        String Player2;
        boolean gameon = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi players, what are your names?");
        System.out.println("Enter name of player 1");
        Player1 = scanner.next();
        System.out.println("Enter name of player 2");
        Player2 = scanner.next();
        TicTacToe theboard = new TicTacToe(Player1, Player2);
        System.out.println("Where do you want to put the first cross " + Player1 + "?");
        int i = 1;
        while (gameon) {
            if (i % 2 == 1) {
                System.out.println("It's " + Player1 + "'s turn");
            } else {
                System.out.println("It's " + Player2 + "'s turn");
            }
            theboard.print();

            int input = -1;
            int validInput = 1;
            while (validInput == 1) {
                input = scanner.nextInt();
                if (theboard.getBoardField(input) == TicTacToe.tictactoe.empty) {
                    validInput = 0;
                } else {
                    System.out.println("Input is invalid please try again");
                }
            }

            if (i % 2 == 1) {
                theboard.changeBoard(input, TicTacToe.tictactoe.X);
            } else {
                theboard.changeBoard(input, TicTacToe.tictactoe.O);
            }

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            if (theboard.checkWin()) {
                if (i % 2 == 1) {
                    theboard.print();
                    System.out.println(Player1 + " has won");
                    gameon=false;
                } else {
                    theboard.print();
                    System.out.println(Player2 + " has won");
                    gameon = false;
                }
            }

            if(theboard.checkDraw()){
                System.out.println("the game is a draw");
                theboard.print();
                gameon=false;
            }

            i++;
        }
    }

}