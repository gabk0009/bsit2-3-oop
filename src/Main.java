public class Main {
    public static void main(String[] args) {

        System.out.println("\nStored Books in Library");
        Book book1 = new Book("HARRY POTTER", "J.K. ROWLING", 300);
        Book book2 = new Book("WAR AND PEACE", "LEO TOLSTOY", 150);
        Book book3 = new Book("HAMLET", "WILLIAM SHAKESPEARE", 200);

        System.out.println("\nList of Books in Library:");

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book1.displayInfo();

        book2.borrowBook();
        book2.displayInfo();

        book2.returnBook();
        book2.displayInfo();

        System.out.println("\n------------------------");
        System.out.println("\nList of Books that been borrowed:");
        System.out.println("\nBook 1. " + book1.title + " of " + book1.author);
        System.out.println("Book 2. " + book2.title + " of " + book2.author);
        System.out.println("\nList of Books that been returned:");
        System.out.println("\nBook 1. " + book1.title + " of " + book1.author);

    }
}
