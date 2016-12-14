package kapitel14swingkomponenten;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class FrameMitMenuBar extends JFrame
{
	Container c;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem menuItem;
	JToolBar toolBar;
	JButton button;
	JLabel textLabel;
	
	public FrameMitMenuBar()
	{
		c = getContentPane();
		
		//Menü
		menuBar = new JMenuBar();
		
		menu = new JMenu("Bilder");
		menu.setMnemonic(KeyEvent.VK_B);
		
		menuItem = new JMenuItem("Hund");
		menuItem.setMnemonic(KeyEvent.VK_H);
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Katze");
		menuItem.setMnemonic(KeyEvent.VK_K);
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Maus");
		menuItem.setMnemonic(KeyEvent.VK_M);
		menu.add(menuItem);
		
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
		//Werkzeugleiste
		toolBar = new JToolBar("Rahmenfarbe");
		
		button = new JButton(new ImageIcon(getClass().getResource("/resources/rot.gif")));
		button.setToolTipText("roter Rahmen");
		toolBar.add(button);
		
		button = new JButton(new ImageIcon(getClass().getResource("/resources/gruen.gif")));
		button.setToolTipText("grüner Rahmen");
		toolBar.add(button);
		
		button = new JButton(new ImageIcon(getClass().getResource("/resources/blau.gif")));
		button.setToolTipText("blauer Rahmen");
		toolBar.add(button);
		
		textLabel = new JLabel("Hier erscheint mal ein Bild mit Rahmen.", JLabel.CENTER);
		
		c.add(textLabel, BorderLayout.CENTER);
		c.add(toolBar, BorderLayout.NORTH);	
	}
	
	public static void main(String[] args)
	{
		FrameMitMenuBar fenster = new FrameMitMenuBar();
		fenster.setTitle("Frame mit Menueleiste und Toolbar");
		fenster.setSize(350, 170);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
