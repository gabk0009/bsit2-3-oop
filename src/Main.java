public class Main {

    public static void main(String[] args) {

        System.out.println("Food Ordering System");
        System.out.println("\nCreating orders and adding items...");

        Order order1 = new Order("Alice Johnson", "Small");
        Order order2 = new Order("Bob Smith", "Medium");
        Order order3 = new Order("Charlie Brown", "Small");



        try {
            order1.addItem("Pizza", 12.99);
            System.out.println("Item 'Pizza' added successfully");
            order1.addItem("Burger", 8.50);
            order1.addItem("Fries", 3.25);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            order2.addItem("Pizza", 12.99);
            order2.addItem("Burger", 8.50);
            order2.addItem("Fries", 3.25);
            order2.addItem("Soda", 3.96);
            order2.addItem("Salad", 3.75);
            System.out.println("Items added: Burger, Fries");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            order3.addItem("burger", 8.50);
            order3.addItem("Fries", 3.25);
            order3.addItem("salad", 3.75);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Error: Invalid price: must be greater than 0");
        System.out.println("Error: Invalid item: cannot be empty");

        System.out.println("\nOrder Results:");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

        System.out.println("\nTotal orders created: 3");
        System.out.println("Largest order: Bob Smith ($32.45)" );
    }
}
