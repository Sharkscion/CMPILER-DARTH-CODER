package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.TitledBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

import net.miginfocom.swing.MigLayout;
import Controller.Controller;
import Observer.Observer;
import Observer.ObserverLine;
import Observer.SubjectLine;

public class MainFrame extends JFrame implements Observer, ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelCodeArea, panelConsole, panelMenu, panelConsoleArea, panelAreaLof;
	private JSplitPane panelContent;
	private JScrollPane spCodeArea, spConsole, spLog, spSymbol, spCallStack;
	private JTextArea txtAreaCodeArea;
	private JButton btnRun, btnDebug;
	private JSplitPane panelConsoleContent;
	private JPanel panelOutput;
	private JPanel panelLog;
	private Controller con;
	private JSplitPane panelStack;
	private JPanel panelRight;
	private JPanel panelLeft;
	private JPanel panelSymbol;
	private JPanel panelCallStack;
	private JLabel lblCall;
	private JLabel lblSymbol;
	
	public MainFrame(Controller con){
		
		this.con = con;
		this.con.registerObserver(this);
		panelContent = new JSplitPane();
		getContentPane().add(panelContent, BorderLayout.CENTER);
		
/************
 * GUI CODE AREA START
 * ************/
		
		panelCodeArea = new JPanel();
		panelCodeArea.setBorder(new TitledBorder(null, "Code Area", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelCodeArea.setPreferredSize(new Dimension(450, 10));
		panelContent.setLeftComponent(panelCodeArea);
		panelCodeArea.setLayout(new GridLayout(1, 0, 0, 0));
		
		txtAreaCodeArea = new JTextArea();
		spCodeArea = new JScrollPane(txtAreaCodeArea);
		panelCodeArea.add(spCodeArea);
		
		TextLineNumber tln = new TextLineNumber(txtAreaCodeArea);
		spCodeArea.setRowHeaderView(tln);
		
/************
 * GUI CODE AREA END
 * ************/
/************
 * GUI CONSOLE START
 * ************/
		
		panelConsole = new JPanel();
		panelConsole.setPreferredSize(new Dimension(400, 10));
		panelConsole.setBorder(null);
		panelContent.setRightComponent(panelConsole);
		panelConsole.setLayout(new GridLayout(1, 0, 0, 0));
		
		panelConsoleContent = new JSplitPane();
		panelConsoleContent.setPreferredSize(new Dimension(400, 0));
		panelConsoleContent.setOrientation(JSplitPane.VERTICAL_SPLIT);
		panelConsole.add(panelConsoleContent);
		
/************
 * GUI CONSOLE OUTPUT START
 * ************/
		panelOutput = new JPanel();
		panelOutput.setBackground(Color.WHITE);
		panelOutput.setBorder(new TitledBorder(null, "Darth Console", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelOutput.setPreferredSize(new Dimension(10, 380));
		panelOutput.setLayout(new MigLayout("", "[]", "[]"));

		spConsole = new JScrollPane(panelOutput);
		panelConsoleContent.setLeftComponent(spConsole);
		
/************
 * GUI CONSOLE ERROR START
 * ************/
		
		panelLog = new JPanel();
		panelLog.setBackground(Color.WHITE);
		panelLog.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Darth Log", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelLog.setLayout(new MigLayout("", "[]", "[]"));
		
		spLog = new JScrollPane(panelLog);
		panelConsoleContent.setRightComponent(spLog);
		
/************
 * GUI CONSOLE ERROR END
 * ************/	
		panelMenu = new JPanel();
		getContentPane().add(panelMenu, BorderLayout.NORTH);
		
		btnRun = new JButton("Run");
		btnRun.addActionListener(this);
		panelMenu.add(btnRun);
		
		btnDebug = new JButton("Debug");
		btnDebug.addActionListener(this);
		panelMenu.add(btnDebug);
		
		panelStack = new JSplitPane();
		panelStack.setPreferredSize(new Dimension(350, 25));
		getContentPane().add(panelStack, BorderLayout.EAST);
		
		panelRight = new JPanel();
		panelStack.setRightComponent(panelRight);
		panelRight.setLayout(new BorderLayout(0, 0));
		
		panelCallStack = new JPanel();
		panelCallStack.setLayout(new MigLayout("", "[]", "[]"));
		panelCallStack.setBackground(Color.WHITE);
		spCallStack = new JScrollPane(panelCallStack);
		panelRight.add(spCallStack);
		
		lblCall = new JLabel("CALL STACKS");
		panelRight.add(lblCall, BorderLayout.NORTH);
		
		panelLeft = new JPanel();
		panelLeft.setPreferredSize(new Dimension(170, 10));
		panelStack.setLeftComponent(panelLeft);
		panelLeft.setLayout(new BorderLayout(0, 0));
		
		panelSymbol = new JPanel();
		panelSymbol.setLayout(new MigLayout("", "[grow, fill]", ""));
		panelSymbol.setBackground(Color.WHITE);
		spSymbol = new JScrollPane(panelSymbol);
		panelLeft.add(spSymbol);
		
		lblSymbol = new JLabel("SYMBOL TABLE");
		panelLeft.add(lblSymbol, BorderLayout.NORTH);
		

		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
			e.printStackTrace();
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		
		reset();
		
		setBackground(Color.gray);
		setSize(1300, 650);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	
	}

	@Override
	public void updateConsole(String log) {	
		JLabel logLabel = new JLabel();
		logLabel.setText(log);
		
		panelOutput.add(logLabel, "newline");
		panelOutput.revalidate();
	}

	@Override
	public void updateLogArea(int row, int col,String log) {
		JLabel logLabel = new JLabel();
		logLabel.setText("["+row+":"+col+"] "+log);
		
		panelLog.add(logLabel, "newline");
		panelLog.revalidate();	
		
		int lineCount = txtAreaCodeArea.getLineCount();
		int start = 0;
		int end = 0;
	
		try {
			Highlighter highlighter = txtAreaCodeArea.getHighlighter();
			HighlightPainter painter =  new DefaultHighlighter.DefaultHighlightPainter(Color.pink);
			//System.out.println("GET CARET POSITION: "+ txtAreaCodeArea.getCaretPosition());

            start = txtAreaCodeArea.getLineStartOffset(row-1);
            end   = txtAreaCodeArea.getLineEndOffset(row-1);
			highlighter.addHighlight(start, end, painter );
		} catch (BadLocationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
	}

	public void reset(){
		panelSymbol.removeAll();
		panelCallStack.removeAll();
		panelLog.removeAll();
		panelOutput.removeAll();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnDebug){
			this.con.executeCode(txtAreaCodeArea.getText().toString());
		}else if(e.getSource() == btnRun){
			reset();
			this.con.executeCode(txtAreaCodeArea.getText().toString());
		}
	}

	@Override
	public void updateSymbolTable(String varname,String val, int position, boolean isLineByLine) {
		// TODO Auto-generated method stub
		JLabel logLabel = new JLabel();
		logLabel.setText("["+position+"]  "+varname+" : "+val);
		
		panelSymbol.add(logLabel, "span, wrap");
		panelSymbol.revalidate();	
		
	}


}
