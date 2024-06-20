package chapter11;

import java.util.*;

class ComparatorByArtist implements Comparator<Song> {
    @Override
    public int compare(Song songA, Song songB) {
        return songA.getArtist().compareTo(songB.getArtist());
    }
}

public class App {
    public static void main(String[] args) {
        App.go();
    }

    //public void takeAnimals(List<? extends Animal> animals) {
        //for(Animal a : animals) {
            //a.eat();
        //}
    //}

    public static void go() {
        ComparatorByArtist c = new ComparatorByArtist();
        var songList = Collections.unmodifiableCollection(MockSongs.getSongs());
        Map<String, Integer> scores = new HashMap<>();
        //<String> arr = List.of("pedro", "henrique", "da", "silva");
        //Set<String> s = Set.of("pedro", "henrique", "da", "silva");
        //Map<String, Integer> m = Map.of("v", 1, "p", 2);
        //Map<String, Integer> m2 = Map.ofEntries(Map.entry("k1", 1), Map.entry("k2", 2));

        //System.out.println(arr);

        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler", 420);

        scores.forEach((a, b) -> System.out.println("[a]: " + a + " [b]: " + b));

        // First way to sort some list
        //Collections.sort(songList);

        // Second way to sort some list
        //songList.sort(c);

        // Second way with shortcut
        //songList.sort(new Comparator<Song>() {
            //@Override
            //public int compare(Song sA, Song sB) {
                //return sA.getArtist().compareTo(sB.getArtist());
            //}
        //});

        // Using lambdas
        //songList.sort((sA, sB) -> sA.getArtist().compareTo(sB.getArtist()));

        //Set<Song> songSet = new HashSet<>(songList);

        Set<Song> songSet = new TreeSet<>((sA, sB) -> sA.getArtist().compareTo(sB.getArtist()));

        songSet.addAll(songList);

        for(Song s : songSet) {
            System.out.println(s.getTitle());
        }
    }
}
