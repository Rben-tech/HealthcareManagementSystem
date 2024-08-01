public class TransactionHistoryNode {
    Transaction transaction;
    TransactionHistoryNode left;
    TransactionHistoryNode right;
// Constructor to initialize a transaction history node
    public TransactionHistoryNode(Transaction transaction) {
        this.transaction = transaction;
        this.left = null;
        this.right = null;
    }
}
