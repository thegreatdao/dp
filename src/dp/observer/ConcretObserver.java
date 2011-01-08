package dp.observer;

public class ConcretObserver implements Observer
{
	
	@Override
	public void update(Subject subject)
	{
		System.out.println(subject.getState());
	}

}
