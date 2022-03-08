package io.codelex.classesandobjects.practice.videostore;

public class Video {

    private final String title;
    private boolean isInStore;
    private double averageRating;
    private int countRatings;

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public int getCountRatings() {
        return countRatings;
    }

    public void setCountRatings(int countRatings) {
        this.countRatings = countRatings;
    }

    public Video(String title) {
        this.title = title;
        this.isInStore = true;
        this.countRatings = 0;
    }

    public Video(String title, int rating) {
        this.title = title;
        this.isInStore = true;
        this.averageRating = rating;
        this.countRatings = 1;
    }

    public boolean isItInStore() {
        return isInStore;
    }

    public void checkOutVideo() {
        this.isInStore = false;
    }

    public String getTitle() {
        return title;
    }

    public void returnVideo() {
        this.isInStore = true;
    }

    public void updateCount() {
        this.countRatings++;
    }

    public void updateRating(int rating) {
        double sumOfRatings = (this.averageRating * this.countRatings + rating);
        updateCount();
        this.averageRating = sumOfRatings / this.countRatings;
    }

    @Override
    public String toString() {
        if (countRatings == 0) {
            return "Video{" +
                    "title='" + title + '\'' +
                    ", isInStore=" + isInStore +
                    ", rating= Not yet rated}";
        }
        return "Video{" +
                "title='" + title + '\'' +
                ", isInStore=" + isInStore +
                ", rating=" + averageRating +
                '}';
    }
}
