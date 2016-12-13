package javaeinstieg;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class FrameMitListe extends JFrame
{
	Container c;
	JComboBox vornamen, nachnamen;
	
	public FrameMitListe()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		String [] namen = new String[] { "Bilbo", "Frodo", "Samwise", "Meriadoc", "Peregrin"};
		vornamen = new JComboBox(namen);
		
		nachnamen = new JComboBox();
		nachnamen.addItem("Baggins");
		nachnamen.addItem("Gamgee");
		nachnamen.addItem("Took");
		
		nachnamen.setSelectedIndex(1);
		
		c.add(vornamen);
		c.add(nachnamen);
	}

	public static void main(String[] args)
	{
		FrameMitListe fenster = new FrameMitListe();
		fenster.setTitle("Frame mit GridLayout");
		fenster.setSize(240,160);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
