package kapitel15ereignisverarbeitung;

import java.awt.*;
import javax.swing.*;

public class Farbwechsel4 extends JFrame
{
	Container c;
	JButton button;

	public Farbwechsel4()
	{
		c = getContentPane();
		button = new JButton("Hintergrundfarbe wechseln");
		c.add(button, BorderLayout.NORTH);
		button.addActionListener(new ButtonListener(c));
	}

	public static void main(String[] args)
	{
		Farbwechsel4 fenster = new Farbwechsel4();
		fenster.setTitle("Farbwechsel");
		fenster.setSize(200, 100);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
