import java.util.LinkedList;
import java.util.Queue;

public class TransactionQueue {
    private final Queue<Transaction> transactionLog;

    public TransactionQueue() {
        transactionLog = new LinkedList<>();
    }
// Method to add a transaction to the queue
    public void addTransaction(Transaction transaction) {
        transactionLog.add(transaction);
    }
// Method to get and remove the next transaction from the queue
    public Transaction getNextTransaction() {
        return transactionLog.poll();
    }
}
