
import java.awt.event.*;

import javax.swing.*;

// Classes in the same project can be imported by any other class of the same project without any import statement.

public class Iban extends JFrame {
	
	private JPanel p ; // Attribute p of type JPanel (class can be used as a datatype)
	private JLabel label_invoer ; // Attribute label_invoer of type JLabel (class can be used as a datatype)
	private JTextField tekstvak ; // Attribute tekstvak of type JTextField (class can be used as a datatype)
	private JButton knop ; // Attribute knop of type JButton (class can be used as a datatype)
	private JLabel label_result ; // Attribute label_result of type JLabel (class can be used as a datatype)
	
	// Default constructor
	public Iban () {	
		
		label_invoer = new JLabel("Geef je IBAN in : ") ; // Label_invoer is the reference to the new object created of type JLabel				
		tekstvak = new JTextField(12) ; // Tekstvak is the reference to the new object created of type JTextField
		knop = new JButton("Controleer rekeningnummer ") ; // Knop is the reference to the new object created of type JButton
		label_result = new JLabel (); // Label_result is the reference to the new object created of type JLabel
		
		// Defines the single line of text this component will display. Ifthe value of text is null or empty string, nothing is displayed. 
		label_result.setText(" weergave : geldig of ongeldig ! ") ;
		
		knop.addActionListener(new ActionListener () {	
			
			public void actionPerformed ( ActionEvent ae ) {
				// Returns the text contained in this TextComponent.
				String s  = tekstvak.getText() ;
				
				if (controleerIBAN()) {
					label_result.setText("Geldig!");
				}
				
				else {
					label_result.setText("Ongeldig!");
				}
				// TODO vul de code hier verder aan
				// zorg ervoor dat het resultaat ( geldig of ongeldig) weergegeven wordt in het label onder de knop
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}			
		});
		
		p = new JPanel();
		p.add(label_invoer) ;
		p.add(tekstvak) ;
		p.add(knop);
		p.add(label_result);
		this.getContentPane().add(p);	
		this.setTitle("Bankrekening Controle") ;
		this.setBounds( 800 , 150 , 300 , 200);	
		this.setVisible ( true );
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iban f = new Iban () ;		

	}
			
}

