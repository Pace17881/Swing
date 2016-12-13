package javaeinstieg;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class FrameMitTextFeldern extends JFrame
{
	Container c;
	JList vornamen;
	JComboBox nachnamen;
	
	public FrameMitTextFeldern()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		String [] namen = new String[] { "Bilbo", "Frodo", "Samwise", "Meriadoc", "Peregrin"};
		vornamen = new JList(namen);
		
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
		FrameMitTextFeldern fenster = new FrameMitTextFeldern();
		fenster.setTitle("Frame mit GridLayout");
		fenster.setSize(240,160);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
