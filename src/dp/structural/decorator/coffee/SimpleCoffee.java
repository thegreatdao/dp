package dp.structural.decorator.coffee;

//implementation of simple coffee without any extra ingredients
public class SimpleCoffee implements Coffee
{
 
    double cost;
    String ingredient;
 
    public SimpleCoffee()
    {
        cost = 1;
        ingredient = "Coffee";
    }
 
    @Override
    public double getCost()
    {
        return cost;
    }
 
    @Override
    public String getIngredient()
    {
        return ingredient;
    }
}

