package kapitel14swingkomponenten;

import javax.swing.JFrame;

public class NotenEingabeTest
{

	public static void main(String[] args)
	{
		NotenEingabe ne = new NotenEingabe();
		ne.setSize(150,200);
		ne.setLocation(0, 0);
		ne.setTitle("Noteneingabe");
		ne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ne.setVisible(true);
		
		NotenEingabeNeu nen = new NotenEingabeNeu();
		nen.pack();
		nen.setLocation(200, 0);
		nen.setTitle("Noteneingabe Neu");
		nen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nen.setVisible(true);
	}

}
