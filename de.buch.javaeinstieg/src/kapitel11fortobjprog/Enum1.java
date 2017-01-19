package kapitel11fortobjprog;

import static kapitel11fortobjprog.Jahreszeit.*;
public class Enum1
{

	public static void main(String[] args)
	{
		Jahreszeit x = HERBST;
		System.out.println(x);
		
		for (Jahreszeit jz : Jahreszeit.values())
			System.out.println(jz + " hat den Wert " + jz.ordinal());
	}
}