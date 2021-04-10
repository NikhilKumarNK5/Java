import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MyFrame extends Frame implements KeyListener
{
	Label l1,l2,l3,l4;
	
	MyFrame()
	{
		super("KeyEvent Demo");
		
		l1 = new Label("");
		l2 = new Label("");
		l3 = new Label("");
		l4 = new Label("");
		
		setLayout(null);
		
		l1.setBounds(30,30,100,20);
		l2.setBounds(30,50,100,20);
		l3.setBounds(30,80,100,20);
		l4.setBounds(30,110,200,20);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		addKeyListener(this);
		
	}
	
	public void keyPressed(KeyEvent ke)
	{
		l1.setText("Key Pressed");
		l2.setText("");
	}
	public void keyReleased(KeyEvent ke)
	{
		l2.setText("Key Released");
		l1.setText("");
		l3.setText("");
		l4.setText("");
	}
	public void keyTyped(KeyEvent ke)
	{
		l3.setText("Key Typed");
		l4.setText(new Date(ke.getWhen())+"");
	}
}

public class KeyEventDemo
{
	public static void main(String args[])
	{
		MyFrame f = new MyFrame();
		f.setSize(500,500);
		f.setVisible(true);
	}
}