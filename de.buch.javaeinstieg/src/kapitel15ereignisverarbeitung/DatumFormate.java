package kapitel15ereignisverarbeitung;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class DatumFormate extends JFrame
{
	Container c;
	JLabel beschriftung, datumsAnzeige;
	JComboBox<String> formatAuswahl;
	Date datum = new Date();

	SimpleDateFormat kurz = new SimpleDateFormat("dd. MMMMM");
	SimpleDateFormat mittel = new SimpleDateFormat("EEEE, dd. MMMMM");
	SimpleDateFormat lang = new SimpleDateFormat("EEEE, dd.MMMMM YYYY");

	public DatumFormate()
	{
		c = getContentPane();
		c.setLayout(new GridLayout(3, 0));

		beschriftung = new JLabel("Heutiges Datum:", JLabel.CENTER);
		datumsAnzeige = new JLabel(lang.format(datum), JLabel.CENTER);

		formatAuswahl = new JComboBox<>();
		formatAuswahl.addItem("Alles anzeigen");
		formatAuswahl.addItem("Wochentag, Tag und Monat");
		formatAuswahl.addItem("Tag und Monat");
		formatAuswahl.addItemListener(new BoxListener());
		
		c.add(beschriftung);
		c.add(datumsAnzeige);
		c.add(formatAuswahl);
	}

	class BoxListener implements ItemListener
	{
		@Override
		public void itemStateChanged(ItemEvent e)
		{
			if (formatAuswahl.getSelectedIndex() == 0)
				datumsAnzeige.setText(lang.format(datum));
			else if (formatAuswahl.getSelectedIndex() == 1)
				datumsAnzeige.setText(mittel.format(datum));
			else if (formatAuswahl.getSelectedIndex() == 2)
				datumsAnzeige.setText(kurz.format(datum));
		}
	}

	public static void main(String[] args)
	{
		DatumFormate fenster = new DatumFormate();
		fenster.setTitle("DatumFormate");
		fenster.setSize(300, 100);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setVisible(true);
	}

}
