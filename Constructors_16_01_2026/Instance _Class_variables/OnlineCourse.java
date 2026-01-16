public class OnlineCourse {
    public static void main(String[] args) {
        Course c1 = new Course("CSE", 48, 850000);
        c1.displayCourseDetails();

        Course.updateInstituteName();

        c1.displayCourseDetails();
    }
}

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Chandigarh University";

    Course(String n, int d, double f) {
        this.courseName = n;
        this.duration = d;
        this.fee = f;
    }
    
    public void displayCourseDetails() {
        System.out.println("Course name : " + courseName);
        System.out.println("Course duration : " + duration);
        System.out.println("Course fee : " + fee);
        System.out.println("Institute name : " + instituteName);
    }

    public static void updateInstituteName() {
        instituteName = "Chitkara University";
    }
}
