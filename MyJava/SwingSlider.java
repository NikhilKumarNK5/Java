import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

class MyFrame extends JFrame implements ChangeListener
{
	JSlider sl;
	JPanel p1,p2;
	JProgressBar pb;
	
	int w = 50;
	
	MyFrame()
	{
		super("Slider And Progress Demo");
		
		sl = new JSlider(0,100,50); //min,max,initial (orientation if not giiven is by default horizontal)
		sl.setMajorTickSpacing(10);
		sl.setMinorTickSpacing(1);
		sl.setPaintTicks(true); //if we do not do this there won't be markings visible
		sl.setPaintLabels(true);
		
		pb = new JProgressBar(); //by default orientation is horizontal
		pb.setString("50%");
		pb.setStringPainted(true);
		//pb.setIndeterminate(true);
		
		p1 = new JPanel(){
			public void paintComponent(Graphics g)
			{
				g.drawOval(200,200,w,w);
				
			}
		};
		
		p2 = new JPanel();
		p2.add(pb);
		
		add(sl,BorderLayout.NORTH);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		
		sl.addChangeListener(this);
		
	}
	
	public void stateChanged(ChangeEvent e)
	{
		w = sl.getValue();
		p1.repaint();
		pb.setString(w+"%");
		pb.setStringPainted(true);
		pb.setValue(w);
		
	}
}

public class SwingSlider 
{
    public static void main(String[] args) 
    {
       MyFrame f=new MyFrame();
       f.setSize(500,500);
       f.setVisible(true);
       
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}

