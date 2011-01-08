package dp.structural.decorator.coffee;

public class Main
{
    public static void main(String... args)
    {
        Coffee sampleCoffee = new SimpleCoffee();
        System.out.println("Cost: " + sampleCoffee.getCost() + " Ingredient: " + sampleCoffee.getIngredient());
 
        sampleCoffee = new Milk(sampleCoffee);
        System.out.println("Cost: " + sampleCoffee.getCost() + " Ingredient: " + sampleCoffee.getIngredient());
 
        sampleCoffee = new Sprinkles(sampleCoffee);
        System.out.println("Cost: " + sampleCoffee.getCost() + " Ingredient: " + sampleCoffee.getIngredient());
 
        sampleCoffee = new Whip(sampleCoffee);
        System.out.println("Cost: " + sampleCoffee.getCost() + " Ingredient: " + sampleCoffee.getIngredient());
    }
}

