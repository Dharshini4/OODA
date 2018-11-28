package pos.controller;
import java.io.*;
import pos.model.*;
import pos.view.*;
import pos.factoryandtemplate.*;
import java.util.concurrent.TimeUnit;
import pos.decorater.*;
import pos.builder.*;
import java.util.*;

public class UI {
	   public static void main(String[] args) throws Exception {
		   Scanner in = new Scanner(System.in);
		   System.out.println("Welcome to Pizzeria!\nChoose your login\n1.Customer\n2.Admin");
		   int login=in.nextInt();

		   switch (login) {
		   case 1:  
			      customerActions();
			      break;
		   case 2:
			   	  System.out.println("Choose your action\n1.View Orders\n2.View Menu\n3.Add Menu items");
			      int action=in.nextInt();
			      switch (action) {
				   case 1:  
					      viewOrders();
					      break;
				   case 2:
					   MenuModel menu1=new MenuModel();
					   menu1.buildMenu();
					   System.out.println(menu1.toString());
					   break;
				   case 3:
						MenuModel menu=new MenuModel();
						menu.buildMenu();
						Scanner item = new Scanner(System.in);
						System.out.println("Choose the type of item you want to add\n1.Pizza\n2.Topping\n3.Cheese\n4.Crust\n5.Sauce");
						int type=item.nextInt();
						switch (type) {
				   			case 1:
				   				Scanner i = new Scanner(System.in);
				   				System.out.println("Enter new pizza item details");
								System.out.println("Enter the pizza id:");
								String id=i.nextLine();
								System.out.println("Enter the pizza name:");
								String name=i.nextLine();
								System.out.println("Enter the pizza price:");
								String price=i.nextLine();
								System.out.println("Enter the cooking time:");
								String cookingTime=i.nextLine();
								menu.addPizzas(id,name,price,cookingTime);
								System.out.println(menu.toString()); 
				   				break;
				   				
				   			case 2:
				   				Scanner j= new Scanner(System.in);
				   				System.out.println("Enter new topping item details");
								System.out.println("Enter the topping id:");
								String toppingId=j.nextLine();
								System.out.println("Enter the topping name:");
								String toppingName=j.nextLine();
								System.out.println("Enter the topping price:");
								String toppingPrice=j.nextLine();
								menu.addToppings(toppingId,toppingName,toppingPrice);
								System.out.println(menu.toString()); 
				   				break;
				   				
				   			case 3:
				   				Scanner k = new Scanner(System.in);
				   				System.out.println("Enter new cheese item details");
								System.out.println("Enter the cheese id:");
								String cheeseId=k.nextLine();
								System.out.println("Enter the cheese name:");
								String cheeseName=k.nextLine();
								menu.addCheese(cheeseId,cheeseName);
								System.out.println(menu.toString()); 
				   				break;
				   			
				   			case 4:
				   				Scanner l = new Scanner(System.in);
				   				System.out.println("Enter new crust item details");
								System.out.println("Enter the crust id:");
								String crustId=l.nextLine();
								System.out.println("Enter the crust name:");
								String crustName=l.nextLine();
								menu.addCrust(crustId,crustName);
								System.out.println(menu.toString()); 
				   				break;
				   				
				   			case 5:
				   				Scanner m = new Scanner(System.in);
				   				System.out.println("Enter new sauce item details");
								System.out.println("Enter the sauce id:");
								String sauceId=m.nextLine();
								System.out.println("Enter the sauce name:");
								String sauceName=m.nextLine();
								menu.addCrust(sauceId,sauceName);
								System.out.println(menu.toString()); 
				   				break;
				   				
				   			default:
				   				break;
						}
						
				   default:
						  break;
			      }
		   default:
			  break;
		   }
		   
	   }
		private static void customerActions()
		{      Scanner in = new Scanner(System.in);
			   int choice=1;
			   int topping=0, cheese=0, crust=0, sauce=0, size=0;
			   boolean paid=true;	   
			   System.out.println("Check out our awesome menu!");
			   MenuModel menu=new MenuModel();
			   menu.buildMenu();
			   System.out.println(menu.toString());
			   System.out.println("Enter 0 to exit");
			   System.out.println("Choose the pizza you want");
			   choice = in.nextInt();
			   if(choice!=0) {
			   System.out.println("Enter your choice of Topping, Cheese, Crust and Sauce");
			   System.out.println("Enter -1 if you don't want any");
			   topping=in.nextInt();
			   cheese=in.nextInt();
			   crust=in.nextInt();
			   sauce=in.nextInt();
			   System.out.println("Enter your pizza size");	  
			   size=in.nextInt();
			   }
			   switch (choice) {
			    case 0:
				      System.out.println("You have exited! Thanks for your purchase!!");
				      break;
			    case 1:
			      System.out.println("GardenFresh pizza is selected");
			      addExtras(cheese, crust, sauce,size);
			      System.out.println("----------------------------------------------------------------");
			      cookPizza(5,"gardenfresh",topping);
			      paid=makePayment();
			      if (paid==false)
			    	  System.out.println("Transaction failed.");
			      break;
			    case 2:
			      System.out.println("Pepperoni pizza is selected");
			      addExtras(cheese, crust, sauce,size);
			      System.out.println("----------------------------------------------------------------");
			      cookPizza(3,"pepperoni",topping);
			      paid=makePayment();
			      if (paid==false)
			    	  System.out.println("Transaction failed.");
			      break;
			    case 3:
			      System.out.println("Cheese pizza is selected");
			      addExtras(cheese, crust, sauce,size);
			      System.out.println("----------------------------------------------------------------");
			      cookPizza(2,"cheese",topping);
			      paid=makePayment();
			      if (paid==false)
			    	  System.out.println("Transaction failed.");
			      break;
			    case 4:
				      System.out.println("Roasted Chicken pizza is selected");
				      addExtras(cheese, crust, sauce,size);
				      System.out.println("----------------------------------------------------------------");
				      cookPizza(4,"roastedchicken",topping);
				      paid=makePayment();
				      if (paid==false)
				    	  System.out.println("Transaction failed.");
				      break;
			    case 5:
				      System.out.println("Margherita pizza is selected");
				      addExtras(cheese, crust, sauce,size);
				      System.out.println("----------------------------------------------------------------");
				      cookPizza(1,"margherita",topping);
				      paid=makePayment();
				      if (paid==false)
				    	  System.out.println("Transaction failed.");
				      break;
				case 6:
					  System.out.println("Sicilian pizza is selected");
					  addExtras(cheese, crust, sauce,size);
					  System.out.println("----------------------------------------------------------------");
					  cookPizza(2,"sicilian",topping);
					  paid=makePayment();
				      if (paid==false)
				    	  System.out.println("Transaction failed.");
				      break;
			    default:
			      System.out.println("Invalid selection");
			      break; 
			    }
		}
		 
		private static void viewOrders()
		{
			System.out.println("The Pizza orders placed today are");
			try { 
	            BufferedReader in = new BufferedReader(new FileReader("Orders.txt")); 
	            String mystring; 
	            while ((mystring = in.readLine()) != null) { 
	                System.out.println(mystring); 
	            } 
	        } 
	        catch (IOException e) { 
	            System.out.println("Exception Occurred" + e); 
	        } 
		}
		
		 
	   private static void addExtras(int cheese, int crust, int sauce, int size){
		   /*
		    * Using Builder design pattern to add extras
		    */
		   PizzaModel a;
		   switch (size) {
		   case 1:  
			      a = new PizzaBuilder().withSize(Size.SMALL).build();
			      break;
		   case 2:
			      a = new PizzaBuilder().withSize(Size.MEDIUM).build();
			      break;
		   case 3:
			      a = new PizzaBuilder().withSize(Size.LARGE).build();
			      break;
		   case 4:
				  a = new PizzaBuilder().withSize(Size.EXTRALARGE).build();
				  break;
		  default:
			  break;
		   }
		   switch (cheese) {
		   case 1:  
			      a = new PizzaBuilder().withCheese(Cheese.FETA).build();
			      break;
		   case 2:
			      a = new PizzaBuilder().withCheese(Cheese.GOUDA).build();
			      break;
		   case 3:
			      a = new PizzaBuilder().withCheese(Cheese.MOZZARELLA).build();
			      break;
		   case 4:
				  a = new PizzaBuilder().withCheese(Cheese.CHEDDAR).build();
				  break;
		  default:
			  break;
		   }
		   switch (crust) {
		   case 1:
			      a = new PizzaBuilder().withCrust(Crust.REGULAR).build();
			      break;
		   case 2:
			      a = new PizzaBuilder().withCrust(Crust.THICK).build();
			      break;
		   case 3:
			      a = new PizzaBuilder().withCrust(Crust.THIN).build();
			      break;
		   default:
				  break;
			   	   
		   }
		   switch (sauce) {
		   case 1:
			      a = new PizzaBuilder().withSauce(Sauce.PESTO).build();
			      break;
		   case 2:
			      a = new PizzaBuilder().withSauce(Sauce.SALSA).build();
			      break;
		   case 3:
			      a = new PizzaBuilder().withSauce(Sauce.HUMMUS).build();
			      break;
		   default:
				  break;
			   	   
		   }
		   
		   
	   }
	   private  static void saveOrders(String order)
	   {
		   try { 
	            BufferedWriter out = new BufferedWriter(new FileWriter("Orders.txt", true)); 
	            out.write(order+"\n"); 
	            out.close(); 
	        } 
	        catch (IOException e) { 
	            System.out.println("exception occoured" + e); 
	        } 
	   }
	   
	   private static void cookPizza(int time, String type, int topping){
		   /*
		    * Using Factory and Template design pattern for creating pizza object and defining it's steps respectively
		    */
		
		   PizzaTemplate pizza  = PizzaFactory.orderPizza(type);
		   /*
		    * Using Decorator design pattern to add toppings
		    */
		
		   switch (topping) {
		    case 1:
		      pizza = new Barbeque(pizza);   
		      System.out.println("Barbeque topping is chosen !!");
		      System.out.println( "Total cost for "+pizza.getName() + " topping is $" + pizza.getCost()); 
		      saveOrders(pizza.getName() + " topping");
		      break;
		    case 2:
		      pizza = new Sausage(pizza);	
		      System.out.println("Sausage topping is chosen !!");
		      System.out.println( "Total cost for "+pizza.getName() + " topping is $" + pizza.getCost());
		      saveOrders(pizza.getName() + " topping");
		      break;
		    case 3:
		      pizza = new Mushrooms(pizza);	
		      System.out.println("Mushrooms topping is chosen !!");
		      System.out.println( "Total cost for "+pizza.getName() + " topping is $" + pizza.getCost());
		      saveOrders(pizza.getName() + " topping");
		      break;
		    case 4:
		      pizza = new Olives(pizza);	
			  System.out.println("Olives topping is chosen !!");
			  System.out.println( "Total cost for "+pizza.getName() + " topping is $" + pizza.getCost());
			  saveOrders(pizza.getName() + " topping");
			  break;
		    default:
		    	  System.out.println("No topping is chosen !!");
			      System.out.println( pizza.getName() + " Total Cost : $" + pizza.getCost());  
			      saveOrders(pizza.getName());
				  break;
		   }
		    
		   
		   try {
			   TimeUnit.SECONDS.sleep(time);
		    }
			   
			   catch(InterruptedException ex)
			   {
			       Thread.currentThread().interrupt();
			   }
		    
		   System.out.println("Thank you for waiting "+String.valueOf(time)+" seconds");  
		   System.out.println("----------------------------------------------------------------"); 
	   }
	   
	   private static boolean makePayment(){
		   Scanner reader = new Scanner(System.in);  
		   System.out.println("Choose your preferred payment method\n1.PayPal\n2.Creditcard");
		   int payment = reader.nextInt();
		   if (payment==1) {
			   PaymentModel paypal=new PayPal(); 
			   Scanner sc=new Scanner(System.in);
			   System.out.println("Enter your PayPal account username");
			   String accountName=sc.nextLine();
			   System.out.println("Enter the password ");
			   String code = sc.nextLine();
			   paypal.makePayment(accountName,code);
			   return true;
		   }
			   
		   else {
			   PaymentModel creditCard=new CreditCard(); 
			   Scanner sc=new Scanner(System.in);
			   System.out.println("Enter your Card number");
			   String cardNo=sc.nextLine();
			   System.out.println("Enter the CVV ");
			   String cvv = sc.nextLine();
			   if (cardNo.length()<16){
				   System.out.println("Card number must be of atleast 16 digits");
				   return false;
			   }
			   if (cvv.length()<3){
				   System.out.println("CVV must be of 3 digits");
				   return false;
			   }
			   if (cvv.length()>3){
				   System.out.println("CVV must be of 3 digits");
				   return false;
			   }
			   
			   creditCard.makePayment(cardNo,cvv);
			   return true;
			   
	   }
	   }

}