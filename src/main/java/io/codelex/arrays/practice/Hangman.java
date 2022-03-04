package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] possibleWords = {"something", "test", "more", "last", "possibly", "again", "programming"};
        Random r = new Random();
        String word = possibleWords[r.nextInt(possibleWords.length)];
        char[] hiddenWord = word.toCharArray();
        String guess;
        for (int i = 0; i < word.length(); i++) {
            hiddenWord[i] = '_';
        }
        StringBuilder misses = new StringBuilder();

        while (misses.length() < 5) {

            System.out.println("----------------------");
            System.out.print("Word:   ");
            printHidden(hiddenWord);
            System.out.println("Misses: " + misses);
            System.out.print("Guess:  ");
            guess = keyboard.nextLine().substring(0, 1);

            if (word.contains(guess)) {
                revealLetters(word, hiddenWord, guess);
            } else {
                misses.append(guess);
            }

            if (String.valueOf(hiddenWord).equals(word)) {
                System.out.println("YOU GOT IT! " + word);
                break;
            }
        }
        if (misses.length() == 5) {
            System.out.println("Sorry, you lost! The word was: " + word);
        }

    }

    public static void revealLetters(String word, char[] hidden, String guess) {

        char c = guess.charAt(0);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                hidden[i] = c;
            }
        }

    }

    public static void printHidden(char[] hidden) {
        for (char c : hidden) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
