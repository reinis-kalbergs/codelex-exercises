package io.codelex.classesandobjects.exercises.exercise4;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public String getRating() {
        return rating;
    }

    public Movie[] getPG(Movie[] films) {
        int count = 0;
        for (Movie movie : films) {
            if (movie.getRating().equals("PG"))
                count++;
        }
        Movie[] result = new Movie[count];
        for (Movie movie : films) {
            if (movie.getRating().equals("PG")) {
                count--;
                result[count] = movie;
            }
        }
        return result;
    }

}
