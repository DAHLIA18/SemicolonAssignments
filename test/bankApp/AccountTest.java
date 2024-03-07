package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;

    @BeforeEach
    public void setUp(){
        account = new Account("Dahlia", 1, 0, "1234" );

    }
    
    @Test
    void testThatAmountCanBeDepositedInAccount() {
        account.deposit(1000);
        assertEquals(1000, account.checkBalance("1234"));

    }

    @Test
    void testThatAmountCanBeDepositedMoreThanOnce() {
        account.deposit(1000);
        account.deposit(5000);
        account.deposit(1000);
        assertEquals(7000, account.checkBalance("1234"));
    }
    @Test
    void depositZeroAmount_throwInvalidAmountExceptionTest() {
        account.deposit(2000);
        assertThrows(InvalidAmountException.class, ()-> account.deposit(0));
        assertEquals(2000, account.checkBalance("1234"));
    }
    @Test
    void depositNegativeAmount_throwInvalidAmountExceptionTest() {
        assertThrows(InvalidAmountException.class, ()-> account.deposit(-2000));
        assertEquals(0, account.checkBalance("1234"));
    }
    @Test
    void testThatAmountCanBeWithdrawInAccount() {
        account.deposit(4000);
        account.withdraw(2000, "1234");
        assertEquals(2000,account.checkBalance("1234"));
    }
    @Test
    void withdrawNegativeAmount_throwInvalidAmountExceptionTest(){
        account.deposit(4000);
        assertThrows(InvalidAmountException.class, ()-> account.withdraw(-2000, "1234"));
        assertEquals(4000, account.checkBalance("1234"));
    }

    @Test
    void withdrawZeroAmount_throwInvalidAmountExceptionTest(){
        account.deposit(4000);
        assertThrows(InvalidAmountException.class, ()-> account.withdraw(0, "1234"));
        assertEquals(4000, account.checkBalance("1234"));
    }

    @Test
    void changePin() {
        account.changePin("1234", "4321");
        assertEquals("4321", account.getPin());

    }

    @Test
    void invalidPin_throwInvalidPinExceptionTest(){
        account.deposit(5000);
        assertThrows(InvalidPinException.class, ()-> account.withdraw(2000, "3452"));

    }
}