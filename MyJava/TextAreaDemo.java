import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
	TextArea ta;
	TextField tf;
	Label l;
	Button b;
	
	public MyFrame()
	{
		super("Text Field Demo");
		
		l = new Label("No Text Entered");
		ta = new TextArea(10,30);
		tf = new TextField(20);
		b = new Button("Click");
		
		ta.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(ta);
		add(l);
		add(tf);
		add(b);
		
	}
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		//l.setText(ta.getText());
		//ta.append(tf.getText());
		ta.insert(tf.getText(),ta.getCaratPosition());
	}
}

public class TextAreaDemo
{
	public static void main(String args[])
	{
		MyFrame f = new MyFrame();
		f.setSize(500,500);
		f.setVisible(true);
	}
}