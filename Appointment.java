public class Appointment {
    String patientId;
    String date;
    String time;

    public Appointment(String patientId, String date, String time) // Constructor to initialize appointment details 
    {
        this.patientId = patientId;
        this.date = date;
        this.time = time;
    }
}
