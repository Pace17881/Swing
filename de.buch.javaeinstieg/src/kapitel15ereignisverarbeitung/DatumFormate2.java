package kapitel15ereignisverarbeitung;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class DatumFormate2 extends JFrame
{
	Container c;
	JLabel beschriftung, datumsAnzeige;
	JMenuBar menuBar; 
	JMenu dateMenu;
	JMenuItem langD, mittelD, kurzD;
	Date datum = new Date();

	SimpleDateFormat kurz = new SimpleDateFormat("dd. MMMMM");
	SimpleDateFormat mittel = new SimpleDateFormat("EEEE, dd. MMMMM");
	SimpleDateFormat lang = new SimpleDateFormat("EEEE, dd.MMMMM YYYY");

	public DatumFormate2()
	{
		c = getContentPane();
		c.setLayout(new GridLayout(2, 0));

		beschriftung = new JLabel("Heutiges Datum:", JLabel.CENTER);
		datumsAnzeige = new JLabel(lang.format(datum), JLabel.CENTER);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		dateMenu = new JMenu("Menü");
		menuBar.add(dateMenu);
		
		MenuListener mL = new MenuListener();
		
		langD = new JMenuItem("Alles anzeigen");
		langD.addActionListener(mL);
		mittelD = new JMenuItem("Wochentag, Tag und Monat");
		mittelD.addActionListener(mL);
		kurzD = new JMenuItem("Tag und Monat");
		kurzD.addActionListener(mL);
		
		dateMenu.add(langD);
		dateMenu.add(mittelD);
		dateMenu.add(kurzD);
		
		c.add(beschriftung);
		c.add(datumsAnzeige);
	}

	class MenuListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == langD)
				datumsAnzeige.setText(lang.format(datum));
			else if (e.getSource() == mittelD)
				datumsAnzeige.setText(mittel.format(datum));
			else if (e.getSource() == kurzD)
				datumsAnzeige.setText(kurz.format(datum));
			
		}
	}

	public static void main(String[] args)
	{
		DatumFormate2 fenster = new DatumFormate2();
		fenster.setTitle("DatumFormate");
		fenster.setSize(300, 250);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			SwingUtilities.updateComponentTreeUI(fenster);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		fenster.setVisible(true);
	}

}
