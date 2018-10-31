package pos.model;

public class OrderModel {
	private int orderId;
	private String orderName;
	private int orderQuantity;
	private int totalAmount;
	
	public void deliverOrder() {
	    // To do 
	 }
	public int getOrderId() {
	     return orderId;
	 }
	public void setOrderId(int orderId)
	{
		this.orderId=orderId;
	}

	public int getTotalAmount() {
	     return totalAmount;
	 }
	public void setTotalAmount(int totalAmount)
	{
		this.totalAmount=totalAmount;
	}

	public int getOrderQuantity() {
	     return orderQuantity;
	 }
	public void setOrderQuantity(int orderQuantity)
	{
		this.orderQuantity=orderQuantity;
	}

	
	public String getOrderName() {
	     return orderName;
	 }
	public void setOrderName(String orderName)
	{
		this.orderName=orderName;
	}


}
