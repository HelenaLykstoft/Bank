import java.util.Map;
import java.util.TreeMap;

public class Bank {
    private Map<String, Account> accountMap = new TreeMap<>();

    public boolean createAccount(Account account){
        if (!accountMap.containsKey(account.getName())){
            accountMap.put(account.getName(),account);
            return true;
        }
        return false;
    }

}
