package kapitel15ereignisverarbeitung;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Farbwechsel3 extends JFrame implements ActionListener
{
	Container c;
	JButton button;

	public Farbwechsel3()
	{
		c = getContentPane();
		button = new JButton("Hintergrundfarbe wechseln");
		c.add(button, BorderLayout.NORTH);
		button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		float zufall = (float) Math.random();
		Color grauton = new Color(zufall, zufall, zufall);
		c.setBackground(grauton);
	}

	public static void main(String[] args)
	{
		Farbwechsel3 fenster = new Farbwechsel3();
		fenster.setTitle("Farbwechsel");
		fenster.setSize(200, 100);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
