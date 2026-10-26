/*Author: Zenwyn Naicker*/
package cryptowallet;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExchangeTest {

    //object 
    Exchange wallets = new Exchange();
    BitcoinWallet btcwallet = new BitcoinWallet("21", "Satoshi");

    @Test
    public void testAddWallet() {
        String actual = wallets.addWallet(btcwallet);
        String expected = "Wallet " + btcwallet.getWalletAddress() + " added.";
        assertEquals(expected, actual);
    }

    @Test
    public void testSearchWallet() {
        wallets.addWallet(btcwallet);
        assertEquals(btcwallet, wallets.searchWallet("21"));
    }

    @Test
    public void testDeposit() {
        wallets.addWallet(btcwallet);
        String actual = wallets.deposit("21", 1);
        String expected = "Deposited " + (double) 1 + " BTC into wallet " + 21;
        assertEquals(expected, actual);
    }

    @Test
    public void testWithdraw() {
        wallets.addWallet(btcwallet);
        wallets.deposit("21", 2);
        String actual = wallets.withdraw("21", 1);
        String expected = "Withdrew " + (double) 1 + " BTC from wallet " + 21;
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckBalance() {
        wallets.addWallet(btcwallet);
        wallets.deposit("21", 1);
        String actual = wallets.checkBalance("21");
        String expected = "The balance of bitcoin wallet " + 21 + " is " + btcwallet.getBalance() + " BTC";
        assertEquals(expected, actual);
    }

    @Test
    public void testDisplayStatement() {
        wallets.addWallet(btcwallet);
        wallets.deposit("21", 1);
        String actual = wallets.displayStatement("21");
        StringBuilder expected = new StringBuilder();
        expected.append("Transaction statement for ").append("21");
        expected.append("\n").append("Deposit").append(": ").append((double) 1);
        expected.append("\nBalance: ").append((double) 1);
        assertEquals(expected.toString(), actual);
    }

}
