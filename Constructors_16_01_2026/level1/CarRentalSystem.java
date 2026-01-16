public class CarRentalSystem {
    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        r1.displayRental();

        CarRental r2 = new CarRental("Rohit", "Sedan", 4);
        r2.displayRental();
    }
}

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    static final double COST = 1500.0;

    // default Constructor
    CarRental() {
        customerName = "Rubez";
        carModel = "SUV";
        rentalDays = 1;
    }

    // parameterized Constructor
    CarRental(String name, String model, int d) {
        this.customerName = name;
        this.carModel = model;
        this.rentalDays = d;
    }

    public double calculateCost() {
        return rentalDays * COST;
    }

    public void displayRental() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateCost());
    }

}