public class patientLinkedList {
    private patientNode head;

    // Method to add a patient to the linked list
    public void addPatient(patient patient) {
        patientNode newNode = new patientNode(patient);
        if (head == null) {
            head = newNode;
        } else {
            patientNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public patient getPatient(int index) {
        patientNode current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.patient;
            }
            count++;
            current = current.next;
        }
        return null;
    }

    public void displayPatients() {
        patientNode current = head;
        while (current != null) {
            System.out.println("ID: " + current.patient.id + ", Name: " + current.patient.name + ", Age: " + current.patient.age + ", Ailment: " + current.patient.ailment);
            current = current.next;
        }
    }
}
