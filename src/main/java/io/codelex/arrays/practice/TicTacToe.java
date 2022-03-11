package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        initBoard();
        displayBoard();
        while (true) {
            System.out.println("'" + playerTurn() + "' choose your location (row, column):");
            makeMove(keyboard);
            displayBoard();
            if (aWin()) {
                break;
            } else if (aTie()) {
                break;
            }
        }
    }

    public static void makeMove(Scanner sc) {
        String[] inArr = sc.nextLine().split(" ");
        int rChoice = Integer.parseInt(inArr[0]);
        int cChoice = Integer.parseInt(inArr[1]);

        if (board[rChoice][cChoice] != ' ') {
            System.out.println("Invalid move. Try again (row, column):");
            makeMove(sc);
        } else {
            board[rChoice][cChoice] = playerTurn();
        }
    }

    public static char playerTurn() {
        int count = 0;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == ' ')
                    count++;
            }
        }
        if (count % 2 == 1) {
            return 'X';
        } else {
            return 'O';
        }
    }

    public static boolean aTie() {
        int count = 0;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == ' ')
                    count++;
            }
        }
        if (count == 0) {
            System.out.println("The game is a tie.");
            return true;
        } else {
            return false;
        }
    }

    public static boolean aWin() {
        char Winner = ' ';
        for (int r = 0; r < 3; r++) {
            if (board[r][0] == board[r][1] && board[r][1] == board[r][2] && board[r][0] != ' ') {
                Winner = board[r][0];
                break;
            }
        }
        for (int c = 0; c < 3; c++) {
            if (board[0][c] == board[1][c] && board[1][c] == board[2][c] && board[0][c] != ' ') {
                Winner = board[0][c];
                break;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            Winner = board[0][0];
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[1][1] != ' ') {
            Winner = board[1][1];
        }
        if (Winner == ' ') {
            return false;
        } else {
            System.out.println("'" + Winner + "' has won the game!");
            return true;
        }
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}