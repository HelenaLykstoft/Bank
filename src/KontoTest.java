import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {
    Konto konto = new Konto("Helena");


    @Test
    void depositMoney() {
        assertEquals(100,konto.depositMoney(100));
        assertEquals(200,konto.depositMoney(100));
        assertEquals(200,konto.depositMoney(-100));
    }
}