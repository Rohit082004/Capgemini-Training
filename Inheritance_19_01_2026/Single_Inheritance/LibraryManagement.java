public class LibraryManagement {
    public static void main(String[] args) {
        Book b = new Author("Harry Potter", 2000, "JK Rowlings", "Fictional Book");
        b.displayInfo();
    }
}

class Book {
    String title;
    int publicationYear;

    Book(String t, int year) {
        this.title = t;
        this.publicationYear = year;
    }

    public void displayInfo() {
        System.out.println("Book title : " + title);
        System.out.println("Publication Year : " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author name : " + name);
        System.out.println("Author bio : " + bio);
    }
}
