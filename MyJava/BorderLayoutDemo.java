import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
{
	Button b1,b2,b3,b4,b5,b6;
	
	public MyFrame()
	{
		super("BorderLayout Demo");

		b1 = new Button("North");
		b2 = new Button("South");
		b3 = new Button("East");
		b4 = new Button("West");
		b5 = new Button("Center");
		b6 = new Button("Six");
		
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		//add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);
		//add(b6);
		
		Panel p = new Panel();
		p.setLayout(new GridLayout(3,1));
		p.add(new Button("Monday"));
		p.add(new Button("Tuesday"));
		p.add(new Button("Wednesday"));
		add(p,BorderLayout.EAST);
		
	}
}

public class BorderLayoutDemo
{
	public static void main(String args[])
	{
		MyFrame f = new MyFrame();
		f.setSize(500,500);
		f.setVisible(true);
	}
}