public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager m = new Manager("Rohit", 1, 50000, 5);
        m.displayDetails();

        Developer d = new Developer("Rubez", 2, 40000, "Java");
        d.displayDetails();

        Intern i = new Intern("Rupika", 3, 30000, 6);
        i.displayDetails();
    }
}

class Employee {
    String name;
    int id;
    double salary;

    public Employee(String n, int i, double s) {
        this.name = n;
        this.id = i;
        this.salary = s;
    }

    public void displayDetails() {
        System.out.println("Employee name : " + name);
        System.out.println("Employee id : " + id);
        System.out.println("Employee salary : " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, double salary, int ts) {
        super(name, id, salary);
        this.teamSize = ts;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team size : " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String lang) {
        super(name, id, salary);
        this.programmingLanguage = lang;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming language : " + programmingLanguage);
    }
}

class Intern extends Employee {
    int duration;

    public Intern(String name, int id, double salary, int d) {
        super(name, id, salary);
        this.duration = d;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration : " + duration);
    }
}
