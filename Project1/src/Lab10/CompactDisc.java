package Lab10;

/**
 * Represents a Compact Disc (CD) in the Music Library.
 * Extends the MusicMedia class.
 * 
 * @author Wasi Omar Bayzed
 */
class CompactDisc extends MusicMedia {
    private boolean bonusTracks;
    private boolean digipac;

    /**
     * Constructs a CompactDisc object with the specified attributes.
     * 
     * @param artist       The artist of the CD.
     * @param title        The title of the CD.
     * @param trackCount   The number of tracks on the CD.
     * @param totalMinutes The total duration of the CD in minutes.
     * @param year         The year of release of the CD.
     * @param bonusTracks  Indicates whether the CD contains bonus tracks.
     * @param digipac      Indicates whether the CD is packaged in digipac format.
     */
    public CompactDisc(String artist, String title, int trackCount, double totalMinutes, int year, boolean bonusTracks,
            boolean digipac) {
        super(artist, title, trackCount, totalMinutes, year);
        this.bonusTracks = bonusTracks;
        this.digipac = digipac;
    }

    /**
     * Returns a string representation of the CompactDisc object.
     * 
     * @return A string representation of the CompactDisc object.
     */
    @Override
    public String toString() {
        return "CompactDisc [bonusTracks=" + bonusTracks + ", digipac=" + digipac + ", " + super.toString() + "]";
    }

    /**
     * Displays a message indicating the CD selection.
     */
    @Override
    public void playSelection() {
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the CD " + getTitle() + " by " + getArtist() + ".");
        System.out.println("This is a Compact Disc from the year " + getYear() + ".");
    }
}
