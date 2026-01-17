public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rohit", "Car", 1001);
        Vehicle v2 = new Vehicle("Rubez", "Bike", 1002);

        v1.displayRegistrationDetails(v1);
        System.out.println();

        Vehicle.updateRegistrationFee(6000.0);
        System.out.println();

        v2.displayRegistrationDetails(v2);
    }
}

class Vehicle {
    static double registrationFee = 5000;

    final int registrationNumber;

    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: " + registrationFee);
    }

    public void displayRegistrationDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println("Owner Name : " + v.ownerName);
            System.out.println("Vehicle Type : " + v.vehicleType);
            System.out.println("Registration Number : " + v.registrationNumber);
            System.out.println("Registration Fee : " + registrationFee);
        } else {
            System.out.println("Object is not a Vehicle");
        }
    }
}
