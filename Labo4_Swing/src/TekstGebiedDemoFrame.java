import javax.swing.*;

public class TekstGebiedDemoFrame extends JFrame{
	private JTextArea t;
	private JPanel p;
	
	// Default Constructor
	public TekstGebiedDemoFrame() {
		// Creating objects
		t = new JTextArea("Hier staat een string ", 20, 20);
		p = new JPanel();
		// Accessing methods
		t.append("Deze string append ik");
		t.insert("Deze string insert ik", 3);
		t.setLineWrap(true);
		t.setWrapStyleWord(true);
		// Adding content to container
		p.add(t);
		// Adding container to frame
		getContentPane().add(p);
		// Defining window
		setTitle("Text area");
		setBounds(200,200,200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
