package bankApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private Bank bank;

    public void setUp() {
        bank = new Bank("Dahlia's Bank");
    }

    @Test
    void testRegisterCustomerInTheBank() {
        bank.registerCustomer("Samuel", "1234");
        assertEquals(account, 1);


    }

    @Test
    void testDepositInTheBank() {


    }

    @Test
    void withdraw() {
    }

    @Test
    void transfer() {
    }

    @Test
    void checkBalance() {
    }

    @Test
    void removeAccount() {
    }
}