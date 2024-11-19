import java.awt.event.*;
import javax.swing.*;

// Inherit class JFrame
public class TitelWijzigenMetKnopFrame extends JFrame {
	private JButton knop1;
	private JButton knop2;
	private JPanel p;
	
	// Default constructor
	public TitelWijzigenMetKnopFrame() {
		setTitle("Titel wijzigen");
		knop1 = new JButton("Aarde");
		knop1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				setTitle("Aarde");
			}
		});
		
		knop2 = new JButton("Zon");
		knop2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				setTitle("Zon");
			}
		});
		p = new JPanel();
		p.add(knop1);
		p.add(knop2);
		getContentPane().add(p);
		setBounds(200, 100, 300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
