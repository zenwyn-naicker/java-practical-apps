/*Author: Zenwyn Naicker*/
package cryptowallet;

public class EthereumWallet extends Wallet {

    public EthereumWallet(String walletAddress, String nameOfOwner) {
        super(walletAddress, nameOfOwner);
    }

    @Override
    String deposit(double amount) {
        if (amount > 0) {
            increaseBalance(amount);
            addTransaction("Deposit",amount);
            return "Deposited " + amount + " ETH into wallet " + getWalletAddress();
        } else {
            return "Invalid ETH deposit amount.";
        }
    }

    @Override
    String withdraw(double amount) {
        if (amount > 0 && getBalance() >= amount) {
            decreaseBalance(amount);
            addTransaction("Withdrawl",amount);
            return "Withdrew " + amount + " ETH from wallet " + getWalletAddress();
        } else {
            return "Invalid ETH withdrawal amount.";
        }
    }

    @Override
    String checkBalance() {
        return "The balance of ethereum wallet " + getWalletAddress() + " is " + getBalance()+ " ETH";
    }

}
