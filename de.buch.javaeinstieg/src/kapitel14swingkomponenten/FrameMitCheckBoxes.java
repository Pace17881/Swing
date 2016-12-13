package javaeinstieg;

import java.awt.*;

import javax.swing.*;

public class FrameMitCheckBoxes extends JFrame
{
	Container c;
	JCheckBox cbs[] = new JCheckBox[4];
	
	public FrameMitCheckBoxes()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		for (int i = 0; i < 4; i++)
			cbs[i] = new JCheckBox("Box " + (i+1));
		
		cbs[0].setSelected(true);
		cbs[2].setSelected(true);
		
		for (JToggleButton cb : cbs)
			c.add(cb);
	}

	public static void main(String[] args)
	{
		FrameMitCheckBoxes fenster = new FrameMitCheckBoxes();
		fenster.setTitle("Frame mit CheckBoxes");
		fenster.setSize(280,100);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
