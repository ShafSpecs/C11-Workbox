package snack2;

import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BikeTest {
    @Test
    public void BikeBasicTest() {
        Bike totem = new Bike();

        boolean powerState = totem.getPowerOn();

        assertFalse(powerState);
    }

    @Test
    @DisplayName("Can the bike be turned on?")
    @Description("The bike can be turned on.")
    public void bikeOn() {
        Bike dunlop = new Bike();

        dunlop.setPowerOn();

        boolean finalPowerState = dunlop.getPowerOn();

        assertTrue(finalPowerState);
    }

    @Test
    public void bikeOff() {
        Bike bmx = new Bike();

        bmx.setPowerOff();

        boolean finalPowerState = bmx.getPowerOn();

        assertFalse(finalPowerState);
    }

    @Test
    public void canChangeSpeeds() {
        Bike ktm = new Bike();

        ktm.setSpeed(5);

        int currentSpeed = ktm.getSpeed();

        assertEquals(5, currentSpeed);
    }

    @Test
    @DisplayName("Do gears exist on the bike?")
    @Description("Assert that the bike actually has gears")
    public void bikeHasGears() {
        Bike boeing = new Bike();

        int currentGear = boeing.getCurrentGear();

        assertEquals(1, currentGear);
    }

    @Test
    @DisplayName("Can shift gears")
    @Description("Bike can change gears automatically & successfully")
    public void canChangeGears() {
        Bike bmx = new Bike();

        bmx.setGear(2);

        int finalGear = bmx.getCurrentGear();

        assertEquals(2, finalGear);
    }

    @Test
    @DisplayName("Acceleration")
    @Description("Bike can be accelerated")
    public void canBeAccelerated() {
        Bike dunlop = new Bike();

        dunlop.accelerate();

        assertEquals(1, dunlop.getSpeed());
    }

    @Test
    @DisplayName("Gear speed limits")
    @Description("0-20 for gear one. 21-30 for gear two; so on. Gears should engage only at their speeds")
    public void gearSpeedsConstraint() {
        Bike dunlop = new Bike();

        dunlop.setSpeed(20);
        dunlop.accelerate();

        int currentSpeed = dunlop.getSpeed();
        int currentGear = dunlop.getCurrentGear();

        assertEquals(21, currentSpeed);
        assertEquals(2, currentGear);
    }

    @Test
    @DisplayName("Can decelerate")
    public void canDecelerateTest() {
        Bike bmx = new Bike();

        bmx.setSpeed(12);
        bmx.decelerate();

        assertEquals(11, bmx.getSpeed());
    }
}
