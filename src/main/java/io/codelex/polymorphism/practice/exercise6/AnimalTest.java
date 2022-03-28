package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = inputAnimal(scanner);
        List<Animal> animalList = new ArrayList<>();
        int index = 1;

        while (!input[0].equalsIgnoreCase("end")) {
            if (index % 2 == 0) {
                feedAnimal(input, animalList);
                System.out.println(animalList.get(animalList.size() - 1));
                input = inputAnimal(scanner);
            } else {
                createAnimal(input, animalList);
                animalList.get(animalList.size() - 1).makeSound();
                input = inputFood(scanner);
            }
            index++;
        }

        System.out.println(animalList);
    }

    public static String[] inputAnimal(Scanner sc) {
        while (true) {

            String[] input = sc.nextLine().trim().split(" ");
            switch (input.length) {
                case 1 -> {
                    if (input[0].equalsIgnoreCase("End")) {
                        return input;
                    }
                }
                case 4 -> {
                    //Animal is a mouse or a zebra or a tigers
                    if (isNumeric(input[2])) {
                        String animalType = input[0].toLowerCase();
                        if (animalType.equals("mouse") || animalType.equals("tiger") || animalType.equals("zebra")) {
                            return input;
                        }
                    }
                }
                case 5 -> {
                    if (input[0].equalsIgnoreCase("cat") && isNumeric(input[2])) {
                        //Animal is a cat
                        return input;
                    }
                }
            }
            System.out.println("Invalid input. Please try again. To end type 'end'.");
        }
    }

    public static void createAnimal(String[] input, List<Animal> animalList) {
        switch (input[0].toLowerCase()) {
            case "cat" -> animalList.add(new Cat(input[1], Double.parseDouble(input[2]), input[3], input[4]));
            case "zebra" -> animalList.add(new Zebra(input[1], Double.parseDouble(input[2]), input[3]));
            case "tiger" -> animalList.add(new Tiger(input[1], Double.parseDouble(input[2]), input[3]));
            case "mouse" -> animalList.add(new Mouse(input[1], Double.parseDouble(input[2]), input[3]));
        }
    }

    public static boolean isNumeric(String potentialNumber) {
        try {
            Double.parseDouble(potentialNumber);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String[] inputFood(Scanner sc) {
        while (true) {

            String[] input = sc.nextLine().trim().split(" ");
            if (input[0].equalsIgnoreCase("End")) {
                return input;
            }
            if (input.length == 2) {
                if ((input[0].equalsIgnoreCase("Vegetable") || input[0].equalsIgnoreCase("Meat"))
                        && isNumeric(input[1])) {
                    return input;
                }
            }
            System.out.println("Invalid input. Please try again. To end type 'end'.");
        }
    }

    public static void feedAnimal(String[] input, List<Animal> animalList) {
        int lastIndex = animalList.size() - 1;
        switch (input[0].toLowerCase()) {
            case "vegetable" -> animalList.get(lastIndex).eat(new Vegetable(Integer.parseInt(input[1])));
            case "meat" -> animalList.get(lastIndex).eat(new Meat(Integer.parseInt(input[1])));
        }
    }
}
