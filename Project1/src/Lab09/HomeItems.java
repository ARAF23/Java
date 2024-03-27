package Lab09;

/**
 * @author Wasi Omar Bin Bayzed
 * 
 *         The HomeItems class demonstrates the use of a Storage object to
 *         manage
 *         different types of items.
 */
public class HomeItems {
    /**
     * The main method creates a Storage object, adds various items to it, displays
     * the items, removes one item,
     * and displays the updated list.
     * 
     */
    public static void main(String[] args) {
        // Create a new Storage object
        Storage storage = new Storage();

        // Add items to the storage
        storage.addItem(new Furniture("Sofa", "Leather", 3));
        storage.addItem(new Electronics("Smart TV", "LED", 50));
        storage.addItem(new Clothing("Shirt", "Cotton", "M", 5));
        storage.addItem(new Shoes("Sneakers", "Leather", 40));
        storage.addItem(new Books("Novel", "Fiction", "Author1", 300));
        storage.addItem(new Books("Textbook", "Education", "Author2", 200));

        // Display all items in the storage
        storage.displayItems();

        // Display the total number of items in the storage
        System.out.println("Number of items: " + storage.getNumberOfItems());

        System.out.println("\n--------------------------------------\n");

        // Remove an item from the storage
        storage.removeItem("Sneakers");

        System.out.println("After removing an item\n");

        // Display the updated list of items in the storage
        storage.displayItems();

        // Display the total number of items in the storage after removal
        System.out.println("Number of items: " + storage.getNumberOfItems());
    }
}
