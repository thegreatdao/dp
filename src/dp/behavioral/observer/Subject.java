package dp.behavioral.observer;

public interface Subject
{
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	String getState();
	void setState(String state);
}
