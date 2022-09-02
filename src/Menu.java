import java.util.ArrayList;

public class Menu {

    TextUI textUI = new TextUI();
    Bank bank = new Bank();

    public void mainMenu(){
        boolean isOn = true;
        String[] choices = {"Add account","Delete account","Withdraw","Deposit","See transactions","quit"};
        int choice = textUI.select("This is the menu.",choices,":)");


        while (isOn){
            switch (choice){
                case 0:
                    bank.createAccount(new Account(textUI.get(), textUI.getInteger()));
                    break;
                case 1:
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
