package dp.proxy;

// on system A
public class RealImage implements Image
{
	private String filename;

	public RealImage(String filename) 
	{ 
		this.filename = filename;
		loadImageFromDisk();
	}
	
	@Override
	public void displayImage()
	{
		System.out.println("Displaying " + filename); 
	}
 
    private void loadImageFromDisk() 
    {
        System.out.println("Loading   " + filename);
    }
}
