import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MyFrame extends Frame
{
	
	MyFrame()
	{
		super("WindowAdapter Demo");
		
		addWindowListener(new MyWindowAdapter());
	}
	
	class MyWindowAdapter extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}
}

public class WindowAdapterDemo
{
	public static void main(String args[])
	{
		MyFrame f = new MyFrame();
		f.setSize(500,500);
		f.setVisible(true);
	}
}