package kapitel14swingkomponenten;

import java.awt.*;

import javax.swing.*;

public class FrameMitTextArea extends JFrame
{
	Container c;
	JLabel info;
	JTextArea ta;
	
	public FrameMitTextArea()
	{
		c = getContentPane();
		
		info = new JLabel("Hier kann Text bearbeitet werden");
		ta = new JTextArea("Einiges an Text steht auch schon hier rum.");
		
		Font schrift = new Font("SansSerif", Font.BOLD+Font.ITALIC, 16);
		ta.setFont(schrift);
		
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		
		c.add(info, BorderLayout.NORTH);
		c.add(ta);
	}

	public static void main(String[] args)
	{
		FrameMitTextArea fenster = new FrameMitTextArea();
		fenster.setTitle("Frame mit TextArea");
		fenster.setSize(200,160);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
