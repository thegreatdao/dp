package dp.structural.decorator.coffee;

//Decorator Milk that mixes milk with coffee
//note it extends CoffeeDecorator
public class Milk extends CoffeeDecorator
{
  double cost;
  String ingredient;

  public Milk(Coffee decoratedCoffee)
  {
      super(decoratedCoffee);
      cost = 0.5;
      ingredient = "Milk";
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

