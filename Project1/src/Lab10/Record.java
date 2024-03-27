package Lab10;

/**
 * Represents a record in the Music Library.
 * Extends the MusicMedia class.
 * 
 * @author Wasi Omar Bayzed
 */
class Record extends MusicMedia {
    private int size; // in inches
    private double rpm; // revolutions per minute

    /**
     * Constructs a Record object with the specified attributes.
     * 
     * @param artist       The artist of the record.
     * @param title        The title of the record.
     * @param trackCount   The number of tracks on the record.
     * @param totalMinutes The total duration of the record in minutes.
     * @param year         The year of release of the record.
     * @param size         The size of the record in inches.
     * @param rpm          The revolutions per minute of the record.
     * @throws IllegalArgumentException If the size or rpm is invalid.
     */
    public Record(String artist, String title, int trackCount, double totalMinutes, int year, int size, double rpm) {
        super(artist, title, trackCount, totalMinutes, year);
        if (size != 7 && size != 10 && size != 12)
            throw new IllegalArgumentException("Invalid size for record");
        if (rpm != 33.3 && rpm != 45.0 && rpm != 78.0)
            throw new IllegalArgumentException("Invalid rpm for record");
        this.size = size;
        this.rpm = rpm;
    }

    /**
     * Returns a string representation of the Record object.
     * 
     * @return A string representation of the Record object.
     */
    @Override
    public String toString() {
        return "Record [size=" + size + ", rpm=" + rpm + ", " + super.toString() + "]";
    }

    /**
     * Displays a message indicating the record selection.
     */
    @Override
    public void playSelection() {
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the record " + getTitle() + " by " + getArtist() + ".");
        System.out.println("This is a " + size + " inch record from " + getYear() + ", playing at " + rpm + " rpm.");
    }
}
