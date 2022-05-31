/**
 * A cash register totals up sales and computes change due.
 * 
 */

public class CashRegister {
    private double purchase, payment, saleTotal;
    private int saleCount;
    private String receipt;

    /**
     * Constructs a cash register with no money in it.
     */
    public CashRegister() {
	purchase = 0;
	payment = 0;
	saleTotal = 0;
	saleCount = 0;
	receipt = "Items:\n";
    }

    public double getPurchase() {
	return purchase;
    }

    public void setPurchase(double purchase) {
	this.purchase = purchase;
    }

    public double getPayment() {
	return payment;
    }

    public void setPayment(double payment) {
	this.payment = payment;
    }

    public double getSaleTotal() {
	return saleTotal;
    }

    public void setSaleTotal(double saleTotal) {
	this.saleTotal = saleTotal;
    }

    public int getSaleCount() {
	return saleCount;
    }

    public void setSaleCount(int saleCount) {
	this.saleCount = saleCount;
    }

    public String getReceipt() {
	return receipt;
    }

    public void setReceipt(String receipt) {
	this.receipt = receipt;
    }

    /**
     * Records the sale of an item.
     * 
     * @param amount the price of the item.
     */
    public void recordPurchase(double amount) {
	purchase = purchase + amount;

	String a = "$" + String.valueOf(amount);
	receipt = receipt.concat(a + "\n");
    }

    /**
     * Processes a payment received from the customer.
     * 
     * @param amount the amount of the payment.
     */
    public void receivePayment(double amount) {
	payment = payment + amount;

	saleCount++;
	saleTotal += purchase;
    }

    /**
     * Computes the change due and resets the machine for the next customer.
     * 
     * @return the change due to the customer
     */
    public double giveChange() {
	double change = payment - purchase;
	purchase = 0;
	payment = 0;
	return change;
    }

    /**
     * Prints the receipt with the price of each item and total amount due.
     * 
     * @return the receipt
     */
    public String printReceipt() {
	receipt = receipt.concat("\nTotal: $" + purchase);
	receipt = receipt.concat("\nReceived: $" + payment);
	receipt = receipt.concat("\nChange: $" + giveChange());

	return receipt;
    }

    /**
     * Computes the total amount of sales for the whole day.
     * 
     * @return sale total
     */
    public double getSalesTotal() {
	return saleTotal;
    }

    /**
     * Returns the number of sales for the whole day.
     * 
     * @return the number of sales.
     */
    public int getSalesCount() {
	return saleCount;
    }

    /**
     * Resets the saleTotal and saleCount.
     */
    public void reset() {
	saleTotal = 0;
	saleCount = 0;
    }
}