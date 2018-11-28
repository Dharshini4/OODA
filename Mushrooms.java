package pos.decorater;
import pos.factoryandtemplate.PizzaTemplate;

	public class Mushrooms extends ToppingsDecorator {
		PizzaTemplate pizza; 
		  
	    public Mushrooms(PizzaTemplate pizza) { this.pizza = pizza; } 
	    /**
	     * @return Returns the pizza name concatenated with the topping name
	     */

	    public String getName() { 
	        return pizza.getName() + ", Mushrooms"; 
	    } 
	    /**
	     * @return Returns the pizza cost summed with the topping name
	     */

	    public int getCost() { return 5 + pizza.getCost(); }

	    public void prepare() {}
	    public void bake() {}
	    public void cut() {}
	    public void box() {}

	}


