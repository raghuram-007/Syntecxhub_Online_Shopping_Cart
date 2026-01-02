import java.util.*;

public class ShoppingCart {

    private ArrayList<Item> itemList = new ArrayList<>();
    private HashMap<String, Integer> quantityMap = new HashMap<>();
    private HashMap<String, Double> priceMap = new HashMap<>();

    // Add item to cart
    public void addItem(String name, double price, int quantity) {

        if (quantityMap.containsKey(name)) {
            quantityMap.put(name, quantityMap.get(name) + quantity);
        } else {
            itemList.add(new Item(name, price));
            quantityMap.put(name, quantity);
            priceMap.put(name, price);
        }

        System.out.println(" Item added to cart!");
    }

    // View cart
    public void viewCart() {
        if (itemList.isEmpty()) {
            System.out.println(" Cart is empty.");
            return;
        }

        System.out.println("\n------ Your Cart ------");
        for (Item item : itemList) {
            String name = item.getName();
            int qty = quantityMap.get(name);
            double price = priceMap.get(name);
            System.out.println(name + " | Qty: " + qty + " | Price: Rs." + price);
        }
    }

    // Calculate total price
    public void calculateTotal() {
        double total = 0;

        for (String name : quantityMap.keySet()) {
            total += priceMap.get(name) * quantityMap.get(name);
        }

        System.out.println(" Total Amount: Rs." + total);
    }
}
