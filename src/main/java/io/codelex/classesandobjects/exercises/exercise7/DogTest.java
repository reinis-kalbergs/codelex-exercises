package io.codelex.classesandobjects.exercises.exercise7;

import static io.codelex.classesandobjects.exercises.exercise7.Dog.gender.*;

public class DogTest {
    public static void main(String[] args) {
        Dog dogMax = new Dog("Max", MALE);
        Dog dogRocky = new Dog("Rocky", MALE);
        Dog dogSparky = new Dog("Sparky", MALE);
        Dog dogBuster = new Dog("Buster", MALE);
        Dog dogSam = new Dog("Sam", MALE);
        Dog dogLady = new Dog("Lady", FEMALE);
        Dog dogMolly = new Dog("Molly", FEMALE);
        Dog dogCoco = new Dog("Coco", FEMALE);

        dogMax.setParents(dogLady, dogRocky);
        dogCoco.setParents(dogMolly, dogBuster);
        dogRocky.setParents(dogMolly, dogSam);
        dogBuster.setParents(dogLady, dogSparky);

        System.out.println(dogSparky.fathersName());
        System.out.println(dogCoco.fathersName());
        System.out.println(dogCoco.hasSameMotherAs(dogRocky));
        System.out.println(dogSam.hasSameMotherAs(dogRocky));
    }
}
