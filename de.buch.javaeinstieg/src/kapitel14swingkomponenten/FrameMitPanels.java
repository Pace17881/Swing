package kapitel14swingkomponenten;

import java.awt.*;

import javax.swing.*;

public class FrameMitPanels extends JFrame
{
	Container c;
	JPanel jp1, jp2, jp3;
	
	public FrameMitPanels()
	{
		c = getContentPane();
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel(new GridLayout(2, 3));
		
		for (int i = 1; i<=3; i++)
			jp1.add(new JButton("Taste " + i));
		
		Icon bild = new ImageIcon(getClass().getResource("/resources/testbild.png"));
		
		for (int i = 1; i <= 3; i++)
			jp2.add(new JLabel(bild));
		
		for (int i = 1; i <= 6; i++)
			jp3.add(new JCheckBox("Auswahlbox " + i));
		
		c.add(jp1, BorderLayout.NORTH);
		c.add(jp2, BorderLayout.CENTER);
		c.add(jp3, BorderLayout.SOUTH);
	}

	public static void main(String[] args)
	{
		FrameMitPanels fenster = new FrameMitPanels();
		fenster.setTitle("Frame mit Panels");
		fenster.setSize(350,200);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
