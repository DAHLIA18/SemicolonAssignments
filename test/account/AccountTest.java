package account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void testDeposit(){
        Account account = new Account();
        account.deposit(1000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void testDoubleDeposit(){
        Account account = new Account();
        account.deposit(1000);
        account.deposit(2000);
        assertEquals(3000, account.getBalance());
    }

    @Test
    public void testWithdraw(){
        Account account = new Account();
        account.withdraw(2000);
        account.deposit(3000);
        assertEquals(1000,account.getBalance());
    }

    @Test
    public void testRegisterAccount(){
        Account account = new Account();
        String name = " ";
        String pin = " ";

    }
    @Test
    public void testDoubleWithdrawal(){
        Account account =  new Account();
        account.withdraw(2000);
        account.withdraw(3000);
        assertEquals(-5000,account.getBalance());

    }

}