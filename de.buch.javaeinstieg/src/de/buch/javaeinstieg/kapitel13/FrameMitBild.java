package de.buch.javaeinstieg.kapitel13;

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
		
		Icon bild = new ImageIcon("testbild.png");
		lab = new JLabel("Testbild", bild, JLabel.CENTER);
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
