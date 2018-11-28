package pos.factoryandtemplate;

public class GardenFreshPizza extends PizzaTemplate {
    public GardenFreshPizza()
    {
    	this.name="Garden Fresh";
    }
	@Override
  public void prepare() {
        System.out.println("Preparing dough !!");
       
  }

  @Override
  public void bake() {
        System.out.println("Baking Garden Fresh Pizza !!");
       
  }

  @Override
  public void cut() {
        System.out.println("Cutting Garden Fresh Pizza !!");
       
  }

  @Override
  public void box() {
        System.out.println("Packing Garden Fresh Pizza !!");
  }
  public int getCost() {  return 10; }

}
