//Aufgabe 13.2

package kapitel14swingkomponenten;

import javax.swing.JFrame;

public class TextFrame
{

	public static void main(String[] args)
	{
		
		try
		{
			int w = Integer.parseInt(args[0]);
			int h = Integer.parseInt(args[1]);
			String t = args[2];
			
			
			FrameMitText fenster1 = new FrameMitText();
			fenster1.setTitle(t);
			fenster1.setSize(w, h);
			fenster1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fenster1.setVisible(true);
			
		}
		catch (ArrayIndexOutOfBoundsException | NumberFormatException e)
		{
			System.out.println("Bitte Breite, Höhe und Fenstertitel angeben!");
		}
		
		

	}

}
