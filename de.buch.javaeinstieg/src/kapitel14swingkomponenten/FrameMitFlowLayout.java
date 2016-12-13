package javaeinstieg;

import java.awt.*;

import javax.swing.*;

public class FrameMitFlowLayout extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	Container c;
	FarbigesLabel fl[] = new FarbigesLabel[4];
	
	public FrameMitFlowLayout ()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.RIGHT, 10,30));
		
		for (int i = 0; i < 4; i++)
		{
			int rgbFg = 255 - i * 80;
			int rgbBg = i*80;
			fl[i] = new FarbigesLabel("Nummer " + (i+1), new Color(rgbFg, rgbFg, rgbFg), new Color(rgbBg, rgbBg, rgbBg));
			fl[i].setFont(new Font("Serif", Font.ITALIC, 28));
		}
		for (int i = 0; i< 4; i++)
			c.add(fl[i]);
	}

	public static void main(String[] args)
	{
		FrameMitFlowLayout fenster = new FrameMitFlowLayout();
		
		fenster.setTitle("Frame mit FlowLayout");
		fenster.setSize(300, 150);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
