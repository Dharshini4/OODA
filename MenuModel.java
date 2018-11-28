package pos.model;

import java.util.ArrayList;

public class MenuModel {
public ArrayList<MenuItemModel> pizzas=new ArrayList<MenuItemModel>();
public ArrayList<MenuItemModel> toppings=new ArrayList<MenuItemModel>();
public ArrayList<MenuItemModel> cheese=new ArrayList<MenuItemModel>();
public ArrayList<MenuItemModel> crust=new ArrayList<MenuItemModel>();
public ArrayList<MenuItemModel> sauce=new ArrayList<MenuItemModel>();
public ArrayList<MenuItemModel> size=new ArrayList<MenuItemModel>();
/**
 * Builds the menu, where items are created using MenuItem class	
 */

public void buildMenu()
{
	pizzas.add(new MenuItemModel("ID","NAME","      PRICE","COOKING TIME"));
	pizzas.add(new MenuItemModel("1","GardenFresh","$10","5"));
	pizzas.add(new MenuItemModel("2","Pepperoni","$12","3"));
	pizzas.add(new MenuItemModel("3","Cheese     ","$10","2"));
	pizzas.add(new MenuItemModel("4","Roasted Chicken","$11","4"));
	pizzas.add(new MenuItemModel("5","Margherita","$15","1"));
	
	toppings.add(new MenuItemModel("1","Barbeque","$4",""));
	toppings.add(new MenuItemModel("2","Sausage      ","$7",""));
	toppings.add(new MenuItemModel("3","Mushrooms","$5",""));
	toppings.add(new MenuItemModel("4","Olives     ","$9",""));
	
	cheese.add(new MenuItemModel("1","Feta     ","",""));
	cheese.add(new MenuItemModel("2","Gauda      ","",""));
	cheese.add(new MenuItemModel("3","Mozzarella","",""));
	cheese.add(new MenuItemModel("4","Cheddar     ","",""));
	
    crust.add(new MenuItemModel("1","Regular","",""));
    crust.add(new MenuItemModel("2","Thick","",""));
    crust.add(new MenuItemModel("3","Thin    ","",""));
  
	sauce.add(new MenuItemModel("1","Pesto","",""));
	sauce.add(new MenuItemModel("2","Salsa","",""));
	sauce.add(new MenuItemModel("3","Hummus","",""));
	
	size.add(new MenuItemModel("1","Small","",""));
	size.add(new MenuItemModel("2","Medium","",""));
	size.add(new MenuItemModel("3","Large","",""));
	size.add(new MenuItemModel("4","Extra Large","",""));
}

 
/**
 * @return Returns the list of all pizzas in the menu in String format	
 */

public String getAllPizzaItems()
{
	String strMenu="";
	strMenu+="PIZZAS:\n";
	strMenu+="----------------------------------------------------------------\n";
	for (int i=0;i<pizzas.size();i++) {
		MenuItemModel a= pizzas.get(i);
		strMenu+=a.toString()+"\n";
		
	}
	return strMenu;
}

/**
 * @return Returns the list of all toppings in the menu in String format	
 */

	public String getAllToppingsItems()
	{
	String strMenu="";
	strMenu+="TOPPINGS:\n";
	strMenu+="----------------------------------------------------------------\n";
	for (int i=0;i<toppings.size();i++) {
		MenuItemModel b= toppings.get(i);
		strMenu+=b.toString()+"\n";
	}
	return strMenu;
	}
	
	/**
	 * @return Returns the list of all cheese in the menu in String format	
	 */

	public String getAllCheeseItems()
	{
		String strMenu="";

	strMenu+="CHEESE:\n";
	strMenu+="----------------------------------------------------------------\n";
	for (int i=0;i<cheese.size();i++) {
		MenuItemModel c= cheese.get(i);
		strMenu+=c.toString()+"\n";
	}
	return strMenu;
}
	
	/**
	 * @return Returns the list of all crust in the menu in String format	
	 */

	public String getAllCrustItems()
	{
		String strMenu="";

	strMenu+="CRUST:\n";
	strMenu+="----------------------------------------------------------------\n";
	for (int i=0;i<crust.size();i++) {
		MenuItemModel c= crust.get(i);
		strMenu+=c.toString()+"\n";
	}
	return strMenu;
}
	/**
	 * @return Returns the list of all sauce in the menu in String format	
	 */


	public String getAllSauceItems()
	{
		String strMenu="";

	strMenu+="SAUCE:\n";
	strMenu+="----------------------------------------------------------------\n";
	for (int i=0;i<sauce.size();i++) {
		MenuItemModel c= sauce.get(i);
		strMenu+=c.toString()+"\n";
	}
	return strMenu;
}
	/**
	 * @return Returns the list of all size options in the menu in String format	
	 */


	public String getAllSizeItems()
	{
		String strMenu="";

	strMenu+="SIZE:\n";
	strMenu+="----------------------------------------------------------------\n";
	for (int i=0;i<size.size();i++) {
		MenuItemModel c= size.get(i);
		strMenu+=c.toString()+"\n";
	}
	return strMenu;
}
	
	/**
	 * @return Returns the list of all pizzas in the menu along with the newly added pizza
	 */


	public String addPizzas(String id, String name, String cost, String cookingTime)
	{
		String strMenu="";
		strMenu+="PIZZAS:\n";
		strMenu+="----------------------------------------------------------------\n";
		
		pizzas.add(new MenuItemModel(id,name,cost,cookingTime));
		for (int i=0;i<pizzas.size();i++) {
			MenuItemModel a= pizzas.get(i);
			strMenu+=a.toString()+"\n";
		}
		return strMenu;
	}
	/**
	 * @return Returns the list of all toppings in the menu along with the newly added toppings
	 */

	public String addToppings(String id, String name, String cost)
	{
		String strMenu="";
		strMenu+="TOPPINGS:\n";
		strMenu+="----------------------------------------------------------------\n";
		
		toppings.add(new MenuItemModel(id,name,cost,""));
		for (int i=0;i<toppings.size();i++) {
			MenuItemModel a= toppings.get(i);
			strMenu+=a.toString()+"\n";
		}
		return strMenu;
	}
	/**
	 * @return Returns the list of all cheese in the menu along with the newly added cheese
	 */

	public String addCheese(String id, String name)
	{
		String strMenu="";
		strMenu+="CHEESE:\n";
		strMenu+="----------------------------------------------------------------\n";
		
	    cheese.add(new MenuItemModel(id,name,"",""));
		for (int i=0;i<cheese.size();i++) {
			MenuItemModel a= cheese.get(i);
			strMenu+=a.toString()+"\n";
		}
		return strMenu;
	}
	
	/**
	 * @return Returns the list of all crust in the menu along with the newly added crust
	 */

	public String addCrust(String id, String name)
	{
		String strMenu="";
		strMenu+="CRUST:\n";
		strMenu+="----------------------------------------------------------------\n";
		
	    crust.add(new MenuItemModel(id,name,"",""));
		for (int i=0;i<crust.size();i++) {
			MenuItemModel a= crust.get(i);
			strMenu+=a.toString()+"\n";
		}
		return strMenu;
	}
	/**
	 * @return Returns the list of all sauce in the menu along with the newly added sauce
	 */


	public String addSauce(String id, String name)
	{
		String strMenu="";
		strMenu+="SAUCE:\n";
		strMenu+="----------------------------------------------------------------\n";
		
	    sauce.add(new MenuItemModel(id,name,"",""));
		for (int i=0;i<sauce.size();i++) {
			MenuItemModel a= sauce.get(i);
			strMenu+=a.toString()+"\n";
		}
		return strMenu;
	}


	public String toString()
{
	String menu="----------------------------------------------------------------\n";
	menu+="PIZZERIA MENU\n"+"----------------------------------------------------------------\n";
	//menu+=getAllPizzaItems();
	menu+=addPizzas("","","","");
	menu+="----------------------------------------------------------------\n";
	menu+=addToppings("","","");
	menu+="----------------------------------------------------------------\n";
	menu+=addCheese("","");
	menu+="----------------------------------------------------------------\n";
	menu+=addCrust("","");
	menu+="----------------------------------------------------------------\n";
	menu+=addSauce("","");
	menu+="----------------------------------------------------------------\n";
	menu+=getAllSizeItems();
	menu+="----------------------------------------------------------------\n";
	return menu;	
}

}
