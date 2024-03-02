package bankApp;

import java.util.Scanner;

public class BankApp {
    public static String enterPin(Scanner input) {
        System.out.print("Enter PIN: ");
        return input.next();
    }

    public static void main(String[] args) {
        Bank bank = new Bank("Dahlia's Bank");

        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("Welcome to Dahlia's Bank ATM");
                System.out.println("Select an option:");
                System.out.println("1. Register Account");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transfer");
                System.out.println("5. Check Balance");
                System.out.println("6. Remove Account");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter name: ");
                        String name = input.next();
                        System.out.print("Enter PIN: ");
                        String pin = input.next();
                        bank.registerCustomer(name, pin);
                        System.out.println("Account registered successfully.");
                    }
                    case 2 -> {
                        System.out.println();
                        System.out.print("Enter account number: ");
                        int accountNumber2 = input.nextInt();
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount2 = input.nextDouble();
                        bank.deposit(accountNumber2, depositAmount2);
                        System.out.println("Deposit successful.");
                    }
                    case 3 -> {
                        System.out.print("Enter account number: ");
                        int accountNumber3 = input.nextInt();
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount3 = input.nextDouble();
                        System.out.print("Enter PIN: ");
                        String withdrawPin3 = input.next();
                        bank.withdraw(accountNumber3, withdrawAmount3, withdrawPin3);
                        System.out.println("Withdrawal successful.");
                    }
                    case 4 -> {
                        System.out.print("Enter account number to transfer from: ");
                        int fromAccountNumber4 = input.nextInt();
                        System.out.print("Enter account number to transfer to: ");
                        int toAccountNumber4 = input.nextInt();
                        System.out.print("Enter amount to transfer: ");
                        double transferAmount4 = input.nextDouble();
                        System.out.print("Enter PIN: ");
                        String transferPin4 = input.next();
                        bank.transfer(fromAccountNumber4, toAccountNumber4, transferAmount4, transferPin4);
                        System.out.println("Transfer successful.");
                    }
                    case 5 -> {
                        System.out.print("Enter account number: ");
                        int accountNumber5 = input.nextInt();
                        System.out.print("Enter PIN: ");
                        String checkBalancePin5 = input.next();
                        double balance5 = bank.checkBalance(accountNumber5, checkBalancePin5);
                        System.out.println("Current balance: " + balance5);
                    }
                    case 6 -> {
                        System.out.print("Enter account number: ");
                        int accountNumber6 = input.nextInt();
                        System.out.print("Enter PIN: ");
                        String removeAccountPin6 = input.next();
                        bank.removeAccount(accountNumber6, removeAccountPin6);
                        System.out.println("Account removed successfully.");
                    }
                    case 7 -> {
                        System.out.println("Thank you for using Dahlia's Bank ATM. Goodbye!");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}