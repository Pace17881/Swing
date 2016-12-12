package javaeinstieg;

import java.awt.*;

import javax.swing.*;

public class FrameMitBild extends JFrame
{
	Container c;
	JLabel lab;
	
	public FrameMitBild()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		java.net.URL url = getClass().getResource("/resources/testbild.png");
		Icon bild = new ImageIcon(url);
		lab = new JLabel("Testbild-PNG: ", bild, JLabel.CENTER);
		lab.setHorizontalTextPosition(JLabel.CENTER);
		lab.setVerticalTextPosition(JLabel.BOTTOM);
		
		c.add(lab);
	}

	public static void main(String[] args)
	{
		FrameMitBild fenster = new FrameMitBild();
		fenster.setTitle("Frame mit GridLayout");
		fenster.setSize(300,150);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
