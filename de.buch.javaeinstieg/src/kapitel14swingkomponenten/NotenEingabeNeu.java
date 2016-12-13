package kapitel14swingkomponenten;

import java.awt.*;
import javax.swing.*;

public class NotenEingabeNeu extends JFrame
{
	Container c;
	JCheckBox cb;

	public NotenEingabeNeu()
	{
		c = getContentPane();
		c.setLayout(new GridLayout(6, 1));
		ButtonGroup bg = new ButtonGroup();
		cb = new JCheckBox("sehr gut");
		bg.add(cb);
		c.add(cb);
		
		cb = new JCheckBox("gut");
		bg.add(cb);
		c.add(cb);
		
		cb = new JCheckBox("befriedigend");
		bg.add(cb);
		c.add(cb);
		
		cb = new JCheckBox("ausreichend", true);
		bg.add(cb);
		c.add(cb);
		
		cb = new JCheckBox("ungenuegend");
		bg.add(cb);
		c.add(cb);
		
		c.add(new JCheckBox("Wiederholungsprüfung"));
	}
}
