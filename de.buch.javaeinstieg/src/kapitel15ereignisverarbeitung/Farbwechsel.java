package kapitel15ereignisverarbeitung;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Farbwechsel extends JFrame
{
	Container c;
	JButton button;

	public Farbwechsel()
	{
		c = getContentPane();
		button = new JButton("Hintergrundfarbe wechseln");
		c.add(button, BorderLayout.NORTH);

		ButtonListener bL = new ButtonListener();
		button.addActionListener(bL);

	}

	class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			float zufall = (float) Math.random();
			Color grauton = new Color(zufall, zufall, zufall);
			c.setBackground(grauton);
		}

	}

	public static void main(String[] args)
	{
		Farbwechsel fenster = new Farbwechsel();
		fenster.setTitle("Farbwechsel");
		fenster.setSize(200, 100);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
