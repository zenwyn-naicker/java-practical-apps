/*Author: Zenwyn Naicker*/
package cryptowallet;

import org.junit.Test;
import static org.junit.Assert.*;

public class EthereumWalletTest {
    
    //object
    EthereumWallet ethwallet = new EthereumWallet("120", "vitalik");

    @Test
    public void testDeposit() {
        String actual = ethwallet.deposit(1);
        String expected = "Deposited " + (double) 1 + " ETH into wallet " + 120;
        assertEquals(expected, actual);
    }

    @Test
    public void testWithdraw() {
        ethwallet.deposit(2);
        String actual = ethwallet.withdraw(1);
        String expected = "Withdrew " + (double) 1 + " ETH from wallet " + 120;;
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckBalance() {
        ethwallet.deposit(1);
        String actual = ethwallet.checkBalance();
        String expected = "The balance of ethereum wallet " + 120 + " is " + ethwallet.getBalance() + " ETH";
        assertEquals(expected, actual);
    }

}
