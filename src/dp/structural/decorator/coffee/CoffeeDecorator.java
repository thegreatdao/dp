package dp.structural.decorator.coffee;

//abstract decorator class - note that it implements coffee interface
public abstract class CoffeeDecorator implements Coffee
{

	protected Coffee decoratedCoffee;
	protected String ingredientSeparator;

	public CoffeeDecorator(Coffee decoratedCoffee)
	{
		this.decoratedCoffee = decoratedCoffee;
		ingredientSeparator = ", ";
	}

	public double getCost() // note it implements the getCost function defined in interface Coffee
	{
		return decoratedCoffee.getCost();
	}

	public String getIngredient()
	{
		return decoratedCoffee.getIngredient();
	}
}
