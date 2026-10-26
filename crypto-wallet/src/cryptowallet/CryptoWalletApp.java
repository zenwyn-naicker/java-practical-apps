/*Author: Zenwyn Naicker*/
package cryptowallet;

import java.util.Scanner;

public class CryptoWalletApp {

    public static void main(String[] args) {
        //objects
        Scanner input = new Scanner(System.in);
        Exchange exchange = new Exchange();

        //variables
        String walletAddress;
        String nameOfOwner;
        double amount;
        int choice;

        //welcome message
        System.out.println("**************************************************************************************************");
        System.out.println("Welcome to the Crypto Wallet App");
        System.out.println("**************************************************************************************************");
        System.out.println("Crypto 101:");
        System.out.println("Cryptocurrency is a decentralized digital money designed to be used over the internet");
        System.out.println("The most popular cryptocurrencies by market capitalization are Bitcoin(BTC) and Ethereum (ETH)");
        System.out.println("Crypto enables value transfer without the need for a middleman (bank or payment processor)");
        System.out.println("It allows the transfer of value globally, fast, 24/7, and at low cost");
        System.out.println("A crypto wallet is like an account and lets you deposit or withdraw coins");
        System.out.println("A crypto exchange is like a bank and custodies your funds");
        System.out.println("A crypto wallet has an address which is like an account number");
        System.out.println("The address is a long string of letters and numbers: 1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
        System.out.println("**************************************************************************************************");

        //menu
        StringBuilder menu = new StringBuilder();
        menu.append("Menu:");
        menu.append("\nSelect an option by entering the corresponding number.");
        menu.append("\n1. Create Bitcoin Wallet");
        menu.append("\n2. Create Ethereum Wallet");
        menu.append("\n3. Deposit coins");
        menu.append("\n4. Withdraw coins");
        menu.append("\n5. Check Balance");
        menu.append("\n6. Display Statement");
        menu.append("\n7. Exit app");
        System.out.println(menu.toString());
        choice = input.nextInt();

        while (choice != 7) {
            switch (choice) {
                case 1://Create Bitcoin Wallet
                    System.out.println("Enter name of owner: ");
                    nameOfOwner = input.next();
                    System.out.println("Enter wallet address: ");
                    walletAddress = input.next();
                    exchange.addWallet(new BitcoinWallet(walletAddress, nameOfOwner));
                    break;
                case 2://Create Ethereum Wallet
                    System.out.println("Enter name of owner: ");
                    nameOfOwner = input.next();
                    System.out.println("Enter wallet address: ");
                    walletAddress = input.next();
                    exchange.addWallet(new EthereumWallet(walletAddress, nameOfOwner));
                    break;
                case 3://Deposit coins
                    System.out.println("Enter wallet address: ");
                    walletAddress = input.next();
                    System.out.println("Enter amount: ");
                    amount = input.nextDouble();
                    System.out.println(exchange.deposit(walletAddress, amount));
                    break;
                case 4://Withdraw coins
                    System.out.println("Enter wallet address: ");
                    walletAddress = input.next();
                    System.out.println("Enter amount: ");
                    amount = input.nextDouble();
                    System.out.println(exchange.withdraw(walletAddress, amount));
                    break;
                case 5://Check Balance
                    System.out.println("Enter wallet address: ");
                    walletAddress = input.next();
                    System.out.println(exchange.checkBalance(walletAddress));
                    break;
                case 6://Display Statement
                    System.out.println("Enter wallet address: ");
                    walletAddress = input.next();
                    System.out.println(exchange.displayStatement(walletAddress));
                    break;
                case 7://Exit app
                    break;
                default://Invalid option
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
            System.out.println(menu.toString());
            choice = input.nextInt();
        }
        System.out.println("Exited app.");
        input.close();
    }

}

/**
 * ***********************************************************************************************************
 * ***********************************************************************************************************
 * Title: Java Programming 9th Edition Author: Joyce Farrell Date: 2018
 * ***********************************************************************************************************
************************************************************************************************************
 */

/*************************************************************************************************************
* ***********************************************************************************************************
* Title: What is cryptocurrency?
* Author: Coinbase
* Date: 2024
* ***********************************************************************************************************
*************************************************************************************************************/
