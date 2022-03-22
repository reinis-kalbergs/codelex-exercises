package io.codelex.enums.practice;

public enum ScissorPaperStone {
    SCISSOR("s", 1),
    PAPER("p", 2),
    STONE("t", 3);

    private final String playerChoice;
    private final int AIChoice;

    ScissorPaperStone(String playerChoice, int AIChoice) {
        this.playerChoice = playerChoice;
        this.AIChoice = AIChoice;
    }

    public static ScissorPaperStone playerChoiceToEnum(String choice) {
        if (choice.equals(SCISSOR.playerChoice)) {
            return SCISSOR;
        } else if (choice.equals(PAPER.playerChoice)) {
            return PAPER;
        } else if (choice.equals(STONE.playerChoice)) {
            return STONE;
        } else {
            System.out.println("Invalid input.");
            return null;
        }
    }

    public static ScissorPaperStone aiChoiceToEnum(int choice) {
        if (choice == SCISSOR.AIChoice) {
            return SCISSOR;
        } else if (choice == PAPER.AIChoice) {
            return PAPER;
        } else if (choice == STONE.AIChoice) {
            return STONE;
        } else {
            System.out.println("Invalid input.");
            return null;
        }
    }
}
