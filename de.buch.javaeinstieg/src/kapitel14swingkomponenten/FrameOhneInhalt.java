package javaeinstieg;

import javax.swing.*;

public class FrameOhneInhalt extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	
	public FrameOhneInhalt ()
	{
	}

	public static void main(String[] args)
	{
		FrameOhneInhalt fenster = new FrameOhneInhalt();
		
		fenster.setTitle("Frame ohne Inhalt");
		fenster.setSize(300, 150);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
