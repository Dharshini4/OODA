package pos.model;

public class PayPal extends PaymentModel {
	private String userName;
	private String password;
	/**
	 * @param userName User name for the customer's Paypal account
	 * @param password Password for the customer's Paypal account
	 */

	@Override
	public void makePayment(String userName, String password )
	{
	this.userName=userName;
	this.password=password;
	System.out.println("Transaction is successful.");
	System.out.println("Enjoy your order!!");
	}
	

}
