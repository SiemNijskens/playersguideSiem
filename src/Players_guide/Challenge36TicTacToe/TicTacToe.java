package Players_guide.Challenge36TicTacToe;

public class TicTacToe {
    tictactoe[][] board;
    String crosses;
    String circles;

    public TicTacToe(String player1, String player2) {
        this.board = new tictactoe[][]{{tictactoe.empty, tictactoe.empty, tictactoe.empty}, {tictactoe.empty, tictactoe.empty, tictactoe.empty}, {tictactoe.empty, tictactoe.empty, tictactoe.empty}};
        this.crosses = player1;
        this.circles = player2;
    }

    public static char printCharacter(tictactoe character) {
        switch (character) {
            case X -> {
                return 'X';
            }
            case O -> {
                return 'O';
            }
            case empty -> {
                return ' ';
            }
            default -> {
                return '?';
            }
        }
    }

    public boolean checkWin() {
        // check horizontals

        for (int i = 0; i < 3; i++) {
            int horizontalCheck = 0;
            for (int j = 0; j < 3; j++) {
                if (!(board[i][0].equals(tictactoe.empty)) && board[i][0].equals(board[i][j])) {
                    horizontalCheck += 1;
                }
                if (horizontalCheck == 3) {
                    return true;
                }
            }
        }

        // check verticals
        for (int i = 0; i < 3; i++) {
            int verticalCheck = 0;
            for (int j = 0; j < 3; j++) {
                if (!(board[0][i].equals(tictactoe.empty)) && board[0][i].equals(board[j][i])) {
                    verticalCheck += 1;
                }
                if (verticalCheck == 3) {
                    return true;
                }
            }
        }

        // check diagonal
        int diagonal1Check = 0;
        for (int i = 0; i < 3; i++) {
            if (!(board[0][0].equals(tictactoe.empty)) && board[0][0].equals(board[i][i])) {
                diagonal1Check += 1;
            }
            if (diagonal1Check == 3) {
                return true;
            }
        }

        // check diagonal
        int diagonal2Check = 0;
        for (int i = 0; i < board.length; i++) {
            // System.out.println("i is " + i);
            // System.out.println("board length -1 is " + (board.length-1));
            if (!(board[0][board.length-1].equals(tictactoe.empty)) && board[0][board.length-1].equals(board[i][board.length - i-1])) {
                diagonal2Check += 1;
            }
            if (diagonal2Check == 3) {
                return true;
            }
        }
        return false;
    }
//        boolean wincon = false;
        /*wincon = ((getBoardField(1).equals(getBoardField(2))&&getBoardField(2).equals(getBoardField(3)))) ||
                (getBoardField(4).equals(getBoardField(5).equals(getBoardField(6)))) ||
                (getBoardField(7).equals(getBoardField(8).equals(getBoardField(9)))) ||
                (getBoardField(1).equals(getBoardField(5).equals(getBoardField(9)))) ||
                (getBoardField(3).equals(getBoardField(5).equals(getBoardField(7)))) ||
                (getBoardField(1).equals(getBoardField(4).equals(getBoardField(7)))) ||
                (getBoardField(2).equals(getBoardField(5).equals(getBoardField(8)))) ||
                (getBoardField(3).equals(getBoardField(6).equals(getBoardField(9))));*/


    public boolean checkDraw() {
        boolean drawcheck = !(getBoardField(1) == tictactoe.empty) && !(getBoardField(2) == tictactoe.empty) &&
                !(getBoardField(3) == tictactoe.empty) && !(getBoardField(4) == tictactoe.empty) &&
                !(getBoardField(5) == tictactoe.empty) && !(getBoardField(6) == tictactoe.empty) &&
                !(getBoardField(7) == tictactoe.empty) && !(getBoardField(8) == tictactoe.empty) &&
                !(getBoardField(9) == tictactoe.empty) && !checkWin();
        return drawcheck;
    }

    public tictactoe getBoardField(int input) {
        switch (input) {
            case 1 -> {
                return board[2][0];
            }
            case 2 -> {
                return board[2][1];
            }
            case 3 -> {
                return board[2][2];
            }
            case 4 -> {
                return board[1][0];
            }
            case 5 -> {
                return board[1][1];
            }
            case 6 -> {
                return board[1][2];
            }
            case 7 -> {
                return board[0][0];
            }
            case 8 -> {
                return board[0][1];
            }
            case 9 -> {
                return board[0][2];
            }
        }

        return tictactoe.empty;
    }

    public void setBoardField(int input, tictactoe waarde) {
        // v todo methode maken om de waarde van een veld te returnen
        switch (input) {
            case 1 -> {
                board[2][0] = waarde;
            }
            case 2 -> {
                board[2][1] = waarde;
            }
            case 3 -> {
                board[2][2] = waarde;
            }
            case 4 -> {
                board[1][0] = waarde;
            }
            case 5 -> {
                board[1][1] = waarde;
            }
            case 6 -> {
                board[1][2] = waarde;
            }
            case 7 -> {
                board[0][0] = waarde;
            }
            case 8 -> {
                board[0][1] = waarde;
            }
            case 9 -> {
                board[0][2] = waarde;
            }
        }
    }

    public void changeBoard(int input, tictactoe waarde) {
        if (waarde == tictactoe.X) {
            setBoardField(input, tictactoe.X);
        } else {
            setBoardField(input, tictactoe.O);
        }
    }


    public void print() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + printCharacter(board[i][0]) + " | " + printCharacter(board[i][1]) + " | " + printCharacter(board[i][2]));

            if (i < 2) System.out.println(("---+---+---"));
        }
    }

    public enum tictactoe {
        X, O, empty
    }
}
