
import java.util.Scanner;
import java.io.*;

public class GebruikIbanLijst {

	public static void main(String[] args) throws IOException {
		// Creating object of the class FileReader
		FileReader fR = new FileReader("Lijst_Iban.txt");
		// Wrapping this object in an object of class Scanner
		Scanner sc = new Scanner(fR);
		// Creating an object of class IbanLijst
		IbanLijst iL = new IbanLijst();
		
		
		String string; // Holds the IBAN-number
		
		while(sc.hasNext()) {
			/* If you use sc.next -> the object of class Scanner will only read to the next whitespace */
			string = sc.nextLine(); // Reads the next line
			iL.voegToeVolledigeLijst(string); // Only adds string to volledigeLijst
		}
		
		// Looping through every object of the volledigeLijst
		for(String s : iL.getVolledigeLijst()) {
			// For every loop creating a new object of the class ControleerIBAN to use the written controleerIBAN-method
			ControleerIBAN c = new ControleerIBAN(s);
			// If true/geldig add to GeldigeLijst
			if(c.controleerIBAN()){
				iL.voegToeGeldigeLijst(s);
			}
		}
		System.out.println("Alle IBAN-nummer: " + iL.getVolledigeLijst());
		System.out.println("Geldige IBAN-nummers: " + iL.getGeldigeLijst());
		sc.close();
	}
}

/* I did not check for duplicates in the list */