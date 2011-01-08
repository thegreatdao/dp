package dp.creational.builder;

class Pizza
{
	@SuppressWarnings("unused")
	private String dough = "";
	@SuppressWarnings("unused")
	private String sauce = "";
	@SuppressWarnings("unused")
	private String topping = "";

	public void setDough(String dough)
	{
		this.dough = dough;
	}

	public void setSauce(String sauce)
	{
		this.sauce = sauce;
	}

	public void setTopping(String topping)
	{
		this.topping = topping;
	}
}
