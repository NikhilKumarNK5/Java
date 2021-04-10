import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
{
	Label l1,l2;
	TextField tf;
	
	public MyFrame()
	{
		super("Text Field Demo");
		
		l1 = new Label("No text is entered yet");
		l2 = new Label("Enter key is not yet hit");
		tf = new TextField(20);
		
		Handler h = new Handler();
		//tf.addTextListener(this);
		//tf.addActionListener(this);//We cannot use this here since the inner class is handling events so we need to create the object for inner class and pass it inside instead of this
		tf.addTextListener(h);
		tf.addActionListener(h);
		
		setLayout(new FlowLayout());
		
		add(l1);
		add(tf);
		add(l2);
	}
	
	class Handler implements TextListener , ActionListener
	{
		public void textValueChanged(TextEvent te)
		{
			l1.setText(tf.getText());
		}
	
	public void actionPerformed(ActionEvent ae)
		{
			l2.setText(tf.getText());
		}
	}
	
}

public class TextFieldDemo
{
	public static void main(String args[])
	{
		MyFrame f = new MyFrame();
		f.setSize(500,500);
		f.setVisible(true);
	}
}