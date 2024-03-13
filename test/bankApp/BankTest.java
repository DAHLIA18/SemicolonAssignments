package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private Bank dahliaBank;
    private Account account;
    @BeforeEach
    public void setUp(){
        dahliaBank = new Bank();
    }
    @Test
    public void bankExistTest(){
        assertNotEquals(null, dahliaBank);
        assertNotNull(dahliaBank);
    }

    @Test
    public void accountCanBeCreatedTest(){
        dahliaBank.createAccountFor("Vicky", "2727");
        assertEquals(1, dahliaBank.getNumberOfCustomers());
    }

    @Test
    public void create_findAccountByAccountNumberTest(){
        dahliaBank.createAccountFor("Vicky", "2727");
        assertEquals(1, dahliaBank.getNumberOfCustomers());
        account = dahliaBank.findAccount("1");
        assertEquals("Vicky", account.getName());
    }

    @Test
    public  void customerCanDepositInAccountTest(){
        dahliaBank.createAccountFor("Vicky ", "2727");
        dahliaBank.deposit(2_000, "1");
        Account bankeAccount = dahliaBank.findAccount("1");
        assertEquals(2_000, bankeAccount.getBalance("2727"));
    }

    @Test
    public void withdrawPositiveAmountFromAccount(){
        dahliaBank.createAccountFor("Vicky ", "2727");
        dahliaBank.deposit(2_000, "1");
        Account bankeAccount = dahliaBank.withdraw(1000, "1", "2727");
        assertEquals(1000, bankeAccount.getBalance("2727"));
    }

    @Test
    public void bankCanTransfer(){
        dahliaBank.createAccountFor("Vicky Roll-on", "needle");
        dahliaBank.createAccountFor("Dee Roll-on", "thread");
        dahliaBank.deposit(5000, "1");
        assertEquals(5000, dahliaBank.findAccount("1").getBalance("needle"));
        dahliaBank.transfer("1", "2", 4900, "needle");
        assertEquals(100, dahliaBank.findAccount("1").getBalance("needle"));
        assertEquals(4900, dahliaBank.findAccount("2").getBalance("thread"));



    }

}