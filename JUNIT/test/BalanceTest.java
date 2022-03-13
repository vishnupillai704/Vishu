import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BalanceTest {
    @Test
    void testbalance() throws InsufficientFundsException {
        BankAccount bankAccount=new BankAccount();
        Integer actual=bankAccount.withdraw(5000);
        assertEquals(4000,actual);
    }
    @Test
    void testbalance1(){
        BankAccount bankAccount=new BankAccount();
        assertThrows(InsufficientFundsException.class,()-> bankAccount.withdraw(10000));
    }
}
