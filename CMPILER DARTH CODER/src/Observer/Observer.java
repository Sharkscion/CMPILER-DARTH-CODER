package Observer;

import java.util.ArrayList;

public interface Observer {
	public void updateConsole(String log);
	public void updateLogArea(int line, int col, String log);
	public void updateSymbolTable(String varname,String val, int position, boolean isLineByLine);
}
