package pos.factoryandtemplate;

public class SicilianPizza extends PizzaTemplate {
	public SicilianPizza()
	{
		 this.name="Sicilian";
	}
	
   @Override
   public void prepare() {
         System.out.println("Preparing dough !!");

   }

   @Override
   public void bake() {
         System.out.println("Baking Sicilian Pizza !!");

   }

   @Override
   public void cut() {
         System.out.println("Cutting Sicilian Pizza !!");

   }

   @Override
   public void box() {
         System.out.println("Packing Sicilian Pizza !!");

   }	
   public int getCost() {  return 22; }

}
