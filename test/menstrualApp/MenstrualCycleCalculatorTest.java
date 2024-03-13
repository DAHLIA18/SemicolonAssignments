//package menstrualApp;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class MenstrualCycleCalculatorTest {
//    @Test
//    public void testSetAverageCycleLength() {
//        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
//        calculator.setAverageCycleLength(28);
//
////        assertEquals(28, calculator.getAverageCycleLength());
//    }
//
//    @Test
//    public void testSetStartingDate() {
//        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
//        calculator.setStartingDate("2022-01-01");
//
//
//
//    }
//
//    @Test
//    public void testSetAge() {
//    }
//
//    @Test
//    public void testGetNextPeriodDate() {
//        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
//        calculator.setStartingDate("2022-01-01");
//        calculator.setAverageCycleLength(28);
//        calculator.calculateCycleInformation();
//
//        assertEquals("2022-01-29", calculator.getNextPeriodDate());
//    }
//
//    @Test
//    public void testGetOvulationDate() {
//        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
//        calculator.setStartingDate("2022-01-01");
//        calculator.setAverageCycleLength(28);
//        calculator.calculateCycleInformation();
//
//        assertEquals("2022-01-15", calculator.getOvulationDate());
//    }
//
//    @Test
//    public void testGetSafePeriodStart() {
//        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
//        calculator.setStartingDate("2022-01-01");
//        calculator.setAverageCycleLength(28);
//        calculator.calculateCycleInformation();
//
//        assertEquals("2022-01-06", calculator.getSafePeriodStart());
//    }
//
//    @Test
//    public void testGetSafePeriodEnd() {
//        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
//        calculator.setStartingDate("2022-01-01");
//        calculator.setAverageCycleLength(28);
//        calculator.calculateCycleInformation();
//
//        assertEquals("2022-02-05", calculator.getSafePeriodEnd());
//    }
//
//    @Test
//    public void testGetDisclaimerForAgeUnder18() {
//        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
//        calculator.setAge(16);
//
//        assertEquals("Please consult with a healthcare professional for accurate information.", calculator.getDisclaimer());
//    }
//
//    @Test
//    public void testGetDisclaimerForAgeOver18() {
//        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
//        calculator.setAge(25);
//
//        assertEquals("This information is provided as a general guide. Consult with a healthcare professional for personalized advice.", calculator.getDisclaimer());
//    }
//
