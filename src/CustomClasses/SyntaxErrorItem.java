package CustomClasses;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.antlr.v4.runtime.RecognitionException;

public class SyntaxErrorItem {
	
	private int line;
	private Object offendingSymbol;
	private int column;
	private String msg;
	private RecognitionException oops;

	public SyntaxErrorItem(int line, int column, String msg, Object symbol,
			RecognitionException oops) {
		this.line = line;
		this.column = column;
		this.msg = msg;
		this.offendingSymbol = symbol;
		this.oops = oops;
	}

	@Override
	public String toString() {
		if (oops == null)
			return String.format("[%d:%d] %s", line, column, msg);
		else {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			oops.printStackTrace(pw);
			pw.close();
			return String.format("[%d:%d] %s\n%s", line, column, msg,
					sw.toString());
		}
	}
}
