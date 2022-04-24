package snack1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void AirConditionerClassTest() {
        AirConditioner samsungAc = new AirConditioner();

        boolean acState = samsungAc.getAcOn();

        assertFalse(acState);
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

    @Test
    public void changeTemperatureTest() {
        AirConditioner lg = new AirConditioner();

        lg.changeTemperature(23);

        assertEquals(23, lg.getTemperature());
    }

    @Test
    public void temperatureMinTest() {
        AirConditioner paramount = new AirConditioner();

        paramount.changeTemperature(18);
        int initialLowerTemperature = paramount.getTemperature();
        paramount.changeTemperature(15);
        int finalLowerTemperature = paramount.getTemperature();

        assertEquals(16, finalLowerTemperature);
    }

    @Test
    public void temperatureMaxTest() {
        AirConditioner samsung = new AirConditioner();

        samsung.changeTemperature(23);
        int initialHigherTemperature = samsung.getTemperature();
        samsung.changeTemperature(35);
        int finalHigherTemperature = samsung.getTemperature();

        assertEquals(30, finalHigherTemperature);
    }
}
