public class Account {

    protected String Conflict;
    protected String name;
    protected int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
     // If you make an account and dont add balance, the balance will be 0
    // Overloaded constructor
    public Account(String name){
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
        System.out.println("Balance before deposit: " + this.balance);
        if (i>0){
            balance = balance + i;
        }
        System.out.println("Balance after deposit: " + this.balance);
        return balance;
    }

    public int withdrawMoney(int i) {
        System.out.println("Balance before withdrawel: " + this.balance);
        if (i>0 && balance>=i){
            balance = balance - i;
        } else System.out.println("You cant withdraw more money than you got.");
        System.out.println("Balance after withdrawel: " + this.balance);
        return balance;
    }

}
