public class SchoolSystem {
    public static void main(String[] args) {

        Person teacher = new Teacher("Rohit", 21, "Computer Science");
        Person student = new Student("Rubez", 20, "$th year");
        Person staff   = new Staff("Rupika", 21, "CSE");

        teacher.displayDetails();
        ((Teacher) teacher).displayRole();
        System.out.println();

        student.displayDetails();
        ((Student) student).displayRole();
        System.out.println();

        staff.displayDetails();
        ((Staff) staff).displayRole();
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role : Teacher");
        System.out.println("Subject : " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role : Student");
        System.out.println("Grade : " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role : Staff");
        System.out.println("Department : " + department);
    }
}


