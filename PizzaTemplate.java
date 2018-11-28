package pos.factoryandtemplate;
/*
 * Abstract Pizza template class for defining pizza preparation steps
 */

public abstract class PizzaTemplate {
	public String name="Unknown Pizza";
	
	public abstract void prepare();
	public abstract void bake();
	public abstract void cut();
	public abstract void box();
	
	/*
	 * Template method that defines the steps to create pizza
	 */
	public final void preparePizza()
	{
		prepare();
		bake();
		cut();
		box();
	}
	  
    public String getName() 
    { 
        return name; 
    } 
  
    public abstract int getCost(); 
	
}
