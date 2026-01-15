public class StudentReport {
    public static void main(String[] args) {
        Student s1 = new Student("Rohit", 10, 384);

        s1.display();
    }
}

class Student {
    String name;
    int rollNo;
    int marks;

    public Student(String n, int r, int m) {
        this.name = n;
        this.rollNo = r;
        this.marks = m;
    }

    public String grade(int marks) {
        if (marks >= 450)
            return "A+";
        else if (marks >= 400)
            return "A";
        else if (marks >= 350)
            return "B+";
        else if (marks >= 300)
            return "B";
        else if (marks >= 250)
            return "C";
        else
            return "F";
    }

    public void display() {
        System.out.println("Student name : " + name);
        System.out.println("Student roll no : " + rollNo);
        System.out.println("Student marks : " + marks);
        System.out.println("Grade : " + grade(marks));
    }

}
