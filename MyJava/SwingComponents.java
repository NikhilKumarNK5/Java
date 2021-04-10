import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener
{
	JLabel l;
	JButton b;
	int count = 0;
	
	MyFrame()
	{
		super("Swing Components");
		
		setLayout(new FlowLayout());
		
		l = new JLabel("Clicked "+count+" Times");
		b = new JButton("Click");
		
		add(l);
		add(b);
	
		b.addActionListener(this);
		
		getRootPane().setDefaultButton(b);
		// with the help of this the button will work if we hit enter earlier it worked with mouse click or spacebar(here spacebar,enter,mouseclick- all 3 works
		b.setIcon(new ImageIcon("C:/Users/HP/Downloads/Click.jpeg"));// we can image as a button here - this can be done with any component
		l.setToolTipText("Counter"); // on clicking on the label inside frame it will display counter
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		count++;
		l.setText("Clicked "+count+" Times");
	}
}

public class SwingComponents
{
	public static void main(String args[])
	{
		MyFrame f = new MyFrame();
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}