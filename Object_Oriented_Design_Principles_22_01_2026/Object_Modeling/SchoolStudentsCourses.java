package Object_Oriented_Design_Principles_22_01_2026.Object_Modeling;

import java.util.ArrayList;

public class SchoolStudentsCourses {
    public static void main(String[] args) {
        School school = new School("CapGemini School");

        Student s1 = new Student("Rohit");
        Student s2 = new Student("Rubez");

        Course c1 = new Course("Java");
        Course c2 = new Course("Data Structures");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c1);

        school.showStudents();
        System.out.println();

        s1.viewCourses();
        System.out.println();

        c1.showStudents();

    }
}

class Course {
    String courseName;
    ArrayList<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println(" Student: " + s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses;

    Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);   // two-way association
    }

    void viewCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println(" Enrolled in: " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    ArrayList<Student> students;

    School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println(" Student: " + s.name);
        }
    }
}
