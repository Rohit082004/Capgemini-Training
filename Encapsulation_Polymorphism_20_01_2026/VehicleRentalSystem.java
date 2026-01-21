package Encapsulation_Polymorphism_20_01_2026;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> al = new ArrayList<>();

        Vehicle c = new Car("PB06AB1234", 2000, "car123");
        Vehicle b = new Bike("PB06CD5678", 500, "bike123");
        Vehicle t = new Truck("PB06EF9012", 1000, "truck123");

        al.add(c);
        al.add(b);
        al.add(t);

        int days = 3;

        for(Vehicle v : al){
            double insurance = v.calculateInsurance(days);
            double rent = v.calculateRentalCost(days);

            System.out.println("Vehicle Type : " + v.getType());
            System.out.println("Vehicle No : " + v.getVehicleNumber());
            System.out.println("Rental Cost : " + rent);
            System.out.println("Insurance Cost : " + insurance);
            System.out.println("Total Cost: ₹" + (rent + insurance));
            System.out.println();
        }
    }
}

interface Insurable{
    double calculateInsurance(int days);
    String getInsuranceDetails();
}

abstract class Vehicle implements Insurable{
    private String vehicleNumber;
    private String type;
    double rentalRate;

    private String insurancePolicyNumber;

    public Vehicle(String no, String t, double rate, String policyNo){
        this.vehicleNumber = no;
        this.type=t;
        this.rentalRate= rate;
        this.insurancePolicyNumber = policyNo;
    }

    abstract double calculateRentalCost(int days);

    public void setVehicleNumber(String no){
        this.vehicleNumber=no;
    }
    public String getVehicleNumber(){
        return vehicleNumber;
    }

    public String getType(){
        return type;
    }

    public double getRentalRate(){
        return rentalRate;
    }

    protected String getInsurancePolicyNumber(){
        return insurancePolicyNumber;
    }

}

class Car extends Vehicle{
    Car(String no, double rate, String policyNo){
        super(no, "Car", rate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance(int days){
        return 200 * days;
    }

    @Override
    public String getInsuranceDetails(){
        return "200 rupees per day";
    }

}

class Bike extends Vehicle{
    Bike(String no, double rate, String policyNo){
        super(no, "Bike", rate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance(int days){
        return 100 * days;
    }

    @Override
    public String getInsuranceDetails(){
        return "100 rupees per day";
    }
}

class Truck extends Vehicle{
    Truck(String no, double rate, String policyNo){
        super(no, "Truck", rate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance(int days){
        return 500 * days;
    }

    @Override
    public String getInsuranceDetails(){
        return "500 rupees per day";
    }
}

