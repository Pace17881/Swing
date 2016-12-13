package javaeinstieg;

import java.util.Scanner;

import javax.swing.JFrame;

public class ZweiFrames
{

	public static void main(String[] args)
	{
		FrameMitText fenster = new FrameMitText();
		fenster.setTitle("Das erste Fenster");
		fenster.setSize(400, 250);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setVisible(true);

		
		Scanner ein = new Scanner(System.in);
		int w = 0, h = 0;
		String fTitle = "";
		
		System.out.print("\nNeue Breite: ");
		w = Integer.parseInt(ein.nextLine());
		System.out.print("\nNeue Höhe: ");
		h = Integer.parseInt(ein.nextLine());
		fenster.setSize(w, h);
		
		System.out.print("\nNeuer Titel für Fenster: ");
		fTitle = ein.nextLine();
		fenster.setTitle(fTitle);
		
		System.out.print("\nFenster unsichtbar machen mit Enter: ");
		ein.nextLine();
		fenster.setVisible(false);
		
		System.out.print("\nFenster sichtbar machen mit Enter: ");
		ein.nextLine();
		fenster.setVisible(true);
		
		System.out.print("\nFenster auf Koordinaten (300,100) verschieben: ");
		ein.nextLine();
		fenster.setLocation(300, 100);
		
		System.out.print("\nzweites Fenster erzeugen: ");
		ein.nextLine();
		JFrame fenster2 = new JFrame();
		fenster2.setTitle("Zweites Fenster");
		fenster2.setSize(300, 200);
		fenster2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster2.setVisible(true);
		
		ein.close();

	}

}
