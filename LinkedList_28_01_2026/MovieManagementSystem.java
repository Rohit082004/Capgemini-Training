package LinkedList_28_01_2026;

class Movie {
    String title, director;
    int year;
    double rating;
    Movie prev, next;

    Movie(String t, String d, int y, double r) {
        title = t;
        director = d;
        year = y;
        rating = r;
    }
}

public class MovieManagementSystem {

    static Movie head = null, tail = null;

    static void addMovie(String t, String d, int y, double r) {
        Movie m = new Movie(t, d, y, r);
        if (head == null) {
            head = tail = m;
            return;
        }
        tail.next = m;
        m.prev = tail;
        tail = m;
    }

    static void deleteMovie(String title) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    static void updateRating(String title, double rating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = rating;
                return;
            }
            temp = temp.next;
        }
    }

    static void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.rating);
            temp = temp.next;
        }
    }

    static void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        addMovie("Bahubali", "Prabhas", 2010, 9.0);
        addMovie("Dhurandhar", "Aditya", 2025, 8.5);

        displayForward();
        System.out.println();

        updateRating("Avatar", 9.0);
        deleteMovie("Inception");

        displayReverse();
    }
}
