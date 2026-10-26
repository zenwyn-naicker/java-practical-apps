/*Author: Zenwyn Naicker*/
package cryptowallet;

public class Transaction {

    //data fields
    private String type;
    private double amount;

    //constructor
    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    //methods
    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

}
