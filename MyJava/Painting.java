import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
{
	int x=0,y=0; //coordinates for where the mouse is clicked / moved  
	
	
	MyFrame()
	{
		super("Paining");
		
		addMouseMotionListener(new MouseAdapter(){
			public void mouseMoved(MouseEvent me)
			{
				x = me.getX();
				y = me.getY();
				repaint();//we cannot call paint method directly we need to call repaint() it belongs to Frame - this method will call the paint method
				//if I call the paint method I need to put the Graphics parameter so instead I can call the repaint method
			}
		});
		addWindowListener(new MyWindowAdapter());
	}
	
	public void paint(Graphics g)  // every container has a method called paint and frame is container , paint method is overrided for painting
	{
		g.setColor(Color.RED);
		//g.drawOval(x,y,50,50); //it will draw an oval 
		//g.fillOval(x,y,50,50); //it will fill the oval with given color i.e red in this case
		g.setFont(new Font("Times New Roman",Font.BOLD,30)); //name of font , font style , size of font
		g.drawString("Hello",x,y);//we can even set String with help of this
		
		// Graphics has all the methods for drawing
	}
}

class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}

public class Painting
{
	public static void main(String args[])
	{
		MyFrame f = new MyFrame();
		f.setSize(500,500);
		f.setVisible(true);
	}
}