public class CashRegisterTester {
    public static void main(String[] args) {
	CashRegister c = new CashRegister();

	c.recordPurchase(10.69);
	c.recordPurchase(52);
	c.recordPurchase(0.92);
	c.receivePayment(70);

	System.out.println(c.printReceipt());
	System.out.println(c.getSalesCount());
	System.out.println(c.getSalesTotal());
	System.out.println("\n");

	c.recordPurchase(100);
	c.receivePayment(110);

	System.out.println(c.printReceipt());
	System.out.println(c.getSalesCount());
	System.out.println(c.getSalesTotal());
	System.out.println("\n");

    }
}