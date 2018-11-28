package pos.controller;
import pos.builder.*;
import pos.model.PizzaModel;
import pos.view.PizzaView;

public class PizzaController {
	private PizzaModel model;
	private PizzaView view;
	/**
	 * Class Constuctor
	 */
	
	public PizzaController(PizzaModel model, PizzaView view){
	      this.model = model;
	      this.view = view;
	   }
	public Cheese getCheese(){
	      return model.getCheese();		
	   }
	public Sauce getSauce(){
	      return model.getSauce();		
	   }
	public Crust getCrust(){
	      return model.getCrust();		
	   }
/*
	public String getSize(){
	      return model.getSize();		
	   }
*/	
	public int getCookingTime(){
	      return model.getCookingTime();		
	   }
			  
	   public void updateView(){				
	      view.printPizzaDetails(String.valueOf(model.getCheese()),String.valueOf(model.getSauce()),String.valueOf(model.getCrust()),model.getCookingTime());
	   }	

}
