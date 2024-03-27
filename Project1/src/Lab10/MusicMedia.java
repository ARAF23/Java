package Lab10;

/**
 * Represents a generic music media in the Music Library.
 * 
 * @author Wasi Omar Bayzed
 */
class MusicMedia {
    private String artist;
    private String title;
    private int trackCount;
    private double totalMinutes;
    private int year;

    /**
     * Constructs a MusicMedia object with the specified attributes.
     * 
     * @param artist       The artist of the music media.
     * @param title        The title of the music media.
     * @param trackCount   The number of tracks in the music media.
     * @param totalMinutes The total duration of the music media in minutes.
     * @param year         The year of release of the music media.
     * @throws IllegalArgumentException If any of the input data is invalid.
     */
    public MusicMedia(String artist, String title, int trackCount, double totalMinutes, int year) {
        if (artist == null || title == null || trackCount <= 0 || totalMinutes <= 0 || year <= 0) {
            throw new IllegalArgumentException("Invalid input data");
        }
        this.artist = artist;
        this.title = title;
        this.trackCount = trackCount;
        this.totalMinutes = totalMinutes;
        this.year = year;
    }

    /**
     * Gets the artist of the music media.
     * 
     * @return The artist of the music media.
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Gets the title of the music media.
     * 
     * @return The title of the music media.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the number of tracks in the music media.
     * 
     * @return The number of tracks in the music media.
     */
    public int getTrackCount() {
        return trackCount;
    }

    /**
     * Gets the total duration of the music media in minutes.
     * 
     * @return The total duration of the music media in minutes.
     */
    public double getTotalMinutes() {
        return totalMinutes;
    }

    /**
     * Gets the release year of the music media.
     * 
     * @return The release year of the music media.
     */
    public int getYear() {
        return year;
    }

    /**
     * Returns a string representation of the MusicMedia object.
     * 
     * @return A string representation of the MusicMedia object.
     */
    @Override
    public String toString() {
        return "Album [Artist=" + artist + ", title=" + title + ", trackCount=" + trackCount + ", totalMinutes="
                + totalMinutes + "]";
    }

    /**
     * Displays a generic message indicating the music media selection.
     */
    public void playSelection() {
        System.out.println("Thank you for using our Music Library.");
    }
}
