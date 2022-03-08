package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        VideoStore videoStore = new VideoStore();
        videoStore.addNewVideo("The Matrix", 5);
        videoStore.addNewVideo("Godfather II", 10);
        videoStore.addNewVideo("Star Wars Episode IV: A New Hope");
        videoStore.listInventory();
        videoStore.checkOutFromStore("Godfather II");
        videoStore.checkOutFromStore("The Matrix");
        videoStore.returnToStore("The Matrix");
        videoStore.takeRating("The Matrix", 3);
        videoStore.takeRating("The Matrix", 1);
        videoStore.takeRating("Godfather II", 8);
        videoStore.takeRating("Star Wars Episode IV: A New Hope", 7);
        videoStore.listInventory();


        while (true) {
            System.out.println();
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to add a video to the store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to rate a video (as user)");
            System.out.println("Choose 5 to see to selection");

            int n = keyboard.nextInt();
            keyboard.nextLine();
            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard, videoStore);
                    break;
                case 2:
                    rentVideo(keyboard, videoStore);
                    break;
                case 3:
                    returnVideo(keyboard, videoStore);
                    break;
                case 4:
                    rateVideo(keyboard, videoStore);
                    break;
                case 5:
                    videoStore.listInventory();
                    break;
                default:
                    break;
            }
        }
    }

    private static void fillVideoStore(Scanner scanner, VideoStore videoStore) {

        System.out.println("Enter movie name");
        String movieName = scanner.nextLine();
        System.out.println("Enter rating");
        int rating = scanner.nextInt();
        scanner.nextLine();
        videoStore.addNewVideo(movieName, rating);
    }

    private static void rentVideo(Scanner scanner, VideoStore videoStore) {
        System.out.println("Which video you want to rent:");
        String movieTitle = scanner.nextLine();
        videoStore.checkOutFromStore(movieTitle);
    }

    private static void returnVideo(Scanner scanner, VideoStore videoStore) {
        System.out.println("Which video you want to return:");
        String movieTitle = scanner.nextLine();
        videoStore.returnToStore(movieTitle);
    }

    private static void rateVideo(Scanner scanner, VideoStore videoStore) {

        System.out.println("Which video you want to rate:");
        String movieTitle = scanner.nextLine();
        System.out.println("What rating would you give it");
        int movieRating = Integer.parseInt(scanner.nextLine());
        System.out.println("Your rating" + movieRating);
        videoStore.takeRating(movieTitle, movieRating);
    }
}
