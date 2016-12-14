package kapitel14swingkomponenten;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class VierButtonFrame2 extends JFrame
{
	Container c;
	JLabel beschriftung;
	JButton btn;
	Color co;

	public VierButtonFrame2(int i)
	{
		c = getContentPane();
		if (i == 1)
			c.setLayout(new FlowLayout());
		else if (i == 2)
			c.setLayout(new BorderLayout());
		else if (i == 3)
			c.setLayout(new GridLayout());
		else
			c.setLayout(new GridLayout(0, 1));

		Random r = new Random();
		char ch = 'A';
		btn = new JButton(String.format("%s",ch));
		co = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
		btn.setBackground(co);
		btn.setToolTipText("R: " + co.getRed() + " B: " + co.getBlue() + " G: " + co.getGreen());
		c.add(btn);
		ch++;
		
		btn = new JButton(String.format("%s",ch));
		co = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
		btn.setBackground(co);
		btn.setToolTipText("R: " + co.getRed() + " B: " + co.getBlue() + " G: " + co.getGreen());
		c.add(btn);
		ch++;
		
		btn = new JButton(String.format("%s",ch));
		co = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
		btn.setBackground(co);
		btn.setToolTipText("R: " + co.getRed() + " B: " + co.getBlue() + " G: " + co.getGreen());
		c.add(btn);
		ch++;
		
		btn = new JButton(String.format("%s",ch));
		co = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
		btn.setBackground(co);
		btn.setToolTipText("R: " + co.getRed() + " B: " + co.getBlue() + " G: " + co.getGreen());
		c.add(btn);
		ch++;
		
		
		
	}

	public static void main(String[] args)
	{
		VierButtonFrame2[] fenster = new VierButtonFrame2[4];
		for (int i = 0; i < 4; i++)
		{
			fenster[i] = new VierButtonFrame2(i + 1);
			fenster[i].setTitle("Fenster " + (i + 1));
			fenster[i].setSize(200, 200);
			fenster[i].setLocation(i * 200, 0);
			fenster[i].setVisible(true);
			fenster[i].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

}
