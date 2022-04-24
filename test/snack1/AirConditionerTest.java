package snack1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void AirConditionerClassTest() {
        AirConditioner samsungAc = new AirConditioner();

        boolean acState = samsungAc.getAcOn();

        assertEquals(false, acState);
    }

    @Test
    public void turnAcOnTest() {
        AirConditioner panasonic = new AirConditioner();

        panasonic.turnOn();

        assertTrue(panasonic.getAcOn());
    }

    @Test
    public void turnAcOffTest() {
        AirConditioner lg = new AirConditioner();

        lg.turnOn();
        lg.turnOff();

        assertFalse(lg.getAcOn());
    }
}
