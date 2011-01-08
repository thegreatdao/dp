package dp.structural.decorator.coffee;

//Decorator Whip that mixes whip with coffee note it extends CoffeeDecorator
public class Whip extends CoffeeDecorator
{

	double cost;
	String ingredient;

	public Whip(Coffee decoratedCoffee)
	{
		super(decoratedCoffee);
		cost = 0.7;
		ingredient = "Whip";
	}

	@Override
	public double getCost()
	{
		return super.getCost() + cost;
	}

	@Override
	public String getIngredient()
	{
		return super.getIngredient() + ingredientSeparator + ingredient;
	}
}
