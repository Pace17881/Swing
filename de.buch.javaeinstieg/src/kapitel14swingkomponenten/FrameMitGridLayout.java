package kapitel14swingkomponenten;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class FrameMitGridLayout extends JFrame
{
	Container c;
	FarbigesLabel fl[] = new FarbigesLabel[6];
	
	public FrameMitGridLayout()
	{
		c = getContentPane();
		c.setLayout(new GridLayout(2, 3, 10, 40));
		
		for (int i = 0; i < 6; i++)
		{
			int rgbFg = 255 - i * 60;
			int rgbBg = i*50;
			
			fl[i] = new FarbigesLabel("Nummer " + (i+1), new Color(rgbFg, rgbFg, rgbFg), new Color(rgbBg, rgbBg, rgbBg));
			fl[i].setFont(new Font("Serif", Font.ITALIC, 10 + i*3));
		}
		
		for (FarbigesLabel l : fl)
			c.add(l);
	}

	public static void main(String[] args)
	{
		FrameMitGridLayout fenster = new FrameMitGridLayout();
		fenster.setTitle("Frame mit GridLayout");
		fenster.setSize(300,150);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
