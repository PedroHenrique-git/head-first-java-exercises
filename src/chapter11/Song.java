package chapter11;

public class Song implements Comparable<Song> {
    private String title;
    private String artist;
    private int bpm;

    public Song() {}

    public Song(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    @Override
    public int compareTo(Song s) {
        return this.getTitle().compareTo(s.getTitle());
    }

    @Override
    public boolean equals(Object obj) {
        boolean isSong = obj instanceof Song;

        if(!isSong) {
            return false;
        }

        Song s = (Song) obj;

        return this.title.equals(s.getTitle()) && this.artist.equals(s.getArtist()) && this.bpm == s.bpm;
    }

    @Override
    public int hashCode() {
        return this.title.hashCode() + this.artist.hashCode() + this.bpm;
    }
}
