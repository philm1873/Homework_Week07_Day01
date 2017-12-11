import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaijuTest {

    Air testAir;
    Land testLand;

    @Before
    public void before() {
        testAir = new Air("Mothra", 500.0, 100.0);
        testLand = new Land("Godzilla", 1000.0, 200.0);
    }

    @Test
    public void airCanRoar() {
        assertEquals("RAAAAAAR", testAir.roar());
    }

    @Test
    public void landCanRoar() {
        assertEquals("RAAAAAAR", testLand.roar());
    }
}
