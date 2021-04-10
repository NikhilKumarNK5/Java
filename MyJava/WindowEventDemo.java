import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MyFrame extends Frame implements WindowListener
{
	Label l;
	
	MyFrame()
	{
		super("WindowEvent Demo");
		
		l = new Label("             ");
		
		setLayout(new FlowLayout());
		add(l);
		
		addWindowListener(this);
	}
	
	public void windowOpened(WindowEvent we)
	{
		l.setText("Window Opened");
	}
	public void windowClosing(WindowEvent e)
	{
		l.setText("Window Closing");
		System.exit(0);;
	}
	public void windowClosed(WindowEvent e)
	{
		l.setText("Window Closed");
	}
	public void windowIconified(WindowEvent e)
	{
		l.setText("Window Iconified");
	}
	public void windowDeiconified(WindowEvent e)
	{
		l.setText("Window Deiconified");
	}
	public void windowActivated(WindowEvent e)
	{
		l.setText("Window Activated");
	}
	public void windowDeactivated(WindowEvent e)
	{
		l.setText("Window Deactivated");
	}
}

public class WindowEventDemo
{
	public static void main(String args[])
	{
		MyFrame f = new MyFrame();
		f.setSize(500,500);
		f.setVisible(true);
	}
}