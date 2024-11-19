import javax.swing.*;

public class LabelDemoFrame extends JFrame{
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private ImageIcon i;
	private JPanel p;
	
	// Default constructor
	public LabelDemoFrame() {
		// Creating objects
		i = new ImageIcon("src/Java.jpg");
		l1 = new JLabel("Label 1");
		l2 = new JLabel(i);
		// SwingConstants.RIGHT neccesity
		l3 = new JLabel("Label 3", i, SwingConstants.RIGHT);
		p = new JPanel();
		// Adding objects to container
		p.add(l1);
		p.add(l2);
		p.add(l3);
		// Adding container to content pane
		getContentPane().add(p);
		// Defining window
		setTitle("Labels");
		setBounds(200, 100, 300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
