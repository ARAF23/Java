package Lab10;

/**
 * Driver class to test the functionality of the MusicLibrary.
 * 
 * @author Wasi Omar Bayzed
 */
public class Driver {
    /**
     * Main method to test the MusicLibrary.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

        // Creating instances of each subtype
        Record record = new Record("The Beatles", "Hey Jude", 1, 7, 1968, 7, 45.0);
        CompactDisc cd = new CompactDisc("Neil Young & Crazy Horse", "Everybody Knows This Is Nowhere", 4, 40, 1969,
                false, false);
        AudioFile audioFile = new AudioFile("Donnie Iris and the Cruisers", "Ah Leah!", 1, 4, 1980, "wav");

        // Adding instances to the library
        library.addMedia(record);
        library.addMedia(cd);
        library.addMedia(audioFile);

        // Displaying the library
        System.out.println("Library Contents:");
        library.displayLibrary();

        // Playing a specific title
        System.out.println();
        library.playTitle("Hey Jude");
        System.out.println();
        library.playTitle("Everybody Knows This Is Nowhere");
        System.out.println();
        library.playTitle("Ah Leah!");
        System.out.println();
        library.playTitle("Unknown Title"); // Testing non-existing title
    }
}
