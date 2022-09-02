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
                    System.out.println("First enter name: ");
                    String name = textUI.get();
                    System.out.println("Enter amount of money you wish to insert: ");
                    int money = textUI.getInteger();
                    System.out.println(bank.createAccount(new Account(name, money)));
                    break;
                case 1:
                    System.out.println("Please enter name: ");
                    System.out.println(bank.deleteAccount(textUI.get()));
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;

            }

        }
    }
}
