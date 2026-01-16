public class HotelBookingSystem {
    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        b1.displayBooking();

        HotelBooking b2 = new HotelBooking("Rohit", "Deluxe", 3);
        b2.displayBooking();

        HotelBooking b3 = new HotelBooking(b2);
        b3.displayBooking();
    }
}

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // default Constructor
    HotelBooking() {
        guestName = "Rubez";
        roomType = "Standard";
        nights = 1;
    }

    // parameterized Constructor
    HotelBooking(String name, String type, int n) {
        this.guestName = name;
        this.roomType = type;
        this.nights = n;
    }

    HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}
