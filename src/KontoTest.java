import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {
    Konto konto = new Konto("Helena");
    Konto konto1 = new Konto ("Tester",100);


    @Test
    void depositMoney() {
        assertEquals(100,konto.depositMoney(100));
        assertEquals(200,konto.depositMoney(100));
        assertEquals(200,konto.depositMoney(-100));
    }

    @Test
    void withdrawMoney() {
        assertEquals(100,konto1.withdrawMoney(-100));
        assertEquals(0,konto1.withdrawMoney(100));
    }
}