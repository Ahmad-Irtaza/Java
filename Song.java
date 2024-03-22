import java.util.ArrayList;
import java.util.List;

class Song {
    private String title;
    private String artist;
    private int duration; 

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " (" + duration + " seconds)";
    }
}

class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return name + " (" + songs.size() + " songs)";
    }
}

class MusicPlayer {
    private Playlist currentPlaylist;

    public MusicPlayer() {
        this.currentPlaylist = null;
    }

    public void play(Playlist playlist) {
        this.currentPlaylist = playlist;
        System.out.println("Playing playlist: " + playlist);
        for (Song song : playlist.getSongs()) {
            System.out.println("Now playing: " + song);
            try {
                Thread.sleep(song.getDuration() * 1000); // simulate playback duration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Playlist finished.");
        this.currentPlaylist = null;
    }

    public Playlist getCurrentPlaylist() {
        return currentPlaylist;
    }
}

public class MusicPlayerApp {
    public static void main(String[] args) {
        // Create songs
        Song song1 = new Song("Song 1", "Artist 1", 180);
        Song song2 = new Song("Song 2", "Artist 2", 240);

        // Create playlist
        Playlist playlist1 = new Playlist("Playlist 1");
        playlist1.addSong(song1);
        playlist1.addSong(song2);

        // Create music player
        MusicPlayer player = new MusicPlayer();

        // Play playlist
        player.play(playlist1);
    }
}
