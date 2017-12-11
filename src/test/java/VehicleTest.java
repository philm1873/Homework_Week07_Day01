import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Tank testTank;
    Jet testJet;
    Air testAir;
    Land testLand;

    @Before
    public void before() {
        testTank = new Tank("Battle Tank", 100, 60);
        testJet = new Jet("F35", 80, 90);
        testAir = new Air("Mothra", 250, 100);
        testLand = new Land("Godzilla", 500, 200);
    }

    @Test
    public void tankAttackAir() {
        double test = 6.0;
        assertEquals(test, testTank.attack(testAir), 0.1);
    }

    @Test
    public void tankAttackLand() {
        double test = 60;
        assertEquals(test, testTank.attack(testLand), 0.1);
    }

    @Test
    public void jetAttackAir() {
        double test = 90;
        assertEquals(test, testJet.attack(testAir), 0.1);
    }

    @Test
    public void jetAttackLand() {
        double test = 9;
        assertEquals(test, testJet.attack(testLand), 0.1);
    }

    @Test
    public void tankTakeDamage() {
        double test = 40;
        testTank.takeDamage(60);
        assertEquals(test, testTank.getHealthValue(), 0.1);
    }

    @Test
    public void jetTakeDamage() {
        double test = 10;
        testJet.takeDamage(70);
        assertEquals(test, testJet.getHealthValue(), 0.1);
    }
}
