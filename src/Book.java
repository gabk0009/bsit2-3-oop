public class Book {

    String title = "";
    String author = "";
    int pages = 0;
    boolean isAvailable;


    public Book(String myTitle, String myAuthor, int page) {
        title = myTitle;
        author = myAuthor;
        pages = page;
        isAvailable = true;
        System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
    }

    public void displayInfo() {
        System.out.println("\nTitle: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);


    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("\n------------------------");
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Unfortunately, this book is currently unavailable.");
        }
    }

    public void returnBook() {
            isAvailable = true;
            System.out.println("\n------------------------");
            System.out.println("Book Returned");

        }
    }