package bankApp;

class Account {
    private final int number;
     private String pin;
         private double balance;

         public Account(int number, String name, String pin) {
             this.number = number;
             this.pin = pin;
             this.balance = 0.0;
         }

         public int getNumber() {
             return number;
         }

         public void deposit(double amount) {
             balance += amount;
         }

         public void withdraw(double amount, String pin) {
             if (this.pin.equals(pin)) {
                 balance -= amount;
             } else {
                 throw new IllegalArgumentException("Incorrect PIN");
             }
         }

         public double getBalance(String pin) {
             if (this.pin.equals(pin)) {
                 return balance;
             } else {
                 throw new IllegalArgumentException("Incorrect PIN");
             }
         }

         public void changePin(String oldPin, String newPin) {
             if (this.pin.equals(oldPin)) {
                 this.pin = newPin;
             } else {
                 throw new IllegalArgumentException("Incorrect old PIN");
             }
         }
     }
