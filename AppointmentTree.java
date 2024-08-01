public class AppointmentTree {
    private AppointmentNode root;
// Method to add a new appointment to the tree
    public void addAppointment(Appointment appointment) {
        root = addRecursive(root, appointment);
    }
// Recursive helper method for adding appointments
    private AppointmentNode addRecursive(AppointmentNode current, Appointment appointment) {
        if (current == null) {
            return new AppointmentNode(appointment);
        }

        if (appointment.date.compareTo(current.appointment.date) < 0) {
            current.left = addRecursive(current.left, appointment);
        } else if (appointment.date.compareTo(current.appointment.date) > 0) {
            current.right = addRecursive(current.right, appointment);
        } else {
            // dates are equal, handle time comparison
            if (appointment.time.compareTo(current.appointment.time) < 0) {
                current.left = addRecursive(current.left, appointment);
            } else {
                current.right = addRecursive(current.right, appointment);
            }
        }
        return current;
    }
 // Method to display appointments in order (In-order traversal)
    public void displayAppointments() {
        displayInOrder(root);
    }

    private void displayInOrder(AppointmentNode node) {
        if (node != null) {
            displayInOrder(node.left);
            System.out.println("Patient ID: " + node.appointment.patientId + ", Date: " + node.appointment.date + ", Time: " + node.appointment.time);
            displayInOrder(node.right);
        }
    }
}
