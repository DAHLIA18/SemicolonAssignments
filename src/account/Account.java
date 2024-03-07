package account;

public class Account {

    private int balance;
    private int balance2;
    private int account;

    public void deposit(int amount) {
        balance = balance + amount;

    }

    public int getBalance() {

        return balance;
    }

    public void withdraw(int withdrawAmount) {

        balance = balance - withdrawAmount;
    }

    public  int getBalance2(){
        return balance2;

    }

    public void registerAccount() {

        Account account = new Account();
    }

    public int getAccount(){

        return account;
    }
}
