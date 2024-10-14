import java.util.Scanner;

public class GebruikBankRekening {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		 
		// maak bankrekening-object br1 met de default-constructor
		
		BankRekening br1 = new BankRekening () ;

		/*
		 *  maak bankrekening-object br2  
		 *  met als nummer BE34 0011 1936 9690 
		 *  op naam van Jan Janssens
		 *  en met een saldo van 1755.25 Euro
		 */
		
		
		BankRekening br2 = new BankRekening ("BE34 0011 1936 9690", "Jan Janssens" , 1755.25 );
		
		// print de gegevens van beide objecten uit op het scherm
		
		
		System.out.println("Gegevens van br1 zijn: "+ br1.getNummer() + "\t" + br1.getHouder() + "\t" + br1.getSaldo());
		System.out.println("Gegevens van br2 zijn: "+ br2.getNummer() + "\t" + br2.getHouder() + "\t" + br2.getSaldo());

		System.out.println("Ik geef de gegevens van mijn eigen bankrekening in ! ");
		System.out.print("Mijn bankrekeningnummer is: ");
		String nummer = sc.nextLine();
		
		System.out.print("Mijn naam is: ");
		String naam = sc.nextLine();
		
		System.out.print("Mijn saldo is: ");
		double saldo = sc.nextDouble();
		
		// ik ken aan bankrekening br1 de gegevens van mijn eigen bankkaart toe;
		System.out.println("Mijn gegevens worden toegekend aan bankrekening br1");
		br1.setNummer(nummer);
		br1.setHouder(naam);
		br1.setSaldo(saldo);
		
		// print de gegevens van bankrekening br1 uit op het scherm
		System.out.println("Gegevens van br1 zijn na invulling van mijn gegevens: "+ br1.getNummer() + "\t" + br1.getHouder() + "\t" + br1.getSaldo());
		sc.close();
	}

}