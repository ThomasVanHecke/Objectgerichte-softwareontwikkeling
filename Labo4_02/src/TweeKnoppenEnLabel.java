import javax.swing.*;
import java.awt.event.*;

public class TweeKnoppenEnLabel extends JFrame {
	private JButton knop1, knop2;
	private JLabel l1;
	private JPanel p;
	
	// Default constructor
	public TweeKnoppenEnLabel() {
		// Creating objects
		knop1 = new JButton("Knop 1");
		knop2 = new JButton("Knop 2");
		p = new JPanel();
		l1 = new JLabel("Label 1");
		// Adding interface to buttons
		knop1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l1.setText("Er werd op knop 1 gedrukt");
			}
		});
		knop2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l1.setText("Er werd op knop 2 gedrukt");
			}
		});
		// Adding components to container
		p.add(knop1);
		p.add(knop2);
		p.add(l1);
		// Adding container to frame
		getContentPane().add(p);
		// Defining window
		setTitle("Titel");
		setBounds(200,200,200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
