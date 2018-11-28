package pos.view;
public class PizzaView {
	/**
	 * @param cheese Name of the cheese chosen by the customer
	 * @param sauce Name of the sauce chosen by the customer
	 * @param crust Name of the crust chosen by the customer
	 * @param cookingTime Time to cook the selected item
	 */
	public void printPizzaDetails(String cheese, String sauce, String crust, int cookingTime){
	      System.out.println("Pizza Specifications: ");
	      System.out.println("Crust: " + crust);
	      System.out.println("Sauce: " + sauce);
	      System.out.println("Cheese: " + cheese);
	      System.out.println("Cooking Time (sec): " + cookingTime);

}
}
