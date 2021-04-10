import java.awt.*;

class MyFrame extends Frame   //is a frame 
{
	Label l;
	TextField tf;
	Button b;
	
	public MyFrame()
	{
		super("My App"); //calling frames constructor to set the Title of the page
		
		setLayout(new FlowLayout());
		
		l = new Label("Name");
		tf = new TextField(20);
		b = new Button("OK");
		
		add(l);
		add(tf);
		add(b);
	}
}
public class FirstApp2
{
	public static void main(String args[])
	{
		MyFrame f = new MyFrame();
		f.setSize(500,500);
		f.setVisible(true);
	}
}