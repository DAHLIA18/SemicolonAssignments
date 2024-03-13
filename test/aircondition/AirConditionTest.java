package aircondition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionTest {

        @Test
        void turningOnShouldSetAirConditionerToOn() {
            AirCondition ac = new AirCondition();
            ac.turnOn();
            assertTrue(ac.isOn());
        }

        @Test
        void havingAnAirConditionerShouldStartItOn() {
            AirCondition ac = new AirCondition(true);
            assertTrue(ac.isOn());
        }

        @Test
        void turningOffShouldSetAirConditionerToOff() {
            AirCondition ac = new AirCondition(true);
            ac.turnOff();
            assertFalse(ac.isOn());
        }

        @Test
        void increasingTemperatureShouldIncreaseTemperature() {
            AirCondition ac = new AirCondition(true);
            ac.increaseTemperature();
            assertEquals(24, ac.getTemperature());
        }

        @Test
        void decreasingTemperatureShouldDecreaseTemperature() {
            AirCondition ac = new AirCondition(true);
            ac.decreaseTemperature();
            assertEquals(22, ac.getTemperature());
        }

        @Test
        void increasingTemperatureBeyond30ShouldKeepTemperatureAt30() {
            AirCondition ac = new AirCondition(true);
            ac.setTemperature(30);
            ac.increaseTemperature();
            assertEquals(30, ac.getTemperature());
        }

        @Test
        void decreasingTemperatureBelow16ShouldKeepTemperatureAt16() {
            AirCondition ac = new AirCondition(true);
            ac.setTemperature(16);
            ac.decreaseTemperature();
            assertEquals(16, ac.getTemperature());
        }
    }
