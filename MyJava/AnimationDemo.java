import java.awt.*;
import java.awt.event.*;
//animation work because of MultiThreading in java
//In this example the ball will be bouncing because of a thread
class MyFrame extends Frame implements Runnable 
	//we have to make thread but this class is already extending from Frame so it cannot extend from Frame so we implement the Runnable Interface
{
    int x,y,tx,ty; //tx - transational X - moving of any object in in x-y coordinates is called translation
    
    MyFrame()
    {
		super("Animation");
		
        x=100;
        y=100;
        tx=ty=1;
        
        Thread t=new Thread(this); // running thread inside the frame
        t.start();
        
		addWindowListener(new MyWindowAdapter());
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.fillOval(x,y,50,50);
        
    }
    
    public void run()
    {
        while(true) //infinte loop to move continuously 
        {
            x+=tx;
            y+=ty;
            
            if(x<0 || x>450)
                tx=tx*-1;
            if(y<20 || y>450)
                ty=ty*-1;
            repaint();
            
            try{Thread.sleep(5);}catch(Exception e){} // if we do not make the thread sleep for a while then the circle we created will move really fast
        }
        
    }
    
}

class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}

public class AnimationDemo
{
	public static void main(String args[])
	{
		MyFrame f = new MyFrame();
		f.setSize(500,500);
		f.setVisible(true);
	}
}