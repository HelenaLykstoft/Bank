import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Bank bank = new Bank();

    @Test
    void createAccount() {
        Account account = new Account("Helena");
        Account account1 = new Account("Bøllebob");
        Account account2 = new Account("Bøllebob");


        assertEquals(true,bank.createAccount(account));
        assertEquals(false,bank.createAccount(account));
        assertEquals(true,bank.createAccount(account1));
        assertEquals(false,bank.createAccount(account1));
        assertEquals(false,bank.createAccount(account2));


    }
}