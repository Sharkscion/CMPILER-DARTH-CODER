package Observer;

public interface SubjectLine {

	public void registerObserver(ObserverLine o);
	public void unRegisterObserver(ObserverLine o);
	public void notifyObserver(boolean isRunByLine);
}
