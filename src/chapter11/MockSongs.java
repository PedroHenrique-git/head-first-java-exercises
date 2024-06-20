package chapter11;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    public static List<Song> getSongs() {
        List<Song> songs = new ArrayList<>();

        songs.add(new Song("somersault", "zero 7", 147));
        songs.add(new Song("$10", "hitchhiker", 140));
        songs.add(new Song("$10", "hitchhiker", 140));
        songs.add(new Song("50 ways", "simon", 102));
        songs.add(new Song("50 ways", "simon", 102));
        songs.add(new Song("Cassidy", "grateful dead", 158));
        songs.add(new Song("cassidy", "grateful dead", 158));
        songs.add(new Song("havana", "cabello", 105));
        songs.add(new Song("havana", "cabello", 105));

        return songs;
    }
}
