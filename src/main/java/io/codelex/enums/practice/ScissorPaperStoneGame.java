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
        String choice = getInput(sc).toLowerCase();

        while (!choice.equals("q")) {
            ScissorPaperStone playerMove = ScissorPaperStone.playerChoiceToEnum(choice);
            ScissorPaperStone aiMove = ScissorPaperStone.aiChoiceToEnum(rnd.nextInt(ScissorPaperStone.values().length) + 1);
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

    public static String getInput(Scanner sc) {
        String choice;
        while (true) {
            System.out.print("Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            choice = sc.nextLine().toLowerCase();
            if (choice.equals("s") || choice.equals("p") || choice.equals("t") || choice.equals("q")) {
                break;
            } else {
                System.out.println("Invalid input, try again...");
            }
        }
        return choice;
    }

    public static boolean isTie(ScissorPaperStone player, ScissorPaperStone ai) {
        return (player == ai);
    }

    public static boolean doesAIWin(ScissorPaperStone p1, ScissorPaperStone p2) {
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
