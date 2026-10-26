/*Author: Zenwyn Naicker*/
package cryptowallet;

public class BitcoinWallet extends Wallet {

    public BitcoinWallet(String walletAddress, String nameOfOwner) {
        super(walletAddress, nameOfOwner);
    }

    @Override
    String deposit(double amount) {
        if (amount > 0) {
            increaseBalance(amount);
            addTransaction("Deposit", amount);
            return "Deposited " + amount + " BTC into wallet " + getWalletAddress();
        } else {
            return "Invalid BTC deposit amount.";
        }
    }

    @Override
    String withdraw(double amount) {
        if (amount > 0 && getBalance() >= amount) {
            decreaseBalance(amount);
            addTransaction("Withdrawl", amount);
            return "Withdrew " + amount + " BTC from wallet " + getWalletAddress();
        } else {
            return "Invalid BTC withdrawal amount.";
        }
    }

    @Override
    String checkBalance() {
        return "The balance of bitcoin wallet " + getWalletAddress() + " is " + getBalance() + " BTC";
    }

}
