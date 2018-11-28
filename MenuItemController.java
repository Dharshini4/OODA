package pos.controller;
import pos.model.MenuItemModel;
import pos.view.MenuItemView;

public class MenuItemController {
	private MenuItemModel model;
	private MenuItemView view;
	/**
	 * Class Constuctor
	 */
	
	public MenuItemController(MenuItemModel model, MenuItemView view){
	      this.model = model;
	      this.view = view;
	   }
	public void MenuItemModelItemId(String itemId){
	      model.setItemId(itemId);		
	   }

	public String getItemId(){
	      return model.getItemId();		
	   }

	public void MenuItemModelItemName(String itemName){
	      model.setItemName(itemName);		
	   }

	public String getItemName(){
	      return model.getItemName();		
	   }
	public void MenuItemModelCookingTime(String cookingTime){
	      model.setCookingTime(cookingTime);		
	   }

	public String getCookingTime(){
	      return model.getCookingTime();		
	   }

	public void MenuItemModelItemPrice(String itemPrice){
	      model.setItemPrice(itemPrice);		
	   }

	public String getItemPrice(){
	      return model.getItemPrice();		
	   }
			  
	   public void updateView(){				
	      view.printMenuItemDetails(model.getItemId(), model.getItemName(),model.getItemPrice(), model.getCookingTime());
	   }	

}
