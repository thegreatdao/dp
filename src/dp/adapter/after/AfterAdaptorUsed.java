package dp.adapter.after;
//http://www.javaworld.com/javaworld/jw-09-2003/images/jw-0926-designpatterns2.jpg
public class AfterAdaptorUsed
{
	public static void main(String... args)
	{
		Shape[] shapes = { new Line(), new Rectangle() };
		// A begin and end point from a graphical editor
		int x1 = 10, y1 = 20;
		int x2 = 30, y2 = 60;
		for (int i = 0; i < shapes.length; ++i)
		{
			shapes[i].draw(x1, y1, x2, y2);
		}
		
		Shape[] shapes2 = {new LineAdatorByInheritance(), new RectangleAdaptorByInheritance()}; 
		for (int i = 0; i < shapes.length; ++i)
		{
			shapes2[i].draw(x1, y1, x2, y2);
		}
	}
}
