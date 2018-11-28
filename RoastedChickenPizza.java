package pos.factoryandtemplate;

public class RoastedChickenPizza extends PizzaTemplate {
	 public RoastedChickenPizza()
	 {
		 this.name="Roasted Chicken";
	 }
	
	
   @Override
   public void prepare() {
         System.out.println("Preparing dough !!");

   }

   @Override
   public void bake() {
         System.out.println("Baking Roasted Chicken Pizza !!");

   }

   @Override
   public void cut() {
         System.out.println("Cutting Roasted Chicken Pizza !!");

   }

   @Override
   public void box() {
         System.out.println("Packing Roasted Chicken Pizza !!");

   }	

   public int getCost() {  return 11; }

}
