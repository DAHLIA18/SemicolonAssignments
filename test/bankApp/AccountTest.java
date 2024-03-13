package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account dahliaAccount;

    @BeforeEach
    public void setUp(){
        dahliaAccount = new Account("1", "Dahlia", "1212");
    }

    @Test
    public void accountCanBeCreatedWithZeroBalanceTest(){
        //given that account exist
        //check that account exists
        //Check that balance is zero
        assertNotNull(dahliaAccount);
        assertEquals(0, dahliaAccount.getBalance("1212"));
    }

    @Test
    public void depositMoney_balanceIncreasesTest(){
        //given that I have account and balance is zero;
        //when I deposit 200
        //check that balance is 200
        assertEquals(0, dahliaAccount.getBalance("1212"));
        dahliaAccount.deposit(200);
        int myBalance = dahliaAccount.getBalance("1212");
        assertEquals(200, myBalance);
    }

    @Test
    public void cannotDepositNegativeAmount(){
        //given that I have an account
        //when I try to deposit negative amount -2500
        //check that balance is zero;
        assertEquals(0, dahliaAccount.getBalance("1212"));
        assertThrows(InvalidAmountException.class, ()-> dahliaAccount.deposit(-2500));
    }

    @Test
    public void depositNegativeDepositThrowsExceptionTest(){
        assertThrows(InvalidAmountException.class, ()-> dahliaAccount.deposit(-2500));
    }

    @Test

    public void getBalanceWithPin_returnsBalanceTest(){
        //given I have money in my account
        //when I check my balance with wrong pin
        //balance is zer0
        dahliaAccount.deposit(2000);
        int myBalance = dahliaAccount.getBalance("1212");
        assertEquals(2000, myBalance);
    }

    @Test

    public void getBalanceWithWrongPin_returnsZeroTestTwice(){
        //given I have money in my account
        //when I check my balance with wrong pin
        //balance is zero
        assertThrows(InvalidPinException.class, ()-> dahliaAccount.getBalance("2222"));
    }

    @Test
    public void withdrawRightPinWorksTest(){
        //given that I have account
        //given when I try to withdraw 2000 with 1234 as pin
        //check that current balance is 3000
        dahliaAccount.deposit(5_000);
        assertEquals(5_000, dahliaAccount.getBalance("1212"));
        dahliaAccount.withdraw(2000, "1212");
    }

    @Test
    public void withdrawWithNegativeAmountThrowExceptionTest(){
        assertThrows(InvalidAmountException.class, ()-> dahliaAccount.withdraw(-10_200, "1212"));
    }

    @Test

    public void withdrawAmountThatIsGreaterThanBalance(){
        //given you have account
        //given you have money input the correct pin
        //given you have money above balance
        int myBal = dahliaAccount.getBalance("1212");
        assertEquals(0, myBal);
        dahliaAccount.deposit(12_000);
        assertEquals(12_000, dahliaAccount.getBalance("1212"));
        dahliaAccount.withdraw(10_000, "1212");
        assertEquals(2000, dahliaAccount.getBalance("1212"));
    }

    @Test
    public void withdrawWrongPinDoesNotWork(){
        dahliaAccount.deposit(5_000);
        assertThrows(InvalidPinException.class, ()-> dahliaAccount.withdraw(2_000, "2333"));
    }

    @Test
    public void withdrawWithRightPinAndHighAmountDoesNotWorkTest(){
        dahliaAccount.deposit(5_000);
        dahliaAccount.withdraw(5000, "1212");
        assertEquals(0, dahliaAccount.getBalance("1212"));
    }

    @Test
    public void getBackBalanceIfUserWantToWithdrawAmountAboveBalance(){
        dahliaAccount.deposit(5_000);
        assertThrows(InsufficientFundsException.class, ()-> dahliaAccount.withdraw(6_000, "1212"));
    }

}