package pos.factoryandtemplate;
/*
 * Pizza factory class for creating pizzas
 */
public class PizzaFactory {
	/*
	 * @param type Type of the pizza object to be created
	 * @return Created pizza object of specified type using Factory pattern   
	 */
	public static PizzaTemplate orderPizza(String type) {
	          
           PizzaTemplate pizza = null;
           if("cheese".equals(type)) {
                pizza = new CheesePizza();
           } else if("pepperoni".equals(type)) {
                pizza = new PepperoniPizza();
           }
           else if ("gardenfresh".equals(type))
			{
				pizza = new GardenFreshPizza();
			}
           else if ("margherita".equals(type))
			{
				pizza = new MargheritaPizza();
			}
           else if ("roastedchicken".equals(type))
			{
				pizza = new RoastedChickenPizza();
			}
           else if ("sicilian".equals(type))
			{
				pizza = new SicilianPizza();
			}
          
           pizza.preparePizza();
           return pizza;
     }
}
