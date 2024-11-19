import javax.swing.*;
import java.awt.event.*;

public class Muntconversie extends JFrame {
	// Declare attributes
	private double frank, euro;
	private JTextField t;
	private JButton knop1, knop2;
	private JLabel l;
	private JPanel p;
	private String euroString, frankString;
	
	// Default constructor
	public Muntconversie() {
		// Creating objects
		t = new JTextField("Schrijf hier bedrag", 20); // if we convert to frank than bedrag is in euros and other way around
		knop1 = new JButton("Naar frank");
		knop2 = new JButton("Naar euro");
		l = new JLabel("Bedrag");
		p = new JPanel();
		// Implementing interface in buttons
		knop1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				euro = Double.parseDouble(t.getText()); // Converting the readed string value to a double value
				frank = euro * 40.3399; // Calculating amount
				frankString = String.valueOf(frank); // converting to string
				l.setText(frankString + " BEF");
			}
		});
		knop2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frank = Double.parseDouble(t.getText()); // Converting the readed string value to a double value
				euro = frank * (1/40.3399);
				euroString = String.valueOf(euro); // converting to string
				l.setText(euroString + "euro");
			}
		});
		// Adding to container
		p.add(knop1);
		p.add(knop2);
		p.add(l);
		p.add(t);
		// Adding container to frame
		getContentPane().add(p);
		// Defining window
		setTitle("Muntconversie");
		setBounds(300,300,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
