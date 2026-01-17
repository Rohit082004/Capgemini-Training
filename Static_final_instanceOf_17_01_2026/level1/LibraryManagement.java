public class LibraryManagement {
    public static void main(String[] args) {
        Book b1 = new Book(11, "Harry Potter", "JK Rowlings");

        Book.displayLibraryName();
        System.out.println();

        b1.display(b1);
    }
}

class Book {
    static String libraryName = "Chitkara Library";

    final int isbn;

    String title;
    String author;

    public Book(int isbn, String t, String a) {
        this.isbn = isbn;
        this.title = t;
        this.author = a;
    }

    public static void displayLibraryName() {
        System.out.println("Library name : " + libraryName);
    }

    public void display(Object obj) {
        if (obj instanceof Book) {
            Book b = (Book) obj;
            System.out.println("ISBN : " + isbn);
            System.out.println("Book title : " + b.title);
            System.out.println("Book author : " + b.author);
        }
        else {
            System.out.println("Not a Book object");
        }
    }
}
