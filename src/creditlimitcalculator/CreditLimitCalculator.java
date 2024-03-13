package creditlimitcalculator;
import java.util.Scanner;
public class CreditLimitCalculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            while(true) {
                System.out.print("Enter account number: ");
                int accountNumber = input.nextInt();
                if (accountNumber == -1) {
                    break;
                }
                System.out.print("Enter balance at the beginning of the month: ");
                int balance = input.nextInt();

                System.out.print("Enter total of all items charged this month: ");
                int totalCharges = input.nextInt();

                System.out.print("Enter total of all credits applied this month: ");
                int totalCredits = input.nextInt();

                System.out.print("Enter credit limit: ");
                int creditLimit = input.nextInt();

                int newBalance = balance + totalCharges - totalCredits;

                System.out.printf("New balance: %d%n", newBalance);

                if (newBalance > creditLimit) {
                    System.out.println("Credit limit exceeded.");
                } else {
                    System.out.println("Credit limit not exceeded.");
                }
            }
        }

    }
