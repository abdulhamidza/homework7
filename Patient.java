public class Patient {
    private static int counter = 0;
    private int patientId;
    private String name;


    public Patient(String name) {
        this.name = name;
        this.patientId = ++counter;
    }


    public int getPatientId() {
        return patientId;
    }

    // Getter for name
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Patient ID: " + patientId + ", Name: " + name;
    }
}

