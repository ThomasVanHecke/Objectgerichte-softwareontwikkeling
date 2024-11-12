
import java.util.Scanner;

public class GebruikPaswoord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Paswoord p1 = new Paswoord("AAA2023");
		Paswoord p2 = new Paswoord("aaa2023");
		Paswoord p3 = new Paswoord("AAAB2023");
		
		/* Because we use static methods in our default constructor we don't need to call them */
		
		// Calculate ASCIIsom for every password
		p1.ASCIIsom();
		p2.ASCIIsom();
		p3.ASCIIsom();
		
		p1.controleerPaswoord();
		p2.controleerPaswoord();
		p3.controleerPaswoord();
		
		p1.printAttributes();
		p2.printAttributes();
		p3.printAttributes();
		
		sc.close();
	}

}
