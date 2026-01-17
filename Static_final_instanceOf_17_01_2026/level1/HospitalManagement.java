public class HospitalManagement {
    public static void main(String[] args) {
        Patient p1 = new Patient("Rohit", 21, "Fever", 201);
        Patient p2 = new Patient("Rubez", 20, "Fracture", 202);

        p1.displayPatientDetails(p1);
        System.out.println();

        p2.displayPatientDetails(p2);
        System.out.println();

        Patient.getTotalPatients();
    }
}

class Patient {
    static String hospitalName = "Neelam Hospital";
    static int totalPatients = 0;

    final int patientID;

    String name;
    int age;
    String ailment;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    void displayPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("Hospital Name : " + hospitalName);
            System.out.println("Patient Name  : " + p.name);
            System.out.println("Patient ID    : " + p.patientID);
            System.out.println("Age           : " + p.age);
            System.out.println("Ailment       : " + p.ailment);
        } else {
            System.out.println("Object is not a Patient");
        }
    }
}
