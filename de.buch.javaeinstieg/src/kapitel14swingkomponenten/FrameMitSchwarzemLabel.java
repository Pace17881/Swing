package kapitel14swingkomponenten;

import java.awt.*;

import javax.swing.*;

public class FrameMitSchwarzemLabel extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	Container c;
	FarbigesLabel beschriftung;
	
	public FrameMitSchwarzemLabel ()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		beschriftung = new FarbigesLabel("Label-Text im Frame", new Color(255,255,255), Color.BLACK);
		c.add(beschriftung);
		beschriftung.setToolTipText("Des isch nur en Tescht");
	}

	public static void main(String[] args)
	{
		FrameMitSchwarzemLabel fenster = new FrameMitSchwarzemLabel();
		
		fenster.setTitle("Frame ohne Inhalt");
		fenster.setSize(300, 150);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
