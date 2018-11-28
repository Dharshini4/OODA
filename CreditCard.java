package pos.model;

public class CreditCard extends PaymentModel {
		private String cardNumber;
		private String cvv;
		/**
		 * @param cardNumber Number of the credit card used by the customer
		 * @param cvv CVV of the credit card used by the customer
		 */
		@Override
		public void makePayment(String cardNumber, String cvv)
		{
		this.cardNumber=cardNumber;
		this.cvv=cvv;
		System.out.println("Transaction is successful.");
		System.out.println("Enjoy your order!!");
		}

		
	 	
}


