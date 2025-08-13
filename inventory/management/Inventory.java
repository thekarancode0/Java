package inventory.management;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final String ownerName;
    private final String location;
    private final HashMap<String, Integer> inventory;

    Inventory(String ownerName, String location) {
        inventory = new HashMap<>();
        this.ownerName = ownerName;
        this.location = location;
    }

    protected void showOwnerInfo(){
        System.out.println("----OWNER INFORMATION----");
        System.out.println("Name: " + ownerName );
        System.out.println("Location: " + location);
    }
    protected void addItem(String productName, int productQuantity) {
        inventory.put(productName, productQuantity);
    }

    protected void removeItem(String productToRemove, int quantityToRemove)
            throws ItemNotFoundException, InvalidQuantityException{

        if(!inventory.containsKey(productToRemove)){
            throw new ItemNotFoundException("Item '"+ productToRemove + " not found in inventory.");
        }

        int inStock = inventory.get(productToRemove);
        if(quantityToRemove <=0 ){
            throw  new InvalidQuantityException("Quantity must be greater than 0.");
        }

        if(quantityToRemove > inStock){
            throw new InvalidQuantityException("Not enough stock. In stock: " + inStock);
        }
            int newQuantity = inStock - quantityToRemove;
            inventory.put(productToRemove, newQuantity);

    }

    protected void checkStock(String productName) {

        System.out.println("In Stock...");
        if (!inventory.containsKey(productName)) {
            System.out.println(productName + "  " + inventory.get(productName));
        } else {
            System.out.println("Out of Stock");
        }
    }

    protected void listAllItems() {
        System.out.println("List of All Items");
        System.out.printf("%-15s %10s%n", "Product", " Quantity");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.printf("%-15s %10d%n", entry.getKey(), entry.getValue());
        }

    }
}

