package bankApp;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final List<Account> accounts;

    public Bank(String name) {
        this.accounts = new ArrayList<>();
    }

    public void registerCustomer(String name, String pin) {
        int branchCode = 1234;
        int customerNumber = accounts.size() + 1;
        int accountNumber = generateAccountNumber(branchCode, customerNumber);

        Account account = new Account(accountNumber, name, pin);
        accounts.add(account);
    }

    private int generateAccountNumber(int branchCode, int customerNumber) {
        String accountNumberStr = String.valueOf(branchCode) + String.format("%04d", customerNumber);
        return Integer.parseInt(accountNumberStr);
    }

    public void deposit(int accountNumber, int amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            throw new IllegalArgumentException("Account not found");
        }
    }

    public void withdraw(int accountNumber, int amount, String pin) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount, pin);
        } else {
            throw new IllegalArgumentException("Account not found");
        }
    }

    public void transfer(int fromAccountNumber, int toAccountNumber, int amount, String pin) {
        Account fromAccount = findAccount(fromAccountNumber);
        Account toAccount = findAccount(toAccountNumber);

        if (fromAccount != null && toAccount != null) {
            fromAccount.withdraw(amount, pin);
            toAccount.deposit(amount);
        } else {
            throw new IllegalArgumentException("One or both accounts not found");
        }
    }

    public int checkBalance(int accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            return account.getBalance(pin);
        } else {
            throw new IllegalArgumentException("Account not found");
        }
    }

    public void removeAccount(int accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            accounts.remove(account);
        } else {
            throw new IllegalArgumentException("Account not found");
        }
    }

    private Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}