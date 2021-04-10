import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener,ActionListener
{
	List l;
	Choice c;
	TextArea ta;
	
	MyFrame()
	{
		l = new List(4,true);
		c = new Choice();
		ta = new TextArea(20,30);
		
		l.add("Monday");
		l.add("Tuesday");
		l.add("Wednesday");
		l.add("Thrusday");
		l.add("Friday");
		l.add("Saturday");
		l.add("Sunday");
		
		c.add("January");
		c.add("February");
		c.add("March");
		c.add("April");
		c.add("May");
		c.add("June");
		c.add("July");
		c.add("August");
		c.add("September");
		c.add("October");
		c.add("November");
		c.add("December");
		
		l.addItemListener(this);
		c.addItemListener(this);
		
		l.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(l);
		add(c);
		add(ta);
	}
		
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==l)
			ta.setText(l.getSelectedItem());
		else
			ta.setText(c.getSelectedItem());
	}
	public void actionPerformed(ActionEvent ae)
	{
		String list[] = l.getSelectedItems();
		
		String txt = "";
		
		for(String x:list)
			txt += x+"\n";
		
		ta.setText(txt);
	}
}

public class ListBoxDemo
{
	public static void main(String args[])
	{
		MyFrame f = new MyFrame();
		f.setSize(500,500);
		f.setVisible(true);
	}
}