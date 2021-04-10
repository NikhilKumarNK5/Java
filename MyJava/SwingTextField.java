import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import javax.swing.text.*;

class MyFrame extends JFrame
{
	
	
	MyFrame()
	{
		super("Swing Components");
		
		JTextField tf1 = new JTextField(15);
		
		DateFormat df = new SimpleDateFormat("dd/MMMM/yyyy"); //two MM - month number / four MMMM- Name of Month
		JFormattedTextField tf2 = new JFormattedTextField(df);//formatted for number,date, currency, percentage
		tf2.setColumns(15);
		tf2.setValue(new Date());  // to give today's date create object of date class
		//tf.setValue(0);  // value is set so it have some date for date format
		
		//NumberFormat nf = NumberFormat.getInstance(); // we can even set currency instance for NumberFormat 
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		//for currency also we need to set values then only it will accept values in that format
		NumberFormatter nft = new NumberFormatter(nf);
		nft.setAllowsInvalid(false); //Don't allow invalid letters from the keyboard - Only accept numbers and not text or any special characters 
		nft.setMaximum(10000); // It won't allow values greater than 10000
		JFormattedTextField tf3 = new JFormattedTextField(nft);
		tf3.setColumns(15);
		tf3.setValue(0);
		
		JTextArea ta = new JTextArea(30,30); 
		 
		setLayout(new FlowLayout());
		
		add(tf1);
		add(tf2);
		add(tf3);
		
	}
	
}

public class SwingTextField
{
	public static void main(String args[])
	{
		MyFrame f = new MyFrame();
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}