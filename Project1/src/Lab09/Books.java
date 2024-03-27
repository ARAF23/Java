package Lab09;

/**
 * @author wasi omar bin bayzed
 * 
 *         The Books class represents a book, which is a type of Item with a
 *         specific genre and number of pages.
 */
class Books extends Item {
    private String genre;
    private int pages;

    /**
     * Constructs a Books object with the specified name, material, genre, and
     * number of pages.
     *
     * @param name     The name of the book.
     * @param material The material of the book.
     * @param genre    The genre of the book.
     * @param pages    The number of pages of the book.
     * @throws IllegalArgumentException If the genre is null or empty, or if the
     *                                  number of pages is less than or equal to
     *                                  zero.
     */
    public Books(String name, String material, String genre, int pages) {
        super(name, material);
        if (genre == null || genre.trim().isEmpty()) {
            throw new IllegalArgumentException("Genre cannot be null or empty");
        }
        if (pages <= 0) {
            throw new IllegalArgumentException("Pages must be greater than zero");
        }
        this.genre = genre;
        this.pages = pages;
    }

    /**
     * Gets the genre of the book.
     *
     * @return The genre of the book.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Gets the number of pages of the book.
     *
     * @return The number of pages of the book.
     */
    public int getPages() {
        return pages;
    }

    /**
     * Returns a string representation of the Books object.
     *
     * @return A string representation of the Books object.
     */
    @Override
    public String toString() {
        return "Books{" +
                "genre='" + genre + '\'' +
                ", pages=" + pages +
                '}' + super.toString();
    }
}
