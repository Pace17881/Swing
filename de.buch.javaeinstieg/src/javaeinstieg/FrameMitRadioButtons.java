package javaeinstieg;

import java.awt.*;

import javax.swing.*;

public class FrameMitRadioButtons extends JFrame
{
	Container c;
	JRadioButton rb[] = new JRadioButton[4];
	
	public FrameMitRadioButtons()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup bg = new ButtonGroup();
		
		
		for (int i = 0; i < 4; i++)
		{
			rb[i] = new JRadioButton("Box " + (i+1));
			bg.add(rb[i]);
			c.add(rb[i]);
		}

	}

	public static void main(String[] args)
	{
		FrameMitRadioButtons fenster = new FrameMitRadioButtons();
		fenster.setTitle("Frame mit CheckBoxes");
		fenster.setSize(280,100);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
