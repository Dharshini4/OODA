package pos.model;

public class CreditCard extends PaymentModel {
		private int cardNumber;
		private int cvv;
		@Override
		public void makePayment(int cardNumber, int cvv)
		{
		this.cardNumber=cardNumber;
		this.cvv=cvv;
		}

		
	 	
}


