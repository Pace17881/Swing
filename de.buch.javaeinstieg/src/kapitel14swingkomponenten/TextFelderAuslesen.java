package kapitel14swingkomponenten;

import java.util.Scanner;

import javax.swing.JFrame;

public class TextFelderAuslesen
{

	public static void main(String[] args)
	{
		FrameMitTextFeldern t = new FrameMitTextFeldern();
		t.pack();
		t.setVisible(true);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		System.out.println("Geben Sie im Frame in beide Textfelder etwas ein!");
		System.out.println("Druecken Sie danach hier im Konsolenfenster die Eingabetaste!");
		Scanner ein = new Scanner(System.in);
		ein.nextLine();
		ein.close();
		
		System.out.println("In Name wurde eingegeben: " + t.tf.getText());
		
		char[] ca = t.pf.getPassword();
		System.out.println("In Passwort wurde eingegeben: " + new String(ca));
	}

}
