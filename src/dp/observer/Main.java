package dp.observer;

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
