package pos.decorater;
import pos.factoryandtemplate.*;

public class Barbeque extends ToppingsDecorator {
	PizzaTemplate pizza; 
	  
    public Barbeque(PizzaTemplate pizza) { this.pizza = pizza; } 
    /**
     * @return Returns the pizza name concatenated with the topping name
     */

    public String getName() { 
        return pizza.getName() + ", Barbeque"; 
    } 
    /**
     * @return Returns the pizza cost summed with the topping name
     */

    public int getCost() { return 4 + pizza.getCost(); }
   
    public void prepare() {}
    public void bake() {}
    public void cut() {}
    public void box() {}


}
