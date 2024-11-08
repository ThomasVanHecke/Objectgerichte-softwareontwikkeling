import java.util.Scanner;

public class GebruikIBAN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geef IBAN nummer: ");
		IBAN iban = new IBAN(sc.nextLine());
		
		if (iban.controleerIBAN()){
			System.out.println("Geldig IBAN nummer");
		}
		
		else {
			System.out.println("Geen geldig IBAN nummer");
		}
		sc.close();
	}

}
