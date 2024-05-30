package chapter2;

public class StreamingSong {
    String title;
    String artist;
    int duration;

    void play() {
        System.out.println("PLaying song");
    }

    void printDetails() {
        System.out.println("This is " + title + " by " + artist);
    }
}
