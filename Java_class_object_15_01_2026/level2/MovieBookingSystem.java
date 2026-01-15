public class MovieBookingSystem {
    public static void main(String[] args) {
        MovieTicket m1 = new MovieTicket("Mission Impossible", "E8", 299);
        m1.display();
    }
}

class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    public MovieTicket(String name, String seat, double p) {
        this.movieName = name;
        this.seatNumber = seat;
        this.price = p;
    }

    public void display() {
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("Price : " + price);
    }
    
}