package kapitel14swingkomponenten;

import java.awt.*;

import javax.swing.*;

public class FrameMitTextFeldern extends JFrame
{
	Container c;
	JLabel name, passwd;
	JTextField tf;
	JPasswordField pf;
	
	public FrameMitTextFeldern()
	{
		c = getContentPane();
		c.setLayout(new GridLayout(2, 2));
		
		name = new JLabel("Name:", JLabel.RIGHT);
		passwd = new JLabel("Passwort:", JLabel.RIGHT);
		tf = new JTextField();
		pf = new JPasswordField();
		
		Font schrift = new Font("SansSerif", Font.BOLD, 18);
		name.setFont(schrift);
		passwd.setFont(schrift);
		tf.setFont(schrift);
		pf.setFont(schrift);
		
		c.add(name);
		c.add(tf);
		c.add(passwd);
		c.add(pf);
	}

	public static void main(String[] args)
	{
		FrameMitTextFeldern fenster = new FrameMitTextFeldern();
		fenster.setTitle("Frame mit Textfeldern");
		fenster.setSize(220,100);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
