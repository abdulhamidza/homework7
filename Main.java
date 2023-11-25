
public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        // Creating 4 Patient objects and adding them to the array
        hospital.patients[0] = new Patient("John Doe");
        hospital.patients[1] = new Patient("Jane Doe");
        hospital.patients[2] = new Patient("Alice");
        hospital.patients[3] = new Patient("Bob");

        // Printing information for all patients using toString method
        for (Patient patient : hospital.patients) {
            System.out.println(patient.toString());
        }
    }
}