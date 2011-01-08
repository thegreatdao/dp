package dp.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class ConcreteSubject implements Subject
{
	private Set<Observer> observers = new HashSet<Observer>();
	private String state;
	
	@Override
	public void addObserver(Observer oberserver)
	{
		observers.add(oberserver);
	}

	@Override
	public void removeObserver(Observer oberserver)
	{
		observers.remove(oberserver);
	}

	@Override
	public String getState()
	{
		return state;
	}

	@Override
	public void setState(String state)
	{
		this.state = state;
		notifyObservers();
	}
	
	private void notifyObservers()
	{
		for(Observer observer : observers)
		{
			observer.update(this);
		}
	}
}
