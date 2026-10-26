/*Author: Zenwyn Naicker*/
package cryptowallet;

import java.util.ArrayList;

abstract class Wallet {

    //data fields
    private String walletAddress;
    private double balance;
    private String nameOfOwner;
    private ArrayList<Transaction> transactions;

    //constructor
    public Wallet(String walletAddress, String nameOfOwner) {
        this.walletAddress = walletAddress;
        this.nameOfOwner = nameOfOwner;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    //concrete methods
    //setters
    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }
    
    //getters
    public String getWalletAddress() {
        return walletAddress;
    }

    public double getBalance() {
        return balance;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String displayStatement() {
        StringBuilder statement = new StringBuilder();
        statement.append("Transaction statement for ").append(walletAddress);
        for (Transaction transaction : transactions) {
            statement.append("\n").append(transaction.getType()).append(": ").append(transaction.getAmount());
        }
        statement.append("\nBalance: ").append(balance);
        return statement.toString();
    }

    //protected methods
    protected void increaseBalance(double balance) {
        this.balance += balance;
    }

    protected void decreaseBalance(double balance) {
        this.balance -= balance;
    }

    protected void addTransaction(String type, double amount) {
        transactions.add(new Transaction(type, amount));
    }

    //abstract methods
    abstract String deposit(double amount);

    abstract String withdraw(double amount);

    abstract String checkBalance();

}
