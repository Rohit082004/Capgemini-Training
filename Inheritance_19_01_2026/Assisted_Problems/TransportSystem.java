public class TransportSystem {
    public static void main(String[] args) {
        Vehicle c = new Car(300, "Diesel", 2);
        c.displayInfo();

        Vehicle t = new Truck(150, "Diesel", 22);
        t.displayInfo();

        Vehicle b = new Motorcycle(300, "Petrol", "50cc");
        b.displayInfo();
    }
}

class Vehicle {
    int maxSpeed;
    String fuelType;

    public Vehicle(int ms, String ft) {
        this.maxSpeed = ms;
        this.fuelType = ft;
    }

    public void displayInfo() {
        System.out.println("Maximum speed : " + maxSpeed);
        System.out.println("Fuel type : " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int ms, String ft, int seatCapacity) {
        super(ms, ft);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seating capacity : " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int numberOfTyres;

    Truck(int ms, String ft, int tyre) {
        super(ms, ft);
        this.numberOfTyres = tyre;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of tyres : " + numberOfTyres);
    }
}

class Motorcycle extends Vehicle {
    String engine;

    public Motorcycle(int ms, String ft, String e) {
        super(ms, ft);
        this.engine = e;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine capacity : " + engine);
    }
}