/*Author: Zenwyn Naicker*/
package cryptowallet;

import java.util.ArrayList;

public class Exchange {

    private ArrayList<Wallet> wallets;

    public Exchange() {
        wallets = new ArrayList<>();
    }

    public String addWallet(Wallet wallet) {
        wallets.add(wallet);
        return "Wallet " + wallet.getWalletAddress() + " added.";
    }

    public Wallet searchWallet(String walletAddress) {
        for (Wallet wallet : wallets) {
            if (wallet.getWalletAddress().equals(walletAddress)) {
                return wallet;
            }
        }
        return null;
    }

    public String deposit(String walletAddress, double amount) {
        Wallet wallet = searchWallet(walletAddress);
        if (wallet != null) {
            return wallet.deposit(amount);
        } else {
            return "wallet not found";
        }

    }

    public String withdraw(String walletAddress, double amount) {
        Wallet wallet = searchWallet(walletAddress);
        if (wallet != null) {
            return wallet.withdraw(amount);
        } else {
            return "wallet not found";
        }
    }

    public String checkBalance(String walletAddress) {
        Wallet wallet = searchWallet(walletAddress);
        if (wallet != null) {
            return wallet.checkBalance();
        } else {
            return "wallet not found";
        }
    }

    public String displayStatement(String walletAddress) {
        Wallet wallet = searchWallet(walletAddress);
        if (wallet != null) {
            return wallet.displayStatement();
        } else {
            return "wallet not found";
        }
    }
}
