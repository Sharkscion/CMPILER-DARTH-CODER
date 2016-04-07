package Observer;

import java.util.ArrayList;


public interface Subject {
	public void registerObserver(Observer o);
	public void unRegisterObserver(Observer o);
	public void notifyObserverOutput(String log);
	public void notifyObserverErrorLog(int row, int col, String log);
	public void notifyObserverSymbol(String varname, String val, int position, boolean isLineByLine);
}
