package kapitel11fortobjprog;
import static kapitel11fortobjprog.Noten.*;
public class Enum2
{

	public static void main(String[] args)
	{
		for (Noten n : Noten.values())
			if (n.liegAufSchwarzerTaste())
				System.out.println(n + " liegt auf einer schwarzen Taste");
			else
				System.out.println(n + " liegt auf einer weissen Taste");
	}

}
