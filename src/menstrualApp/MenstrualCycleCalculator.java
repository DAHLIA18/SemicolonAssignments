package menstrualApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualCycleCalculator {

    private int averageCycleLength;
    private String startingDate;
    private String nextPeriodDate;
    private String ovulationDate;
    private String safePeriodStart;
    private String safePeriodEnd;
    private String disclaimer;
    private int age;


    public void setAverageCycleLength(int averageCycleLength) {
        this.averageCycleLength = averageCycleLength;
    }

    public void setStartingDate(String StartingDate) {
        this.startingDate = startingDate;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getNextPeriodDate() {
        return nextPeriodDate;
    }

    public String getOvulationDate() {
        return ovulationDate;
    }

    public String getSafePeriodStart() {
        return safePeriodStart;
    }

    public String getSafePeriodEnd() {
        return safePeriodEnd;
    }


    public void calculateCycleInformation() {

        LocalDate startDate = LocalDate.parse(startingDate, DateTimeFormatter.ISO_LOCAL_DATE);


        LocalDate nextPeriodStart = startDate.plusDays(averageCycleLength);
        nextPeriodDate = nextPeriodStart.format(DateTimeFormatter.ISO_LOCAL_DATE);


        LocalDate ovulationStart = startDate.plusDays(averageCycleLength / 2);
        ovulationDate = ovulationStart.format(DateTimeFormatter.ISO_LOCAL_DATE);


        LocalDate safePeriodStart = startDate.minusDays(5);
        this.safePeriodStart = safePeriodStart.format(DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDate safePeriodEnd = startDate.plusDays(5);
        this.safePeriodEnd = safePeriodEnd.format(DateTimeFormatter.ISO_LOCAL_DATE);


        if (age < 8) {
            disclaimer = "Please consult with a healthcare professional for accurate information.";
        } else {
            disclaimer = "This information is provided as a general guide. Consult with a healthcare professional for personalized advice.";
        }
    }


    public static void main(String[] args) {
        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your average menstrual cycle length (in days): ");
        int cycleLength = input.nextInt();
        calculator.setAverageCycleLength(cycleLength);

        System.out.print("Enter the starting date of your last period (YYYY-MM-DD): ");
        String startDate = input.next();
        calculator.setStartingDate(startDate);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        calculator.setAge(age);

        calculator.calculateCycleInformation();


        System.out.println("Next Period Date: " + calculator.getNextPeriodDate());
        System.out.println("Ovulation Date: " + calculator.getOvulationDate());
        System.out.println("Safe Period Start: " + calculator.getSafePeriodStart());
        System.out.println("Safe Period End: " + calculator.getSafePeriodEnd());
        System.out.println("Disclaimer: " + calculator.getDisclaimer());

        input.close();
    }


    public String getDisclaimer() {
        return disclaimer;
    }
}
