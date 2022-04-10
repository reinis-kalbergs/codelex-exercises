package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public class ScissorPaperStoneGame {
    public static void main(String[] args) {

        int totalGames = 0;
        int playerWins = 0;
        int aiWins = 0;
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Scissor-Paper-Stone");
        String choice = getInput(sc);

        while (!choice.equals("Q")) {
            ScissorPaperStone playerMove = ScissorPaperStone.valueOf(choice);
            ScissorPaperStone aiMove = ScissorPaperStone.values()[rnd.nextInt(3)];
            System.out.println("   My turn: " + aiMove);
            if (isTie(playerMove, aiMove)) {
                System.out.println("   Tie!");
            } else if (doesAIWin(aiMove, playerMove)) {
                aiWins++;
            } else {
                playerWins++;
                System.out.println("   You won!");
            }
            totalGames++;
            System.out.println();
            choice = getInput(sc);
        }

        if (totalGames == 0) {
            System.out.println("You didn't play any games");
        } else {
            System.out.println("Number of trials: " + totalGames);
            System.out.printf("I won %d(%.2f%%). You won %d(%.2f%%).", aiWins, (float) aiWins / totalGames * 100, playerWins, (float) playerWins / totalGames * 100);
        }
    }

    private static String getInput(Scanner sc) {
        String choice;
        while (true) {
            System.out.print("Your turn (Enter 'scissor', 'paper', 'stone', 'q' to quit): ");
            choice = sc.nextLine().toLowerCase();
            if (choice.equalsIgnoreCase("scissor") || choice.equalsIgnoreCase("paper") || choice.equalsIgnoreCase("stone") || choice.equalsIgnoreCase("q")) {
                break;
            } else {
                System.out.println("Invalid input, try again...");
            }
        }
        return choice.toUpperCase();
    }

    private static boolean isTie(ScissorPaperStone player, ScissorPaperStone ai) {
        return (player == ai);
    }

    private static boolean doesAIWin(ScissorPaperStone p1, ScissorPaperStone p2) {
        boolean iaAWin = false;
        if (p1 == ScissorPaperStone.SCISSOR && p2 == ScissorPaperStone.PAPER) {
            iaAWin = true;
            System.out.println("   Scissor cuts paper, I won!");
        } else if (p1 == ScissorPaperStone.PAPER && p2 == ScissorPaperStone.STONE) {
            iaAWin = true;
            System.out.println("   Paper wraps scissor, I won!");
        } else if (p1 == ScissorPaperStone.STONE && p2 == ScissorPaperStone.SCISSOR) {
            iaAWin = true;
            System.out.println("   Stone breaks scissor, I won!");
        }
        return iaAWin;
    }
}
