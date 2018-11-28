package pos.view;
public class MenuItemView {
	/**
	 * @param itemId Id of the item, as specified in the menu
	 * @param itemName Name of the item, as specified in the menu
	 * @param itemPrice Cost to be paid by the customer when this item is bought
	 * @param cookingTime Time to cook the selected item
	 */

	public void printMenuItemDetails(String itemId, String itemName, String itemPrice, String cookingTime){
	      System.out.println("Item Specifications: ");
	      System.out.println("Item Id: " + itemId);
	      System.out.println("Item name: " + itemName);
	      System.out.println("Item price: " + itemPrice);
	      System.out.println("Cooking time: " + cookingTime);
	      
}
}
