package pos.builder;

import pos.model.PizzaModel;

public interface Builder {
	public PizzaBuilder withSize(Size size);
	public PizzaBuilder withCrust(Crust crust);
	public PizzaBuilder withCheese(Cheese cheese);
	public PizzaBuilder withSauce(Sauce sauce);
	public PizzaModel build();
}
