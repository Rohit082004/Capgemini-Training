public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e1 = new Employee(123, "Rohit", "Analyst");
        Employee e2 = new Employee(124, "Rubez", "Analyst");
        Employee e3 = new Employee(125, "Rupika", "Analyst");
        Employee e4 = new Employee(126, "Samarpit", "Analyst");

        e1.display(e1);
        e2.display(e2);
        e3.display(e3);
        e4.display(e4);

        Employee.displayTotalEmployees();
    }
}

class Employee {
    static String companyName="CapGemini";
    static int totalEmp = 0;

    final int id;

    String name;
    String designation;

    public Employee(int i, String n, String d) {
        this.id = i;
        this.name = n;
        this.designation = d;
        totalEmp++;
    }
    
    public static void displayTotalEmployees() {
        System.out.println("Total employees : " + totalEmp);
    }

    public void display(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            System.out.println("Company name : " + companyName);
            System.out.println("Employee id : " + e.id);
            System.out.println("Employee name : " + e.name);
            System.out.println("Employee designation : " + e.designation);
        }
        else {
            System.out.println("Not Employee object");
        }
    }
}
