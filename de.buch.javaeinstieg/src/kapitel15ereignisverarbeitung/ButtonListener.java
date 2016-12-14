package kapitel15ereignisverarbeitung;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener
{
	Container c;
	
	public ButtonListener(Container c)
	{
		this.c = c;
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		float zufall = (float) Math.random();
		Color grauton = new Color(zufall, zufall, zufall);
		c.setBackground(grauton);
	}

}
