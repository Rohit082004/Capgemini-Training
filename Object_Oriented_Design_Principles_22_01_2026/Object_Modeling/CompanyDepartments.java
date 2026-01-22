package Object_Oriented_Design_Principles_22_01_2026.Object_Modeling;

import java.util.ArrayList;

public class CompanyDepartments {
    public static void main(String[] args) {
        Company company = new Company("TechNova");

        company.addDepartment("IT");
        company.addDepartment("HR");

        company.addEmployeeToDepartment("IT", "Rohit");
        company.addEmployeeToDepartment("IT", "Rubez");
        company.addEmployeeToDepartment("HR", "Vanshika");

        company.displayCompanyDetails();
    }
}

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    void addEmployeeToDepartment(String deptName, String empName) {
        for (Department dept : departments) {
            if (dept.deptName.equals(deptName)) {
                dept.addEmployee(empName);
            }
        }
    }

    void displayCompanyDetails() {
        System.out.println("Company: " + companyName);

        for (Department dept : departments) {
            System.out.println(" Department: " + dept.deptName);
            for (Employee emp : dept.employees) {
                System.out.println("  Employee: " + emp.name);
            }
        }
    }
}



