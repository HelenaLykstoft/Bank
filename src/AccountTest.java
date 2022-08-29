import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account = new Account("Helena");
    Account account1 = new Account("Tester",100);


    @Test
    void depositMoney() {
        assertEquals(100, account.depositMoney(100));
        assertEquals(200, account.depositMoney(100));
        assertEquals(200, account.depositMoney(-100));
    }

    @Test
    void withdrawMoney() {
        assertEquals(100, account1.withdrawMoney(-100));
        assertEquals(0, account1.withdrawMoney(100));
    }
}