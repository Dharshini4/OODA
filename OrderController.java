package pos.controller;

import pos.model.OrderModel;
import pos.view.OrderView;

public class OrderController {
	private OrderModel model;
	private OrderView view;

	public OrderController(OrderModel model, OrderView view){
	      this.model = model;
	      this.view = view;
	   }

	public void OrderModelOrderId(int orderId){
	      model.setOrderId(orderId);		
	   }

	public int getOrderId(){
	      return model.getOrderId();		
	   }

	public void OrderModelOrderName(String orderName){
	      model.setOrderName(orderName);		
	   }

	public String getOrderName(){
	      return model.getOrderName();		
	   }
	public void OrderModelOrderQuantity(int orderQuantity){
	      model.setOrderQuantity(orderQuantity);		
	   }

	public int getOrderQuantity(){
	      return model.getOrderQuantity();		
	   }

	public void OrderModelTotalAmount(int totalAmount){
	      model.setOrderQuantity(totalAmount);		
	   }

	public int getTotalAmount(){
	      return model.getTotalAmount();		
	   }

	
	   public void updateView(){				
	      view.printOrderDetails(model.getOrderId(), model.getOrderName(),model.getOrderQuantity(),model.getTotalAmount());
	   }	

}
