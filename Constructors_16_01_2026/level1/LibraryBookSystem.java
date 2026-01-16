public class LibraryBookSystem {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Harry Potter", "J.K. Rowlings", 1999);
        b1.displayBook();
        b1.borrowBook();
        b1.borrowBook();
    }
}

class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;

    LibraryBook(String t, String a, double p) {
        this.title = t;
        this.author = a;
        this.price = p;
        this.availability = true;
    }

    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book is currently unavailable.");
        }
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
    }
}
