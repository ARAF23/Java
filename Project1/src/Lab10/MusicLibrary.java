package Lab10;

import java.util.ArrayList;

/**
 * Represents a Music Library that manages a collection of MusicMedia items.
 * 
 * @author Wasi Omar Bayzed
 */
class MusicLibrary {
    private ArrayList<MusicMedia> library;

    /**
     * Constructs a MusicLibrary object with an empty collection.
     */
    public MusicLibrary() {
        library = new ArrayList<>();
    }

    /**
     * Adds a MusicMedia item to the library.
     * 
     * @param media The MusicMedia item to be added.
     */
    public void addMedia(MusicMedia media) {
        if (media != null)
            library.add(media);
    }

    /**
     * Displays the contents of the music library.
     */
    public void displayLibrary() {
        for (MusicMedia media : library) {
            System.out.println(media);
        }
    }

    /**
     * Plays the title specified by the user.
     * 
     * @param title The title of the music to be played.
     */
    public void playTitle(String title) {
        for (MusicMedia media : library) {
            if (media.getTitle().equals(title)) {
                media.playSelection();
                return;
            }
        }
        System.out.println("Title not found in the library.");
    }
}
