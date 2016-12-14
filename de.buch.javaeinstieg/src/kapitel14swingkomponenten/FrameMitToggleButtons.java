package kapitel14swingkomponenten;

import java.awt.*;

import javax.swing.*;

public class FrameMitToggleButtons extends JFrame
{
	Container c;
	JToggleButton b[] = new JToggleButton[4];
	
	public FrameMitToggleButtons()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		for (int i = 0; i < 4; i++)
		{
			b[i] = new JToggleButton("Schalter " + (i+1));
			b[i].setFont(new Font("SansSerif", Font.ITALIC, 24));
			
		}
		
		b[0].setSelected(true);
		b[2].setSelected(true);
		
		for (JToggleButton be : b)
			c.add(be);
	}

	public static void main(String[] args)
	{
		FrameMitToggleButtons fenster = new FrameMitToggleButtons();
		fenster.setTitle("Frame mit Buttons");
		fenster.setSize(330,130);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
