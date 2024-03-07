package bankApp;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private String name;
    private int balance;
    private String pin;
    private int number;

    public BankAccount(int number, String name, String pin) {
        this.number = number;
        this.name = name;
        this.pin = pin;
    }

    public void deposit(int amount) throws InvalidAmountException {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new InvalidAmountException("Amount must be positive");
        }
    }

    public void withdraw(int amount, String pin) throws InvalidAmountException, InsufficientFundsException, InvalidPinException {
        checkPin(pin);
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                throw new InsufficientFundsException("Insufficient funds");
            }
        } else {
            throw new InvalidAmountException("Amount must be positive");
        }
    }

    public int checkBalance(String pin) throws InvalidPinException {
        checkPin(pin);
        return balance;
    }

    void checkPin(String pin) throws InvalidPinException {
        if (!this.pin.equals(pin)) {
            throw new InvalidPinException("Invalid pin");
        }
    }

    public void changePin(String oldPin, String newPin) throws InvalidPinException {
        checkPin(oldPin);
        this.pin = newPin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }
}
