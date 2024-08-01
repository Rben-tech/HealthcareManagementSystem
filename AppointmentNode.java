public class AppointmentNode {
    Appointment appointment;
    AppointmentNode left;// Reference to the left child node in the binary search tree

    AppointmentNode right;// Reference to the right child node in the binary search tree

    public AppointmentNode(Appointment appointment) {
        this.appointment = appointment;
        this.left = null;
        this.right = null;
    }
}
