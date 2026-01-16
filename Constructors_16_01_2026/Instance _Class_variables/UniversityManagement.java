public class UniversityManagement {
    public static void main(String[] args) {
        PostgraduateStudent s1 = new PostgraduateStudent(10, "Rohit", 8.5, "CSE");
        s1.display();

        s1.setCGPA(9.0);

        s1.display();
    }
}

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int r, String n, double c) {
        this.rollNumber = r;
        this.name = n;
        this.cgpa = c;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return this.cgpa;
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    public PostgraduateStudent(int r, String n, double c, String s) {
        super(r, n, c);
        this.specialization = s;
    }

    public void display() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Student name : " + name);
        System.out.println("CGPA : " + getCGPA());
        System.out.println("Specialization : " + specialization);
    }
    
}