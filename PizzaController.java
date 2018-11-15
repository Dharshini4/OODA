package pos.controller;

import pos.model.PizzaModel;
import pos.view.PizzaView;

public class PizzaController {
	private PizzaModel model;
	private PizzaView view;
	public PizzaController(PizzaModel model, PizzaView view){
	      this.model = model;
	      this.view = view;
	   }
	public String getCheese(){
	      return model.getCheese();		
	   }
	public String getVegan(){
	      return model.getVegan();		
	   }
	public String getCrust(){
	      return model.getCrust();		
	   }

	public String getSize(){
	      return model.getSize();		
	   }
	
		  
	   public void updateView(){				
	      view.printPizzaDetails(model.getCheese(), model.getVegan(),model.getCrust(),model.getSize());
	   }	

}
