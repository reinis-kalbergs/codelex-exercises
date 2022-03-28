package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        Parrot parrotPolly = new Parrot("Polly");
        Firework firework = new Firework();
        Radio radio = new Radio();

        List<Sound> soundList = new ArrayList<>();
        soundList.add(parrotPolly);
        soundList.add(firework);
        soundList.add(radio);

        for (int i = 0; i < 5; i++) {
            soundList.forEach(Sound::playSound);
        }
    }
}
