import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class DialogH
{
    public static void main(String[] args) 
	{
        MessageBox mb = new MessageBox("Do you accept this messagebox?");
        mb.createView();
        System.out.println("Button Clicked: " + mb.getButtonClicked());
    }
}

class MessageBox extends JDialog implements ActionListener 
{
    String message, buttonClicked;
    JButton ok, cl;

    MessageBox(String message) 
	{
        this.message = message;
    }

    void createView() 
	{
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JDialog dialog = new JDialog(frame, "DialogBox", true);

        JPanel mainGui = new JPanel(new BorderLayout());
        mainGui.setBorder(new EmptyBorder(20, 20, 20, 20));
        mainGui.add(new JLabel(message), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        mainGui.add(buttonPanel, BorderLayout.SOUTH);

        ok = new JButton("OK");
        ok.addActionListener(e -> {
            dialog.setVisible(false);
			buttonClicked = "OK";
            JOptionPane.showMessageDialog(null, "OK button Clicked", "OK", JOptionPane.INFORMATION_MESSAGE);
            
        });

        cl = new JButton("CANCEL");
        cl.addActionListener(e -> {
            dialog.setVisible(false);
            buttonClicked = "CANCEL";
        });

        buttonPanel.add(ok);
        buttonPanel.add(cl);

        frame.setVisible(true);

        dialog.setContentPane(mainGui);
        dialog.pack();
        dialog.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) 
	{
		
    }

    public String getButtonClicked() 
	{
        return buttonClicked;
    }
}