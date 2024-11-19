import javax.swing.*;

public class NogEenKnopDemoFrame extends JFrame{
	private JButton knop;
	private JPanel p;
	private ImageIcon icoon;
	
	// Default constructor
	public NogEenKnopDemoFrame() {
		setTitle("En nog een knop");
		setBounds(200, 100, 300, 200);
		icoon = new ImageIcon("src/Java.jpg"); // Creates icon
		knop = new JButton("Knop", icoon); // Creates button with the created icon
		p = new JPanel(); // Creates container
		p.add(knop); // Adds button to container
		getContentPane().add(p); // Adds container to frame
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
