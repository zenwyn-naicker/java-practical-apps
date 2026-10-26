/*Author: Zenwyn Naicker*/
package cryptowallet;

import org.junit.Test;
import static org.junit.Assert.*;

public class BitcoinWalletTest {
    
    //object
    BitcoinWallet btcwallet = new BitcoinWallet("21", "Satoshi");

    @Test
    public void testDeposit() {
        String actual = btcwallet.deposit(1);
        String expected = "Deposited " + (double) 1 + " BTC into wallet " + 21;
        assertEquals(expected, actual);
    }

    @Test
    public void testWithdraw() {
        btcwallet.deposit(2);
        String actual = btcwallet.withdraw(1);
        String expected = "Withdrew " + (double) 1 + " BTC from wallet " + 21;
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckBalance() {
        btcwallet.deposit(1);
        String actual = btcwallet.checkBalance();
        String expected = "The balance of bitcoin wallet " + 21 + " is " + btcwallet.getBalance() + " BTC";
        assertEquals(expected, actual);
    }

}
