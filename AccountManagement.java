import java.util.HashMap;

public class AccountManagement {
    private final HashMap<String, Account> accountMap;

    public AccountManagement() {
        accountMap = new HashMap<>();
    }

    public void addAccount(Account account) {
        accountMap.put(account.accountId, account);
    }

    public Account getAccount(String accountId) {
        return accountMap.get(accountId);
    }
}
