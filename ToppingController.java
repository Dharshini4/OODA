package pos.controller;
import pos.model.ToppingModel;
import pos.view.ToppingView;

public class ToppingController {
	private ToppingModel model;
	private ToppingView view;

	public ToppingController(ToppingModel model, ToppingView view){
	      this.model = model;
	      this.view = view;
	   }
	public void ToppingModelToppingName(String toppingName){
	      model.setToppingName(toppingName);		
	   }

	public String getToppingName(){
	      return model.getToppingName();		
	   }

	public void ToppingModelToppingQuantity(int toppingQuantity){
	      model.setToppingQuantity(toppingQuantity);		
	   }

	public int getToppingQuantity(){
	      return model.getToppingQuantity();		
	   }
	public void updateView(){				
	      view.printToppingDetails(model.getToppingName(),model.getToppingQuantity());
	   }


}
