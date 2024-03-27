package Lab09;

/**
 * @author wasi omar bin bayzed
 * 
 *         The Clothing class represents a clothing item, which is a type of
 *         Item with a specific size and price.
 */
class Clothing extends Item {
    private String size;
    private double price;

    /**
     * Constructs a Clothing object with the specified name, material, size, and
     * price.
     *
     * @param name     The name of the clothing item.
     * @param material The material of the clothing item.
     * @param size     The size of the clothing item.
     * @param price    The price of the clothing item.
     * @throws IllegalArgumentException If the size is null or empty, or if the
     *                                  price is less than or equal to zero.
     */
    public Clothing(String name, String material, String size, double price) {
        super(name, material);
        if (size == null || size.trim().isEmpty()) {
            throw new IllegalArgumentException("Size cannot be null or empty");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }
        this.size = size;
        this.price = price;
    }

    /**
     * Gets the size of the clothing item.
     *
     * @return The size of the clothing item.
     */
    public String getSize() {
        return size;
    }

    /**
     * Gets the price of the clothing item.
     *
     * @return The price of the clothing item.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns a string representation of the Clothing object.
     *
     * @return A string representation of the Clothing object.
     */
    @Override
    public String toString() {
        return "Clothing{" +
                "size='" + size + '\'' +
                ", price=" + price +
                "$ }" + super.toString();
    }
}
