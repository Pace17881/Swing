package kapitel14swingkomponenten;

import java.awt.*;

import javax.swing.*;

public class FrameMitButtons extends JFrame
{
	Container c;
	JButton b[] = new JButton[4];
	
	public FrameMitButtons()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		for (int i = 0; i < 4; i++)
		{
			b[i] = new JButton("Taste " + (i+1));
			b[i].setFont(new Font("SansSerif", Font.ITALIC, 24));
			
		}
		
		for (JButton be : b)
			c.add(be);
	}

	public static void main(String[] args)
	{
		FrameMitButtons fenster = new FrameMitButtons();
		fenster.setTitle("Frame mit Buttons");
		fenster.setSize(250,130);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
