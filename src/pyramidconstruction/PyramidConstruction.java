package pyramidconstruction;

import java.util.Scanner;

public class PyramidConstruction {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the estimated number of stones used: ");
            int numberOfStones = input.nextInt();

            System.out.print("Enter the average weight of each stone (in kilograms): ");
            double averageStoneWeight = input.nextDouble();

            System.out.print("Enter the number of years taken to build the pyramid: ");
            int numberOfYears = input.nextInt();

            int daysInYear = 365;
            int hoursInDay = 24;
            int minutesInHour = 60;

            double totalWeight = numberOfStones * averageStoneWeight;
            double weightBuiltPerYear = totalWeight / numberOfYears;
            double weightBuiltPerHour = weightBuiltPerYear / (daysInYear * hoursInDay);
            double weightBuiltPerMinute = weightBuiltPerHour / minutesInHour;

            System.out.printf("Estimated weight built each year: %.2f kilograms\n", weightBuiltPerYear);
            System.out.printf("Estimated weight built each hour: %.2f kilograms\n", weightBuiltPerHour);
            System.out.printf("Estimated weight built each minute: %.2f kilograms\n", weightBuiltPerMinute);
        }
    }

