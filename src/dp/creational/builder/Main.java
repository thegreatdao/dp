package dp.creational.builder;
/*
 * http://sourcemaking.com/design_patterns/builder
 * 
Intent
    * Separate the construction of a complex object from its representation so that the 
    * same construction process can create different representations.
    * Parse a complex representation, create one of several targets.
Problem
	* An application needs to create the elements of a complex aggregate. The specification 
	* for the aggregate exists on secondary storage and one of many representations needs to 
	* be built in primary storage.
 */
public class Main
{
	public static void main(String... args)
	{
		Waiter waiter = new Waiter();
		PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();

		waiter.setPizzaBuilder(hawaiian_pizzabuilder);
		waiter.constructPizza();

		waiter.getPizza();

	}
}
