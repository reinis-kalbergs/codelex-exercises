package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {

    private List<Video> videoStore = new ArrayList<Video>();

    public void listInventory() {
        for (Video film : videoStore) {
            System.out.println(film);
        }
    }

    public void checkOutFromStore(String videoTitle) {
        if (contains(videoTitle)) {
            int index = indexOfVideo(videoTitle);
            if (videoStore.get(index).isItInStore()) {
                videoStore.get(index).checkOutVideo();
            } else {
                System.out.println("Can't check out because it's not in the store.");
            }
        } else {
            System.out.println("No such video in this store.");
        }
    }

    public void returnToStore(String videoTitle) {
        if (contains(videoTitle)) {
            int index = indexOfVideo(videoTitle);
            videoStore.get(index).returnVideo();
        } else {
            System.out.println("No such video in this store.");
        }
    }

    public void addNewVideo(String title) {
        videoStore.add(new Video(title));
    }

    public void addNewVideo(Video title) {
        videoStore.add(title);
    }

    public void addNewVideo(String title, int rating) {
        videoStore.add(new Video(title, rating));
    }

    public boolean contains(String videoTitle) {
        for (Video video : this.videoStore) {
            if (video.getTitle().equals(videoTitle)) {
                return true;
            }
        }
        return false;
    }

    public void takeRating(String videoTitle, int rating) {
        if (contains(videoTitle)) {
            int index = indexOfVideo(videoTitle);
            Video tempVideo = videoStore.get(index);
            if (tempVideo.getCountRatings() == 0) {
                tempVideo.setCountRatings(1);
                tempVideo.setAverageRating((double) rating);
            } else {
                tempVideo.updateRating(rating);
            }
            System.out.println("The average rating for the film now is: " + tempVideo.getAverageRating());
            videoStore.set(index, tempVideo);
        }
    }

    public int indexOfVideo(String videoTitle) {
        for (int i = 0; i < videoStore.size(); i++) {
            if (videoStore.get(i).getTitle().equals(videoTitle)) {
                return i;
            }
        }
        System.out.println("No such video");
        return -1;
    }
}
