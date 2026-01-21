package Encapsulation_Polymorphism_20_01_2026;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> al = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Rohit", 500000);
        Employee e2 = new PartTimeEmployee(110, "Rubez", 40, 500);

        e1.assignDepartment("IT");
        e2.assignDepartment("HR");

        al.add(e1);
        al.add(e2);

        for(Employee e : al){
            e.displayDetails();
            System.out.println();
        }
    }
}

interface Department{
    void assignDepartment(String dep);
    String getDepartmentDetails();
}

abstract class Employee implements Department{
    private int employeeId;
    private String name;
    double baseSalary;

    private String department;

    Employee(int id, String n, double sal){
        this.employeeId = id;
        this.name = n;
        this.baseSalary = sal;
    }

    abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("Employee id : " + employeeId);
        System.out.println("Employee name : " + name);
        System.out.println("Employee base salary : " + calculateSalary());
        System.out.println("Employee department : " + department);
    }

    public void setEmpId(int empId){
        this.employeeId = empId;
    }
    public int getEmpId(){
        return employeeId;
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }

    @Override
    public void assignDepartment(String dep){
        this.department = dep;
    }

    @Override
    public String getDepartmentDetails(){
        return department;
    }

}

class FullTimeEmployee extends Employee{
    FullTimeEmployee(int id, String n, double sal){
        super(id, n, sal);
    }

    @Override
    public double calculateSalary(){
        return baseSalary;
    }
}

class PartTimeEmployee extends Employee{
    int workHours;
    double hourlyRate;
    PartTimeEmployee(int id, String n, int wh, double hr){
        super(id, n, 0);
        this.workHours = wh;
        this.hourlyRate = hr;
    }

    @Override
    public double calculateSalary(){
        return workHours * hourlyRate;
    }
}
