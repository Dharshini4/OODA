package pos.factoryandtemplate;

public class MargheritaPizza extends PizzaTemplate {
	public MargheritaPizza()
    {
    	this.name="Margherita";
    }
	
	
  @Override
  public void prepare() {
        System.out.println("Preparing dough !!");
       
  }

  @Override
  public void bake() {
        System.out.println("Baking Margherita Pizza !!");
       
  }

  @Override
  public void cut() {
        System.out.println("Cutting Margherita Pizza !!");
       
  }

  @Override
  public void box() {
        System.out.println("Packing Margherita Pizza !!");
  }

  public int getCost() {  return 15; }

}
