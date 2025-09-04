// Main class
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Book Record System ===\n");

        System.out.println("Adding books and ratings...");

        Book book1 = new Book("Java Programming", "John Smith");
        Book book2 = new Book("Data Structures", "Alice Brown");
        Book book3 = new Book("Web Development", "Bob Wilson");

        try {
            book1.addRating(4);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        book1.addMultipleRatings(5, 4, 3, 5);

        try {
            book1.addRating(6);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nBook Results:");
        System.out.println(book1.displayBook());
        System.out.println(book2.displayBook());
        System.out.println(book3.displayBook());

        System.out.println("\nTotal books created: " + Book.getTotalBooks());

        Book highestRated = book1;
        if (book2.getAverageRating() > highestRated.getAverageRating()) {
            highestRated = book2;
        }
        if (book3.getAverageRating() > highestRated.getAverageRating()) {
            highestRated = book3;
        }

        System.out.println("Highest rated book: " + highestRated.displayHighestRated());
    }
}
