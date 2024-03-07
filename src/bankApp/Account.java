package bankApp;

class Account {
    private final int number;
     private String pin;
         private int balance;

         public Account(String name, int number, int balance,  String pin) {
             this.number = number;
             this.pin = pin;
             this.balance = 0;

         }

         public int getNumber() {

             return number;
         }

         public void deposit(int amount) {
            if(amount <= 0) throw new InvalidAmountException("Enter a valid amount");
            balance += amount;
         }

         public void withdraw(int amount, String pin) {
             if (amount <= 0) throw new InvalidAmountException("Invalid Amount");
             if (this.pin.equals(pin)) {
                 balance -= amount;
             } else {
                 throw new InvalidPinException("Incorrect PIN");
             }
         }

         public int checkBalance(String pin) {
             if (this.pin.equals(pin)) {
                 return balance;
             } else {
                 throw new InvalidPinException("Incorrect PIN");
             }
         }

         public void changePin(String oldPin, String newPin) {
             if (this.pin.equals(oldPin)) {
                 this.pin = newPin;
             } else {
                 throw new InvalidPinException("Incorrect old PIN");
             }
         }

    public String getPin() {
             return pin;
    }
}
