package dp.structural.adapter.before;
//http://en.wikipedia.org/wiki/Adapter_pattern
import dp.structural.adapter.LegacyLine;
import dp.structural.adapter.LegacyRectangle;

public class BeforeAdaptorUsed
{
	public static void main(String... args)
	{
		Object[] shapes = { new LegacyLine(), new LegacyRectangle() };
		// A begin and end point from a graphical editor
		int x1 = 10, y1 = 20;
		int x2 = 30, y2 = 60;
		for (int i = 0; i < shapes.length; ++i)
		{
			if (shapes[i].getClass().getName().equals("LegacyLine"))
			{
				((LegacyLine) shapes[i]).draw(x1, y1, x2, y2);
			}
			else if (shapes[i].getClass().getName().equals("LegacyRectangle"))
			{
				((LegacyRectangle) shapes[i]).draw(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
			}
		}
	}
}
