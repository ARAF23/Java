package Lab09;

/**
 * @author wasi omar bin bayzed
 * 
 *         The Furniture class represents a furniture item, which is a type of
 *         Item with
 *         a specific number of legs.
 */
class Furniture extends Item {
    private int legs;

    /**
     * Constructs a Furniture object with the specified name, material, and number
     * of legs.
     *
     * @param name     The name of the furniture.
     * @param material The material of the furniture.
     * @param legs     The number of legs of the furniture.
     * @throws IllegalArgumentException If the number of legs is less than or equal
     *                                  to zero.
     */
    public Furniture(String name, String material, int legs) {
        super(name, material);
        if (legs <= 0) {
            throw new IllegalArgumentException("Legs must be greater than zero");
        }
        this.legs = legs;
    }

    /**
     * Gets the number of legs of the furniture.
     *
     * @return The number of legs of the furniture.
     */
    public int getLegs() {
        return legs;
    }

    /**
     * Returns a string representation of the Furniture object.
     *
     * @return A string representation of the Furniture object.
     */
    @Override
    public String toString() {
        return "Furniture{" +
                "legs=" + legs +
                '}' + super.toString();
    }
}
