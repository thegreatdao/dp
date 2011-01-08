package dp.structural.adapter.after;

import dp.structural.adapter.LegacyRectangle;

//adaptor by delegate
public class Rectangle implements Shape
{
	private LegacyRectangle legacyRectangle = new LegacyRectangle();
	
	@Override
	public void draw(int x1, int y1, int x2, int y2)
	{
		legacyRectangle.draw(x1, y1, x2, y2);
	}

}
