package pos.model;

public class PayPal extends PaymentModel {
	private int accountNumber;
	private int securityCode;
	
	@Override
	public void makePayment(int accountNumber, int securityCode)
	{
	this.accountNumber=accountNumber;
	this.securityCode=securityCode;
	}
	

}
