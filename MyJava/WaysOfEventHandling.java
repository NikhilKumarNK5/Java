import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MyFrame extends Frame //implements ActionListener
{
	TextField tf;
	Button b;
	int count = 0;
	
	MyFrame()
	{
		super("Ways of Handling Event");
		
		tf = new TextField("0",20);
		b = new Button("Click");
		
		setLayout(new FlowLayout());
		
		add(tf);
		add(b);
		
		//b.addActionListener(this); // this means the frame class is the listener
		
		//b.addActionListener(new MyListener());//now the inner class is Listener
		
		/*
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
				{
					count++;
					tf.setText(String.valueOf(count));
				}
		}); //Anonymous class
		*/
		
		b.addActionListener((ActionEvent ae)->
		
			{
				count++;
				tf.setText(String.valueOf(count));
			}
		); //Lammbda Expression
	}
	/*
	public void actionPerformed(ActionEvent e)
	{
		count++;
		tf.setText(String.valueOf(count));
	} // Frame as Listener
	*/
	/*
	class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			count++;
			tf.setText(String.valueOf(count));
		}
	} // Inner Class
	*/
}

public class WaysOfEventHandling
{
	public static void main(String args[])
	{
		MyFrame f = new MyFrame();
		f.setSize(500,500);
		f.setVisible(true);
	}
}