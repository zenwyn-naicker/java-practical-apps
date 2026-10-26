/*Author: Zenwyn Naicker*/
package cryptowallet;

import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionTest {

    //object
    Transaction transaction = new Transaction("deposit", 1);

    @Test
    public void testGetType() {
        String expected = "deposit";
        String actual = transaction.getType();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAmount() {
        double expected = 1;
        double actual = transaction.getAmount();
        assertTrue(expected == actual);
    }

}
