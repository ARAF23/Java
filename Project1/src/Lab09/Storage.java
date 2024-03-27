package Lab09;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wasi omar bin bayzed
 * 
 *         The Storage class represents a storage system for managing items.
 */
class Storage {
    private List<Item> items = new ArrayList<>();

    /**
     * Adds an item to the storage.
     *
     * @param item The item to be added.
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * Removes an item from the storage by its name.
     *
     * @param name The name of the item to be removed.
     */
    public void removeItem(String name) {
        items.removeIf(item -> item.getName().equals(name));
    }

    /**
     * Displays all items currently stored in the storage.
     */
    public void displayItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    /**
     * Gets the total number of items stored in the storage.
     *
     * @return The number of items stored in the storage.
     */
    public int getNumberOfItems() {
        return items.size();
    }
}
