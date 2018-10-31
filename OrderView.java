package pos.view;

public class OrderView {
	public void printOrderDetails(int orderId, String orderName, int orderQuantity, int totalAmount){
	      System.out.println("Order Details: ");
	      System.out.println("Order ID: " + orderId);
	      System.out.println("Order Name: " + orderName);
	      System.out.println("Order Quantity: " + orderQuantity);
	      System.out.println("Total Amount: " + totalAmount);
}
}