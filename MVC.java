package pos.controller;

import pos.model.PizzaModel;
import pos.view.PizzaView;

import pos.model.OrderModel;
import pos.view.OrderView;



public class MVC {
	   public static void main(String[] args) {

		      //fetch student record based on his roll no from the database
		      PizzaModel model  = retrivePizzaFromDatabase();

		      //Create a view : to write student details on console
		      PizzaView view = new PizzaView();

		      PizzaController controller = new PizzaController(model, view);

		      controller.updateView();

		      //update model data
		      controller.setposmodelSize("large");

		      controller.updateView();
		      
		      OrderModel o_model  = retriveOrderFromDatabase();
		      OrderView o_view = new OrderView();
		      OrderController o_controller = new OrderController(o_model, o_view);
		      o_controller.updateView();
		      o_controller.OrderModelOrderQuantity(2);
		      o_controller.updateView();
		      
		      
		   }

		   private static PizzaModel retrivePizzaFromDatabase(){
		      PizzaModel pizza=new PizzaModel();
			  pizza.setCheese("low");
			  pizza.setVegan("yes");
			  pizza.setCrust("thin");
			  pizza.setSize("med");
			  return pizza;
		   }
			
			private static OrderModel retriveOrderFromDatabase(){
			      OrderModel order=new OrderModel();
				  order.setOrderId(010);
				  order.setOrderName("ABC");
				  order.setOrderQuantity(1);
				  order.setTotalAmount(100);
				  return order;
		   }
}
