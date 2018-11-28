package pos.decorater;
import pos.factoryandtemplate.*;

public class Olives extends ToppingsDecorator {
	PizzaTemplate pizza; 
	  
    public Olives(PizzaTemplate pizza) { this.pizza = pizza; } 
    /**
     * @return Returns the pizza name concatenated with the topping name
     */

    public String getName() { 
        return pizza.getName() + ", Olives"; 
    } 
    /**
     * @return Returns the pizza cost summed with the topping name
     */

    public int getCost() { return 9 + pizza.getCost(); }
    
    public void prepare() {}
    public void bake() {}
    public void cut() {}
    public void box() {}



}
