import javax.swing.*;

public class KnopDemoFrame extends JFrame {
	private JButton knop;
	private JPanel p;
	
	public KnopDemoFrame() {
		setTitle("Mijn knop demo");
		setBounds(200, 100, 300, 200);
		p = new JPanel(); // Creates container
		knop = new JButton("Mijn knop"); // Creates button
		p.add(knop); // Adding button to container
		getContentPane().add(p); // Adding container to frame
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
