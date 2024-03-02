package bikeApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    @Test
    void turnOn() {
        AutomaticBike bike  = new AutomaticBike();
        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    void turnOff() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOff();
        assertFalse(bike.isOn());
    }

    @Test
    void isOn() {
    }

    @Test
    void getCurrentSpeed() {

    }

    @Test
    void setCurrentSpeed() {
    }

    @Test
    void getCurrentGear() {

    }

    @Test
    void setGear() {
        AutomaticBike bike = new AutomaticBike();
        bike.setGear(2);
        bike.setCurrentSpeed(21);
        assertEquals(2, bike.getCurrentGear());
    }


    @Test
    void accelerate() {
        AutomaticBike bike = new AutomaticBike();
        bike.setGear(1);
        bike.accelerate();
        assertEquals(1, bike.getCurrentSpeed());
    }


    @Test
    void decelerate() {
        AutomaticBike bike = new AutomaticBike();
        bike.setGear(1);
        bike.setCurrentSpeed(5);
        bike.decelerate();
        assertEquals(4, bike.getCurrentSpeed());
    }

}