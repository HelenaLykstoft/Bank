public class Konto {
    private String name;
    private int balance;

    public Konto(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
     // If you make an account and dont add balance, the balance will be 0
    // Overloaded constructor
    public Konto (String name){
        this.name = name;
        this.balance = 0;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int depositMoney(int i){
        if (i>0){
            balance = balance + i;
        }
        return balance;
    }
}
