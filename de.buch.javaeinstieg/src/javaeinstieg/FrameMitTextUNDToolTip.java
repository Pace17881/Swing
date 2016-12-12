package javaeinstieg;

import java.awt.*;

import javax.swing.*;

public class FrameMitTextUNDToolTip extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	Container c;
	JLabel beschriftung;
	
	public FrameMitTextUNDToolTip ()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		beschriftung = new JLabel("Label-Text im Frame");
		c.add(beschriftung);
		beschriftung.setToolTipText("Des isch nur en Tescht");
	}

	public static void main(String[] args)
	{
		FrameMitTextUNDToolTip fenster = new FrameMitTextUNDToolTip();
		
		fenster.setTitle("Frame ohne Inhalt");
		fenster.setSize(300, 150);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
