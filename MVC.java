package pos.controller;
import pos.template.CheesePizza;
import pos.model.*;
import pos.view.*;
import pos.template.*;


public class MVC {
	   public static void main(String[] args) {

		   // Using template design pattern to create Cheese Pizza
		   
		   PizzaTemplate cheesepizza= new CheesePizza();
		   cheesepizza.makePizza("yes","large","thin","Mozarella");
		   System.out.println("Cheese Pizza is ready!");
		   System.out.println("-----------------------");
		   PizzaTemplate pepperonipizza= new PepperoniPizza();
		   pepperonipizza.makePizza("no","med","thick","Cheddar");
		   System.out.println("Pepperoni Pizza is ready!");
		   System.out.println("-----------------------");
		   
		  /* 
		   //fetch data from the database, Checking Pizza MVC
		      PizzaModel model  = retrivePizzaFromDatabase();
		      PizzaView view = new PizzaView();
		      PizzaController controller = new PizzaController(model, view);
		      controller.updateView();
		      //Update model data
		      //controller.setposmodelSize("large");
		      controller.updateView();
		      
		   //fetch data from the database, Checking Order MVC
		      OrderModel o_model  = retriveOrderFromDatabase();
		      OrderView o_view = new OrderView();
		      OrderController o_controller = new OrderController(o_model, o_view);
		      o_controller.updateView();
		      o_controller.OrderModelOrderQuantity(2);
		      o_controller.updateView();
		      */
		      //fetch data from the database, Checking Topping MVC
		      ToppingModel t_model  = retriveToppingFromDatabase();
		      ToppingView t_view = new ToppingView();
		      ToppingController t_controller = new ToppingController(t_model, t_view);
		      t_controller.updateView();
		      t_controller.ToppingModelToppingName("Olives");
		      t_controller.updateView();
		      
		    //fetch data from the database, Checking User MVC
		      UserModel u_model  = retriveUserFromDatabase();
		      UserView u_view = new UserView();
		      UserController u_controller = new UserController(u_model, u_view);
		      u_controller.updateView();
		      u_controller.UserModelUserMobileNumber("7208942137");
		      u_controller.updateView();
		      
		    //fetch data from the database, Checking Payment MVC
		      PaymentModel p_model  = retrivePaymentFromDatabase();
		      PaymentView p_view = new PaymentView();
		      PaymentController p_controller = new PaymentController(p_model, p_view);
		      p_controller.updateView();
		      //p_controller.PaymentModelPaymentAmount(720);
		      //p_controller.updateView();
		      
		    //fetch data from the database, Checking Menu MVC
		      MenuModel m_model  = retriveMenuFromDatabase();
		      MenuView m_view = new MenuView();
		      MenuController m_controller = new MenuController(m_model, m_view);
		      m_controller.updateView();
		      m_controller.MenuModelItemPrice(15);
		      m_controller.updateView();
		    
		      
		      
		      		      
		   }
		   private static ToppingModel retriveToppingFromDatabase(){
		      ToppingModel topping=new ToppingModel();
			  topping.setToppingName("Onion");
			  topping.setToppingQuantity(2);
			  return topping;
		   }
		   
		   private static UserModel retriveUserFromDatabase(){
			      UserModel user=new Customer();
				  user.setUserName("Amy");
				  user.setUserMobileNumber("7208942134");
				  user.setUserAddress("124, XYZ St, Boulder, CO");
				  return user;
			   }
		   
		   private static MenuModel retriveMenuFromDatabase(){
			   	MenuModel menu=new MenuModel();
				menu.setItemId(12);
				menu.setItemPrice(12);
				menu.setItemName("Veggie Delight");
			   	return menu;
			   }
		   private static PaymentModel retrivePaymentFromDatabase(){
			   PaymentModel payment=new PayPal();
			   payment.setPaymentId(110);
			   payment.makePayment(1002435,123);
				  return payment;
			   }
	/*	   private static PizzaModel retrivePizzaFromDatabase(){
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
*/}