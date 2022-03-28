package io.codelex.polymorphism.practice.exercise2;

public class Parrot implements Sound {
    private int currentIndex = 0;
    private final String[] talkingParrot;

    public Parrot(String parrotName) {
        this.talkingParrot = new String[]{"Hi", "my", "name", "is", parrotName};
    }

    @Override
    public void playSound() {
        System.out.println(talkingParrot[currentIndex]);
        currentIndex++;
        if (currentIndex == talkingParrot.length) {
            currentIndex = 0;
        }
    }
}
