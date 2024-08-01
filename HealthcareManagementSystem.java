import java.util.Scanner;

public class HealthcareManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Patient Linked List
        patientLinkedList patientList = new patientLinkedList();
        System.out.println("Enter number of patients to add:");
        int patientCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < patientCount; i++) {
            System.out.println("Enter Patient ID:");
            String id = scanner.nextLine();
            System.out.println("Enter Patient Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Patient Age:");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter Patient Ailment:");
            String ailment = scanner.nextLine();

            patient newPatient = new patient(id, name, age, ailment);
            patientList.addPatient(newPatient);
        }
        patientList.displayPatients();

        // Patient Lookup
        patientLookup patientLookup = new patientLookup();
        for (int i = 0; i < patientCount; i++) {
            patientLookup.addPatient(patientList.getPatient(i));
        }
        System.out.println("Enter Patient ID to lookup:");
        String lookupId = scanner.nextLine();
        System.out.println("Lookup Patient: " + patientLookup.getPatient(lookupId).name);

        // Appointment Tree
        AppointmentTree appointmentTree = new AppointmentTree();
        System.out.println("Enter number of appointments to add:");
        int appointmentCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < appointmentCount; i++) {
            System.out.println("Enter Patient ID for appointment:");
            String patientId = scanner.nextLine();
            System.out.println("Enter Appointment Date (YYYY-MM-DD):");
            String date = scanner.nextLine();
            System.out.println("Enter Appointment Time (HH:MM AM/PM):");
            String time = scanner.nextLine();

            Appointment newAppointment = new Appointment(patientId, date, time);
            appointmentTree.addAppointment(newAppointment);
        }
        appointmentTree.displayAppointments();

        // Transaction Queue
        TransactionQueue transactionQueue = new TransactionQueue();
        System.out.println("Enter number of transactions to add:");
        int transactionCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < transactionCount; i++) {
            System.out.println("Enter Transaction ID:");
            String transactionId = scanner.nextLine();
            System.out.println("Enter Transaction Details:");
            String details = scanner.nextLine();

            Transaction newTransaction = new Transaction(transactionId, details);
            transactionQueue.addTransaction(newTransaction);
        }
        System.out.println("Next Transaction: " + transactionQueue.getNextTransaction().details);

        // Account Management
        AccountManagement accountManagement = new AccountManagement();
        System.out.println("Enter number of accounts to add:");
        int accountCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < accountCount; i++) {
            System.out.println("Enter Account ID:");
            String accountId = scanner.nextLine();
            System.out.println("Enter Account Balance:");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            Account newAccount = new Account(accountId, balance);
            accountManagement.addAccount(newAccount);
        }
        System.out.println("Enter Account ID to get balance:");
        String accountIdToCheck = scanner.nextLine();
        System.out.println("Account Balance: " + accountManagement.getAccount(accountIdToCheck).balance);

        // Transaction History Tree
        TransactionHistoryTree transactionHistoryTree = new TransactionHistoryTree();
        for (int i = 0; i < transactionCount; i++) {
            Transaction transaction = transactionQueue.getNextTransaction();
            if (transaction != null) {
                transactionHistoryTree.addTransaction(transaction);
            }
        }
        transactionHistoryTree.displayTransactions();

        scanner.close();
    }
}
