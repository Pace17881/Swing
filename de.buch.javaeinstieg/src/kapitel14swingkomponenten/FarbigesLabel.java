package kapitel14swingkomponenten;

import java.awt.Color;

import javax.swing.JLabel;

public class FarbigesLabel extends JLabel
{

	public FarbigesLabel (String name, Color fG, Color bG)
	{
		super(name);
		setOpaque(true);
		setForeground(fG);
		setBackground(bG);
	}
}
