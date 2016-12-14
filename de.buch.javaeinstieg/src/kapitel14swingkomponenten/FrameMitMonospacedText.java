package kapitel14swingkomponenten;

import java.awt.*;

import javax.swing.*;

public class FrameMitMonospacedText extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	Container c;
	JLabel beschriftung;
	
	public FrameMitMonospacedText ()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		beschriftung = new JLabel("Monospaced Text");
		beschriftung.setFont(new Font("Monospaced", Font.BOLD+Font.ITALIC,30));
		c.add(beschriftung);
		
	}

	public static void main(String[] args)
	{
		FrameMitMonospacedText fenster = new FrameMitMonospacedText();
		
		fenster.setTitle("Frame ohne Inhalt");
		fenster.setSize(300, 150);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
