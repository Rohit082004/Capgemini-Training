public class BookLibrary {
    public static void main(String[] args) {
        EBook b1 = new EBook(149, "Meow Meow", "Kali Billi");

        b1.display();
        b1.setAuthor("Billu Badmash");
        b1.display();
    }
}

class Book {
    public int ISBN;
    protected String title;
    private String author;

    Book(int i, String t, String a) {
        this.ISBN = i;
        this.title = t;
        this.author = a;
    }

    public void setAuthor(String a) {
        this.author = a;
    }

    public String getAuthor() {
        return this.author;
    }
}

class EBook extends Book {

    public EBook(int i, String t, String a) {
        super(i, t, a);
    }

    public void display() {
        System.out.println("ISBN : " + ISBN);
        System.out.println("Book title : " + title);
        System.out.println("Book author : " + getAuthor());
    }
}
