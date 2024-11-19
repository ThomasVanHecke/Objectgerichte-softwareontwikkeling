import javax.swing.*;

public class SchuifDeelvensterDemoFrame extends JFrame{
	// Declaring attributes
	private JTextArea t;
	private JPanel p;
	private JScrollPane s;
	
	// Default constructor
	public SchuifDeelvensterDemoFrame() {
		// Creating objects
		t = new JTextArea("Hier staat een string", 20, 20);
		p = new JPanel();
		s = new JScrollPane(t, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		// Adding to container
		p.add(s); // Only need to add s because s contains t
		// Adding container to frame
		getContentPane().add(p);
		// Defining window
		setTitle("Schuifvenster");
		setBounds(200,200,200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
