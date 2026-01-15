public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rao", 69, 750000);
        e1.display();
    }
}

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }
}
