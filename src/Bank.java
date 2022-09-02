import java.util.Map;
import java.util.TreeMap;

public class Bank {
    private Map<String, Account> accountMap = new TreeMap<>();

    public String createAccount(Account account){
        if (!accountMap.containsKey(account.getName())){
            accountMap.put(account.getName(),account);
            return "The account has been created under the name "+ account.getName() + " with the amount of " + account.getBalance();
        }
        return "The account name already exists.";
    }

    public String deleteAccount(String name){
        for (Map.Entry<String, Account> stringAccountEntry : accountMap.entrySet()) {
            System.out.println(stringAccountEntry.getKey());
        }
        if (accountMap.containsKey(name)){
            accountMap.remove(name);
            return "The account has been deleted";
        }
        return "The account does not exist";
    }
}
