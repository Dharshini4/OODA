package pos.factoryandtemplate;

public class CheesePizza extends PizzaTemplate {
	 public CheesePizza()
	    {
	    	this.name="Cheese";
	    }
		
	
    @Override
    public void prepare() {
          System.out.println("Preparing dough !!");
         
    }

    @Override
    public void bake() {
          System.out.println("Baking Cheese Pizza !!");
         
    }

    @Override
    public void cut() {
          System.out.println("Cutting Cheese Pizza !!");
         
    }

    @Override
    public void box() {
          System.out.println("Packing Cheese Pizza !!");
    }
    public int getCost() {  return 10; } 
}
