public class BookHandling {
    public static void main(String[] args) {
        Books b1 = new Books("Harry Potter", "J.K. Rowlings", 1999);
        b1.display();

        Books b2 = new Books();
        b2.display();
    }
}

class Books {
    String title;
    String author;
    double price;

    // default constructor
    Books() {
        this.title = "Harry Potter";
        this.author = "J.K. Rowlings";
        this.price = 1999;
    }

    // Parameterized constructor
    Books(String t, String a, double p) {
        this.title = t;
        this.author = a;
        this.price = p;
    }

    public void display() {
        System.out.println("Book Title : " + title);
        System.out.println("Book author : " + author);
        System.out.println("Book price : " + price);
    }
}
