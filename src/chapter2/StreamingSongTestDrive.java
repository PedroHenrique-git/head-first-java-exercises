package chapter2;

public class StreamingSongTestDrive {
    public static void main(String[] args) {
        StreamingSong song = new StreamingSong();

        song.artist = "The Beatles";
        song.title = "Come together";

        song.play();
        song.printDetails();
    }
}
