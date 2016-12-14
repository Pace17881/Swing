package kapitel14swingkomponenten;

import java.awt.*;

import javax.swing.*;

public class FrameMitText extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	Container c;
	JLabel beschriftung;
	
	public FrameMitText ()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		beschriftung = new JLabel("Label-Text im Frame");
		c.add(beschriftung);
	}

	public static void main(String[] args)
	{
		FrameMitText fenster = new FrameMitText();
		
		fenster.setTitle("Frame ohne Inhalt");
		fenster.setSize(300, 150);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
