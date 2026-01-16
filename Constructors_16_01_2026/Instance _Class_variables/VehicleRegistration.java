public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rohit", "Sedan");
        Vehicle v2 = new Vehicle("Rubez", "SUV");
        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(50000);
        
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 35000;

    public Vehicle(String n, String v) {
        this.ownerName = n;
        this.vehicleType = v;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner name : " + ownerName);
        System.out.println("Vehicle type : " + vehicleType);
        System.out.println("Registration fee : " + registrationFee);
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

}
