package kapitel15ereignisverarbeitung;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Bilderrahmen extends JFrame
{
	Container c;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem menuItem;
	JToolBar toolBar;
	JButton button;
	JLabel bildLabel;
	
	public Bilderrahmen()
	{
		c = getContentPane();
		
		//Menü
		//Erzeuge das Listener-Objekt für das Menü
		MenuListener mL = new MenuListener();
		menuBar = new JMenuBar();
		
		menu = new JMenu("Bilder");
		menu.setMnemonic(KeyEvent.VK_B);
		
		menuItem = new JMenuItem("Hund");
		menuItem.setMnemonic(KeyEvent.VK_H);
		menuItem.addActionListener(mL);
		menuItem.setActionCommand("dog");
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Katze");
		menuItem.setMnemonic(KeyEvent.VK_K);
		menuItem.addActionListener(mL);
		menuItem.setActionCommand("cat");
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Maus");
		menuItem.setMnemonic(KeyEvent.VK_M);
		menuItem.addActionListener(mL);
		menuItem.setActionCommand("mouse");
		menu.add(menuItem);
		
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
		//Werkzeugleiste
		//Toolbar Listener
		ToolBarListener tL = new ToolBarListener();
		
		toolBar = new JToolBar("Rahmenfarbe");
		
		button = new JButton(new ImageIcon(getClass().getResource("/resources/rot.gif")));
		button.setToolTipText("roter Rahmen");
		button.addActionListener(tL);
		button.setActionCommand("rot");
		toolBar.add(button);
		
		button = new JButton(new ImageIcon(getClass().getResource("/resources/gruen.gif")));
		button.setToolTipText("grüner Rahmen");
		button.addActionListener(tL);
		button.setActionCommand("gruen");
		toolBar.add(button);
		
		button = new JButton(new ImageIcon(getClass().getResource("/resources/blau.gif")));
		button.setToolTipText("blauer Rahmen");
		button.addActionListener(tL);
		button.setActionCommand("blau");
		toolBar.add(button);
		
		bildLabel = new JLabel(new ImageIcon(getClass().getResource("/resources/dog.gif")));
		
		c.setBackground(Color.RED);
		c.add(bildLabel, BorderLayout.CENTER);
		c.add(toolBar, BorderLayout.NORTH);	
	}
	
	class MenuListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			bildLabel.setIcon(new ImageIcon(getClass().getResource("/resources/" + e.getActionCommand() + ".gif")));
		}
	}
	
	class ToolBarListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getActionCommand().equals("rot"))
				c.setBackground(Color.RED);
			else if (e.getActionCommand().equals("gruen"))
				c.setBackground(Color.GREEN);
			else if (e.getActionCommand().equals("blau"))
				c.setBackground(Color.BLUE);
		}
	}
	
	public static void main(String[] args)
	{
		Bilderrahmen fenster = new Bilderrahmen();
		fenster.setTitle("Bilderrahmen");
		fenster.setSize(400, 280);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
