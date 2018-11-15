package pos.model;

public abstract class PaymentModel {
	private int paymentId;
	private int paymentAmount;
	private String paymentDetails;
	private int paymentNumber;
	private int code;
	
	public int getPaymentDue()
	{
		return paymentAmount;
	}
	abstract public void makePayment(int paymentNumber, int code);
	/*this.paymentAmount=paymentAmount;
	}*/
	
	public void setPaymentId(int paymentId)
	{
		this.paymentId=paymentId;
	}
	
	public int getPaymentId()
	{
		return paymentId;
	}
	
	//Save in Database 
	public void saveUserDetails()
	{
		
	}
}
