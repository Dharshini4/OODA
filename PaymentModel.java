package pos.model;

public abstract class PaymentModel {
	private int paymentId;
	private int paymentAmount;
	
	public int getPaymentDue()
	{
		return paymentAmount;
	}
	abstract public void makePayment(String paymentNumber, String code);
	
	public void setPaymentId(int paymentId)
	{
		this.paymentId=paymentId;
	}
	
	public int getPaymentId()
	{
		return paymentId;
	}
	
	
}
