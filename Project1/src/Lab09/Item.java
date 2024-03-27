package Lab09;

/**
 * @author wasi omar bin bayzed
 * 
 *         The Item class represents an item with a name and material.
 */
class Item {
    private String name;
    private String material;

    /**
     * Constructs an Item object with the specified name and material.
     *
     * @param name     The name of the item.
     * @param material The material of the item.
     * @throws IllegalArgumentException If the name or material is null or empty.
     */
    public Item(String name, String material) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (material == null || material.trim().isEmpty()) {
            throw new IllegalArgumentException("Material cannot be null or empty");
        }
        this.name = name;
        this.material = material;
    }

    /**
     * Gets the name of the item.
     *
     * @return The name of the item.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the material of the item.
     *
     * @return The material of the item.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Returns a string representation of the Item object.
     *
     * @return A string representation of the Item object.
     */
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
