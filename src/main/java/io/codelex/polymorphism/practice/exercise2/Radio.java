package io.codelex.polymorphism.practice.exercise2;

import java.util.Random;

public class Radio implements Sound {
    @Override
    public void playSound() {
        final String[] radioSongs = {"Song you like", "Overplayed song", "A commercial", "Song you hate"};
        Random rnd = new Random();
        System.out.println(radioSongs[rnd.nextInt(radioSongs.length)]);

    }
}
