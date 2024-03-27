package Lab09;

/**
 * @author wasi omar bin bayzed
 * 
 *         The Electronics class represents an electronic item, which is a type
 *         of Item
 *         with a specific size.
 * 
 */
class Electronics extends Item {
    private int size;

    /**
     * Constructs an Electronics object with the specified name, material, and size.
     *
     * @param name     The name of the electronic item.
     * @param material The material of the electronic item.
     * @param size     The size of the electronic item.
     * @throws IllegalArgumentException If the size is less than or equal to zero.
     */
    public Electronics(String name, String material, int size) {
        super(name, material);
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be greater than zero");
        }
        this.size = size;
    }

    /**
     * Gets the size of the electronic item.
     *
     * @return The size of the electronic item.
     */
    public int getSize() {
        return size;
    }

    /**
     * Returns a string representation of the Electronics object.
     *
     * @return A string representation of the Electronics object.
     */
    @Override
    public String toString() {
        return "Electronics{" +
                "size=" + size +
                '}' + super.toString();
    }
}
