package pos.view;
public class PaymentView {
	/**
	 *@param paymentId  Id of the payment made by the customer
	 *@param paymentAmount Amount to be paid by the customer for his order
	 */

	public void printPaymentDetails(int paymentId, int paymentAmount ){
	      System.out.println("Payment Details: ");
	      System.out.println("Payment Id: "+paymentId);
	      System.out.println("Amout paid: "+paymentAmount+ "$");
	    	}
}
