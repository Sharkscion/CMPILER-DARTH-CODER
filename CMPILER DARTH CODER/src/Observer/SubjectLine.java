package Observer;

public interface SubjectLine {

	public void registerObserver(Observer o);
	public void unRegisterObserver(Observer o);
	public void notifyObserver(String log);
}
