package pos.controller;
import pos.model.PaymentModel;
import pos.view.PaymentView;

public class PaymentController {
	private PaymentModel model;
	private PaymentView view;

	public PaymentController(PaymentModel model, PaymentView view){
	      this.model = model;
	      this.view = view;
	   }
	public void PaymentModelPaymentId(int paymentId){
	      model.setPaymentId(paymentId);		
	   }

	public int getPaymentId(){
	      return model.getPaymentId();		
	   }
	public void PaymentModelPaymentAmount(int paymentNumber, int code){
	      model.makePayment(paymentNumber, code);		
	   }

	public int getPaymentDue(){
	      return model.getPaymentDue();		
	   }
	
	public void updateView(){				
	      view.printPaymentDetails(model.getPaymentId(),model.getPaymentDue());
	   }

}
