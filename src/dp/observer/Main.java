package dp.observer;
//http://java-x.blogspot.com/2007/01/implementing-observer-pattern-in-java.html
public class Main
{
	public static void main(String... args)
	{
		Subject subject = new ConcreteSubject();
		Observer observer = new ConcretObserver();
		subject.addObserver(observer);
		observer = new ConcretObserver();
		subject.addObserver(observer);
		subject.setState("Main was called");
	}
}
