public class GoldenAccount extends Account{

    public GoldenAccount(String name, int balance) {
        super(name, balance);
    }

    @Override
    public int withdrawMoney(int i) {
        System.out.println("Balance before withdrawel: " + this.balance);
        if (i>0 && balance-i>-1000){
            balance = balance - i;
        } else System.out.println("You cannot withdraw past -1000. ");
        System.out.println("Balance after withdrawel: " + this.balance);
        return balance;
    }
}
