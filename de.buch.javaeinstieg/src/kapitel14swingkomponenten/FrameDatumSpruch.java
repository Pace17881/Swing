package kapitel14swingkomponenten;

import java.awt.*;
import java.util.Date;
import java.util.Random;

import javax.swing.*;

public class FrameDatumSpruch extends JFrame
{
	Container c;
	JLabel date;
	JTextArea ta;
	
	public FrameDatumSpruch()
	{
		c = getContentPane();
		
		c.add(new JLabel("Aktuelles Datum: " + new Date()), BorderLayout.NORTH);
		
		String[] daily = {"Heute werde ich die Welt erobern, mist es regnet.",
						  "Das Glück ist das einzige, was sich verdoppelt,wenn man es teilt.",
						  "Ein langer Streit beweist, dass beide Seiten Unrecht haben.",
						  "Alle sagten: Das geht nicht. Dann kam einer, der wusste das nicht und hat's gemacht.",
						  "Man kann immer nur so nett sein, wie der andere es zulässt."};
		Random r = new Random();
		ta = new JTextArea(daily[r.nextInt(daily.length)]);
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		c.add(ta);
		
	}
	public static void main(String[] args)
	{
		FrameDatumSpruch fenster = new FrameDatumSpruch();
		fenster.setTitle("Datum und Spruch des Tages");
		fenster.setSize(300,300);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setVisible(true);

	}

}
