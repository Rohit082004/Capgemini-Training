public class BookHandling {
    public static void main(String[] args) {
        Book b1 = new Book("CapGemini", "Rohit", 999);
        b1.display();
    }
}

class Book {
    String title;
    String author;
    double price;

    Book(String t, String a, double p) {
        this.title = t;
        this.author = a;
        this.price = p;
    }

    public void display() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}
