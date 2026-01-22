package Object_Oriented_Design_Principles_22_01_2026.Object_Modeling;

import java.util.ArrayList;
import java.util.List;

public class LibraryBooks {
    public static void main(String[] args) {
        Book b1 = new Book("Clean Code", "Robert C. Martin");
        Book b2 = new Book("Effective Java", "Joshua Bloch");
        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");

        Library lib1 = new Library("Library 1");
        Library lib2 = new Library("Library 2");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);
        lib2.addBook(b3);

        lib1.displayLibrary();
        lib2.displayLibrary();
    }
}

class Book{
    String title;
    String author;

    public Book(String t, String a){
        this.title =t;
        this.author = a;
    }

    public void displayBooks(){
        System.out.println("Book title : " + title);
        System.out.println("Book author : " + author);
    }
}

class Library{
    String libName;
    List<Book> Books;

    public Library(String n){
        this.libName = n;
        Books = new ArrayList<>();
    }

    public void addBook(Book book){
        Books.add(book);
    }

    public void displayLibrary(){
        System.out.println("\nLibrary Name : " + libName);
        for (Book book : Books) {
            book.displayBooks();
        }
    }

}
