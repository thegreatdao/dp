package dp.structural.decorator;

public class HorizontalScrollBarDecorator extends WindowDecorator
{

	public HorizontalScrollBarDecorator(Window decoratedWindow)
	{
		super(decoratedWindow);
	}

	@Override
	public void draw()
	{
		drawHorizontalScrollBar();
		super.draw();
	}

	private void drawHorizontalScrollBar()
	{
		// draw the horizontal scrollbar
	}

	@Override
	public String getDescription()
	{
		return decoratedWindow.getDescription() + ", including horizontal scrollbars";
	}

}
