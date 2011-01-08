package dp.decorator;

//the first concrete decorator which adds vertical scrollbar functionality
public class VerticalScrollBarDecorator extends WindowDecorator
{

	public VerticalScrollBarDecorator(Window decoratedWindow)
	{
		super(decoratedWindow);
	}

	public void draw()
	{
		drawVerticalScrollBar();
		super.draw();
	}

	private void drawVerticalScrollBar()
	{
		// draw the vertical scrollbar
	}

	@Override
	public String getDescription()
	{
		return decoratedWindow.getDescription() + ", including vertical scrollbars";
	}

}
