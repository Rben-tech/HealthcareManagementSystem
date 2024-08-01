import java.util.HashMap;

public class patientLookup {
    // Map to store patients by ID
    private final HashMap<String, patient> patientMap;

    public patientLookup()
    // Constructor to initialize the map
     {
        patientMap = new HashMap<>();
    }
// Method to add a patient to the map
    public void addPatient(patient patient) {
        patientMap.put(patient.id, patient);
    }
// Method to get a patient by ID
    public patient getPatient(String id) {
        return patientMap.get(id);
    }
}
