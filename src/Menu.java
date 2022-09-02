import java.util.ArrayList;

public class Menu {

    TextUI textUI = new TextUI();
    Bank bank = new Bank();

    public void mainMenu(){
        boolean isOn = true;
        String[] choices = {"Add account","Delete account","Withdraw","Deposit","See transactions","quit"};



        while (isOn){
            int choice = textUI.select("This is the menu.",choices,":)");
            switch (choice){
                case 0:
                    String[] accountChoice = {"Normal account", "Golden account"};
                    int accountChoices = textUI.select(" ",accountChoice," ");
                    System.out.println("First enter name: ");
                    String name = textUI.get();
                    System.out.println("Enter amount of money you wish to insert: ");
                    int money = textUI.getInteger();
                    switch (accountChoices){
                        case 0:
                            System.out.println(bank.createAccount(new Account(name, money)));
                            break;
                        case 1:
                            System.out.println(bank.createAccount(new GoldenAccount(name, money)));
                            break;
                    }
                    break;
                case 1:
                    System.out.println("Please enter name: ");
                    System.out.println(bank.deleteAccount(textUI.get()));
                    break;
                case 2:
                    System.out.println("Choose an account: ");
                    Account account = bank.getAccount(textUI.get());
                    if (account != null) {
                        System.out.println("How much would you like to withdraw?");
                        account.withdrawMoney(textUI.getInteger());
                    }
                    break;
                case 3:
                    System.out.println("Choose an account: ");
                    Account account1 = bank.getAccount(textUI.get());
                    if (account1 != null) {
                        System.out.println("How much would you like to deposit?");
                        account1.depositMoney(textUI.getInteger());
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;

            }

        }
    }
}
