import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class MyFrame extends JFrame implements ListSelectionListener
{
    JSplitPane sp;
	JList list;
	JLabel lbl;
	
    MyFrame() 
    {
        super("Split Demo");
        
        String cols[] = {"RED","GREEN","BLUE","YELLOW","MAGENTA","ORANGE","BLACK"};
		
		list = new JList(cols);
		list.setSelectedIndex(0);
		list.addListSelectionListener(this);
		JScrollPane p1 = new JScrollPane(list);
		
		lbl = new JLabel("  ");
		lbl.setOpaque(true);
		lbl.setBackground(Color.RED);
		JScrollPane p2 = new JScrollPane(lbl);
		
		
		sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
		sp.setDividerLocation(200);
		add(sp);
		 
		/*
		JTabbedPane tp = new JTabbedPane();
		tp.addTab("Colors" , p1);
		tp.addTab("Label" , p2);
		add(tp);
		*/
    }
	
	public void valueChanged(ListSelectionEvent e)
	{
		String str = (String)list.getSelectedValue();
		
		switch(str)
		{
			case "RED": lbl.setBackground(Color.RED);
				break;
			case "GREEN": lbl.setBackground(Color.GREEN);
				break;
			case "BLUE": lbl.setBackground(Color.BLUE);
				break;
			case "YELLOW": lbl.setBackground(Color.YELLOW);
				break;
			case "MAGENTA": lbl.setBackground(Color.MAGENTA);
				break;
			case "ORANGE": lbl.setBackground(Color.ORANGE);
				break;
			case "BLACK": lbl.setBackground(Color.BLACK);
				break;
		}
	}
            
}

public class SwingSplit {

        public static void main(String[] args) {
         MyFrame f=new MyFrame();
       f.setSize(800,800);
       f.setVisible(true);
       
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}