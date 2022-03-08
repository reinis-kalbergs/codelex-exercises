package io.codelex.classesandobjects.exercises.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse",
                "Columbia Pictures", "PG");

        Movie[] allPGfilms = movie1.getPG(new Movie[]{movie1, movie2, movie3});
        for (Movie i : allPGfilms) {
            System.out.println(i.toString());
        }

    }
}
