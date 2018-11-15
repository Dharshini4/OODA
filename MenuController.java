package pos.controller;

import pos.model.MenuModel;
import pos.view.MenuView;

public class MenuController {
	private MenuModel model;
	private MenuView view;
	public MenuController(MenuModel model, MenuView view){
	      this.model = model;
	      this.view = view;
	   }
	public void MenuModelItemId(int itemId){
	      model.setItemId(itemId);		
	   }
	public void MenuModelItemPrice(int itemPrice){
	      model.setItemPrice(itemPrice);		
	   }
	public void MenuModelItemName(String itemName){
	      model.setItemName(itemName);		
	   }

	public int getItemId(){
	      return model.getItemId();		
	   }
	public String getItemName(){
	      return model.getItemName();		
	   }
	public int getItemPrice(){
	      return model.getItemPrice();		
	   }
		  
	   public void updateView(){				
	      view.printMenuDetails(model.getItemName(), model.getItemId(),model.getItemPrice());
	   }	

}
