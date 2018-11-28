package pos.factoryandtemplate;

public class PepperoniPizza extends PizzaTemplate{
	
	 public PepperoniPizza()
	 {
		 this.name="Pepperoni";
	 }
	
	 @Override
     public void prepare() {
           System.out.println("Preparing dough !!");

     }

     @Override
     public void bake() {
           System.out.println("Baking Pepperoni Pizza !!");

     }

     @Override
     public void cut() {
           System.out.println("Cutting Pepperoni Pizza !!");

     }

     @Override
     public void box() {
           System.out.println("Packing Pepperoni Pizza !!");

     }	
     public int getCost() {  return 12; }
}
