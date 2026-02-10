package Java8_features_10_02_2026;

import java.util.*;
import java.util.stream.*;

public class EmployeeDataProcessing {
    public static void main(String[] args) {
        List<EmployeeData> employees = Arrays.asList(
                new EmployeeData(1, "Rohit", "Engineering", 90000),
                new EmployeeData(2, "Amit", "HR", 60000),
                new EmployeeData(3, "Neha", "Engineering", 85000),
                new EmployeeData(4, "Simran", "Engineering", 75000),
                new EmployeeData(5, "Karan", "Engineering", 95000)
        );

        // Step 1 & 2: Filter + Sort
        List<EmployeeData> filteredSorted = employees.stream()
                .filter(e -> e.getDepartment().equals("Engineering") && e.getSalary() > 80000)
                .sorted(Comparator.comparing(EmployeeData::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println("Filtered & Sorted EmployeeDatas:");
        filteredSorted.forEach(System.out::println);


        // Step 3 & 4: Group + Average
        Map<String, Double> avgSalaryByDept =
                filteredSorted.stream()
                        .collect(Collectors.groupingBy(
                                EmployeeData::getDepartment,
                                Collectors.averagingDouble(EmployeeData::getSalary)
                        ));

        System.out.println("\nAverage Salary By Department:");
        avgSalaryByDept.forEach((dept, avg) ->
                System.out.println(dept + " -> " + avg));
    }
}

class EmployeeData {
    int id;
    String name;
    String department;
    double salary;

    public EmployeeData(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}

