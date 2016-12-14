package kapitel15ereignisverarbeitung;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Farbwechsel2 extends JFrame
{
	Container c;
	JButton button;

	public Farbwechsel2()
	{
		c = getContentPane();
		button = new JButton("Hintergrundfarbe wechseln");
		c.add(button, BorderLayout.NORTH);
		
		//anonyme Klasse Listener
		ActionListener bL = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				float zufall = (float) Math.random();
				Color grauton = new Color(zufall, zufall, zufall);
				c.setBackground(grauton);
			}
		};

		button.addActionListener(bL);

	}

	public static void main(String[] args)
	{
		Farbwechsel2 fenster = new Farbwechsel2();
		fenster.setTitle("Farbwechsel");
		fenster.setSize(200, 100);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
