public class TransactionHistoryTree {
    private TransactionHistoryNode root;

    public void addTransaction(Transaction transaction) {
        root = addRecursive(root, transaction);
    }
// Recursive helper method for adding transactions
    private TransactionHistoryNode addRecursive(TransactionHistoryNode current, Transaction transaction) {
        if (current == null) {
            return new TransactionHistoryNode(transaction);
        }

        if (transaction.transactionId.compareTo(current.transaction.transactionId) < 0) {
            current.left = addRecursive(current.left, transaction);
        } else if (transaction.transactionId.compareTo(current.transaction.transactionId) > 0) {
            current.right = addRecursive(current.right, transaction);
        }
        return current;
    }

    public void displayTransactions() {
        displayInOrder(root);
    }

    private void displayInOrder(TransactionHistoryNode node) {
        if (node != null) {
            displayInOrder(node.left);
            System.out.println("Transaction ID: " + node.transaction.transactionId + ", Details: " + node.transaction.details);
            displayInOrder(node.right);
        }
    }
}
