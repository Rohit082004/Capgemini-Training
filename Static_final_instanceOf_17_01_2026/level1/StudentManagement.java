public class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Rohit", 101, 'A');
        Student s2 = new Student("Rubez", 102, 'B');

        s1.display(s1);
        System.out.println();
        s1.updateGrade(s1, 'B');
        System.out.println();
        s2.display(s2);
        System.out.println();

        Student.displayTotalStudents();
    }
}

class Student {
    static String universityName = "Chitkara University";
    static int totalStudents = 0;

    final int rollNumber;

    String name;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void display(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("University Name : " + universityName);
            System.out.println("Student Name : " + s.name);
            System.out.println("Roll Number : " + s.rollNumber);
            System.out.println("Grade : " + s.grade);
        } else {
            System.out.println("Object is not a Student");
        }
    }

    public void updateGrade(Object obj, char newGrade) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.grade = newGrade;
            System.out.println("updated successfully!");
        } else {
            System.out.println("invalid student object");
        }
    }
}
