package pos.builder;
import pos.model.*;
public class PizzaBuilder implements Builder {
	PizzaModel pizza = new PizzaModel();
	 /**
	  * 
	  * @param size Size to which the pizza must be cooked
	  * @return New PizzaBuilder object of the specified size
	  */
 
    public PizzaBuilder withSize(Size size) {
        pizza.setSize(size);
        System.out.println("Size is set to "+String.valueOf(size));
        return this;
    }
    /**
	  * 
	  * @param crust Crust to which the pizza must be cooked
	  * @return New PizzaBuilder object of the specified crust
	  */

    public PizzaBuilder withCrust(Crust crust) {
        pizza.setCrust(crust);
        System.out.println(String.valueOf(crust)+" crust is chosen");
        return this;
    }
    
    /**
	  * 
	  * @param cheese Specified cheese to which the pizza must be cooked
	  * @return New PizzaBuilder object of the specified cheese
	  */

    public PizzaBuilder withCheese(Cheese cheese) {
        pizza.setCheese(cheese);
        System.out.println(String.valueOf(cheese)+" cheese is chosen");
        return this;
    }
    /**
	  * 
	  * @param sauce Specified sauce to which the pizza must be cooked
	  * @return New PizzaBuilder object of the specified sauce
	  */

    public PizzaBuilder withSauce(Sauce sauce) {
        pizza.setSauce(sauce);
        System.out.println(String.valueOf(sauce)+" sauce is chosen");
        return this;
    }
 
    public PizzaModel build() {
        return pizza;
    }
 }
