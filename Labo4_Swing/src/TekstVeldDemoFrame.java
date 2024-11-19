import javax.swing.*;

public class TekstVeldDemoFrame extends JFrame{
	private JTextField t;
	private JPanel p;
	
	// Default constructor
	public TekstVeldDemoFrame() {
		// Creating objects
		t = new JTextField("hier tekst", 20);
		p = new JPanel();
		// JTextField-object has been created -> access to methods
		t.setText("String" + t.getText());
		p.add(t);
		// Defining window
		setTitle("JTextField");
		setBounds(200, 100, 300, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(p);
	}
}
