import javax.swing.JFrame;

// VensterDemoFrame inherits class JFrame
public class VensterDemoFrame extends JFrame{
	public VensterDemoFrame() {
		// Title frame
		setTitle("Let's Swing");
		// Initial size (x1, y1, width, height)
		setBounds(200, 100, 300, 200);
		// Makes frame visible, not by default
		setVisible(true);
		// When exiting, also exit the program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
