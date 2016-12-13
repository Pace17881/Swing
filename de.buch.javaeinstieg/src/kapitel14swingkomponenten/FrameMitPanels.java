package javaeinstieg;

import java.awt.*;

import javax.swing.*;

public class FrameMitPanels extends JFrame
{
	Container c;
	JLabel info;
	JTextArea ta;
	JScrollPane sp;
	
	public FrameMitPanels()
	{
		c = getContentPane();
		
		info = new JLabel("Hier kann Text bearbeitet werden");
		ta = new JTextArea("Einiges an Text steht auch schon hier rum.");
		
		Font schrift = new Font("SansSerif", Font.BOLD+Font.ITALIC, 16);
		ta.setFont(schrift);
		
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		
		sp = new JScrollPane(ta);
		
		c.add(info, BorderLayout.NORTH);
		c.add(sp);
	}

	public static void main(String[] args)
	{
		FrameMitPanels fenster = new FrameMitPanels();
		fenster.setTitle("Frame mit ScrollTextArea");
		fenster.setSize(200,160);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
