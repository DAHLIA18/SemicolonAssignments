package menstrualApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenstrualCycleTracker {
    private int averageCycleLength;
    private String startingDate;
    private String nextPeriodDate;
    private String ovulationDate;

    public void setAverageCycleLength(int averageCycleLength) {
        this.averageCycleLength = averageCycleLength;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public String getNextPeriodDate() {
        return nextPeriodDate;
    }

    public String getOvulationDate() {
        return ovulationDate;
    }


    public void calculateNextPeriodAndOvulation() {

        LocalDate startDate = LocalDate.parse(startingDate, DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDate nextPeriodStart = startDate.plusDays(averageCycleLength);
        nextPeriodDate = nextPeriodStart.format(DateTimeFormatter.ISO_LOCAL_DATE);


        LocalDate ovulationStart = startDate.plusDays(averageCycleLength / 2);
        ovulationDate = ovulationStart.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }


    public static void main(String[] args) {

        MenstrualCycleTracker tracker = new MenstrualCycleTracker();
        tracker.setAverageCycleLength(28);
        tracker.setStartingDate("2024-01-27");
        tracker.calculateNextPeriodAndOvulation();


        System.out.println("Next Period Date: " + tracker.getNextPeriodDate());
        System.out.println("Ovulation Date: " + tracker.getOvulationDate());
    }
}