package dp.proxy;

/*
 * Adapter provides a different interface to its subject. 
 * Proxy provides the same interface. 
 * Decorator provides an enhanced interface.
 */
public class Main
{
	public static void main(String... args)
	{
		Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");     
 
        image1.displayImage(); // loading necessary
        image2.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary

	}
}
