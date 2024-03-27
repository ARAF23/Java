package Lab10;

/**
 * Represents an audio file in the Music Library.
 * Extends the MusicMedia class.
 * 
 * @author Wasi Omar Bayzed
 */
class AudioFile extends MusicMedia {
    private String fileType;

    /**
     * Constructs an AudioFile object with the specified attributes.
     * 
     * @param artist       The artist of the audio file.
     * @param title        The title of the audio file.
     * @param trackCount   The number of tracks in the audio file.
     * @param totalMinutes The total duration of the audio file in minutes.
     * @param year         The year of release of the audio file.
     * @param fileType     The file type of the audio file (mp3, m4a, wav).
     * @throws IllegalArgumentException If the file type is invalid.
     */
    public AudioFile(String artist, String title, int trackCount, double totalMinutes, int year, String fileType) {
        super(artist, title, trackCount, totalMinutes, year);
        if (!fileType.equals("mp3") && !fileType.equals("m4a") && !fileType.equals("wav"))
            throw new IllegalArgumentException("Invalid file type");
        this.fileType = fileType;
    }

    /**
     * Returns a string representation of the AudioFile object.
     * 
     * @return A string representation of the AudioFile object.
     */
    @Override
    public String toString() {
        return "AudioFile [fileType=" + fileType + ", " + super.toString() + "]";
    }

    /**
     * Displays a message indicating the audio file selection.
     */
    @Override
    public void playSelection() {
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the Audio File " + getTitle() + " by " + getArtist() + ".");
        System.out.println("This file is in " + fileType + " format, from the year " + getYear() + ".");
    }
}
