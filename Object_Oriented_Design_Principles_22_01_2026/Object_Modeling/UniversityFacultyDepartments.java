package Object_Oriented_Design_Principles_22_01_2026.Object_Modeling;

import java.util.ArrayList;

public class UniversityFacultyDepartments {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr. Vishnu");
        Faculty f2 = new Faculty("Dr. Ashish");

        University uni = new University("Chitkara University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.displayUniversityDetails();

        uni = null;

        System.out.println("\nUniversity deleted → Departments destroyed");
        System.out.println("Faculty still exist independently:");
        f1.display();
        f2.display();
    }
}

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(" Faculty: " + name);
    }
}

class Departments {
    String deptName;

    Departments(String deptName) {
        this.deptName = deptName;
    }

    void display() {
        System.out.println(" Department: " + deptName);
    }
}

class University {
    String universityName;
    ArrayList<Departments> departments;
    ArrayList<Faculty> faculties;

    University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    void addDepartment(String deptName) {
        departments.add(new Departments(deptName));
    }

    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    void displayUniversityDetails() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (Departments d : departments) {
            d.display();
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.display();
        }
    }
}
