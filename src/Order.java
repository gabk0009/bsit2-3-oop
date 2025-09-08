import java.util.ArrayList;


public class Order {

    private String customerName;
    private ArrayList<String> items;
    private double totalPrice;
    private String size;
    private static int totalOrders = 0;

    public Order(String customerName, String size) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
        this.size = size;
        totalOrders++;
    }

    public void addItem(String item, double price) throws IllegalArgumentException {
        if (price <= 0) {
            throw new IllegalArgumentException("Invalid price: must be greater than 0");
        }
        if (item.isEmpty()) {
            throw new IllegalArgumentException("Invalid item: cannot be empty");
        }
        items.add(item);
        totalPrice += price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getSize() {
        return size;
    }

    public static int getTotalOrders() {
        return totalOrders;
    }

    public String displayOrder() {
        return String.format("Order for %s: %d items, Total: $%.2f, Size: %s",
                customerName, items.size(), totalPrice, size);
    }

    public String toString() {
        return displayOrder();
    }
}
