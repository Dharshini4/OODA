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

	public void setposmodelCheese(String cheese){
	      model.setCheese(cheese);		
	   }

	public String getCheese(){
	      return model.getCheese();		
	   }

	public void setposmodelVegan(String vegan){
	      model.setVegan(vegan);		
	   }

	public String getVegan(){
	      return model.getVegan();		
	   }

	public void setposmodelCrust(String crust){
	      model.setCrust(crust);		
	   }

	public String getCrust(){
	      return model.getCrust();		
	   }

	public void setposmodelSize(String size){
	      model.setSize(size);		
	   }

	public String getSize(){
	      return model.getSize();		
	   }
	
	
	  
	   public void updateView(){				
	      view.printPizzaDetails(model.getCheese(), model.getVegan(),model.getCrust(),model.getSize());
	   }	

}
