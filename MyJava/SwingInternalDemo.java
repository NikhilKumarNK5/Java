import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MyInternalFrame extends JInternalFrame
{
	static int count = 0 ; //common for all the objects of internal frame - so static
	JTextArea ta;
	JScrollPane sp;
	
	MyInternalFrame()
	{
		super("Document "+(++count),true,true,true,true);

		ta = new JTextArea();
		sp = new JScrollPane(ta);
		add(sp);
		
		JMenuBar mb = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem m1 = new JMenuItem("Save");
		
		file.add(m1);
		mb.add(file);
		setJMenuBar(mb); 
		
		setSize(300,300);
		setLocation(50,50);
		setVisible(true);
		
	}
}

class MyFrame extends JFrame implements ActionListener
{
    JDesktopPane jp;
    
	//JDesktopPane allows us to host multiple internal things - internal frames are created under this only - JDesktopPane is Mandatory
	
    MyFrame()
    {
        super("Internal Frame Demo"); //Frame inside frame
        
        jp = new JDesktopPane();
		setContentPane(jp);
		
		JMenuBar mb = new JMenuBar();
		JMenu d = new JMenu("Document");
		JMenuItem m1 = new JMenuItem("New");
		
		d.add(m1);
		mb.add(d);
		setJMenuBar(mb);
		
		m1.addActionListener(this);
        
    }

    
    public void actionPerformed(ActionEvent e)
    {
        MyInternalFrame mi = new MyInternalFrame();
		jp.add(mi);
		
    }
    
}
public class SwingLayeredDemo  //JInternalFrame
{
    public static void main(String[] args) 
    {
       MyFrame f=new MyFrame();
       f.setSize(800,800);
       f.setVisible(true);
       
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
