package kapitel15ereignisverarbeitung;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class CloseToggleButtons extends JFrame
{
	Container c;
	JLabel l;
	JToggleButton b1, b2;
	
	public CloseToggleButtons()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		l = new JLabel("Zum Schliessen des Fensters beide Schalter aktivieren!");
		
		b1 = new JToggleButton("Schalter1");
		b2 = new JToggleButton("Schalter2");
		
		c.add(l);
		c.add(b1);
		c.add(b2);
		
		addWindowListener(new ClosingListener());
	}

	//Innere Listener-Klasse
	public class ClosingListener extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			if (b1.isSelected() && b2.isSelected())
			{
				e.getWindow().dispose();
				System.exit(0);
			}
			else
				JOptionPane.showMessageDialog(c, "Vor dem Schliessen erst beide Schalter aktivieren!");
			
		}
	}
	public static void main(String[] args)
	{
		CloseToggleButtons fenster = new CloseToggleButtons();
		fenster.setTitle("CloseToggleButtons");
		fenster.setSize(400, 100);
		fenster.setVisible(true);
		
		fenster.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

	}

}
