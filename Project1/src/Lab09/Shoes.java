package Lab09;

/**
 * @author wasi omar bin bayzed
 * 
 *         The Shoes class represents a pair of shoes, which is a type of Item
 *         with a
 *         specific size and price.
 */
class Shoes extends Item {
    private String size;
    private double price;

    /**
     * Constructs a Shoes object with the specified name, material, and price.
     *
     * @param name     The name of the shoes.
     * @param material The material of the shoes.
     * @param price    The price of the shoes.
     * @throws IllegalArgumentException If the price is less than or equal to zero.
     */
    public Shoes(String name, String material, double price) {
        super(name, material);
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }
        this.price = price;
    }

    /**
     * Constructs a Shoes object with the specified name, material, size, and price.
     *
     * @param name     The name of the shoes.
     * @param material The material of the shoes.
     * @param size     The size of the shoes.
     * @param price    The price of the shoes.
     * @throws IllegalArgumentException If the size is null or empty, or if the
     *                                  price is less than or equal to zero.
     */
    public Shoes(String name, String material, String size, double price) {
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
     * Gets the size of the shoes.
     *
     * @return The size of the shoes.
     */
    public String getSize() {
        return size;
    }

    /**
     * Gets the price of the shoes.
     *
     * @return The price of the shoes.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns a string representation of the Shoes object.
     *
     * @return A string representation of the Shoes object.
     */
    @Override
    public String toString() {
        return "Shoes{" +
                "size='" + size + '\'' +
                ", price=" + price +
                '}' + super.toString();
    }
}
