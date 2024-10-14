import java.util.Scanner;

public class GebruikVaten {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Geef max volume: ");
		Vaten vat1 = new Vaten(sc.nextInt()); //leeg vat van max 100 liter
		System.out.println("Geef max volume: ");
		Vaten vat2 = new Vaten(sc.nextInt()); //leeg vat van max 500 liter
		
		System.out.println("Vul het vat met: ");
		vat1.vulMet(sc.nextInt()); //voeg 35 l vloeistof toe
		vat1.schrijf(); //sop: vat van 100 l met 35 l gevuld
		
		System.out.println("Vul het vat met: ");
		vat1.vulMet(sc.nextInt()); //voeg 80 l toe, 15 l gaat verloren
		vat1.schrijf(); //sop: vat van 100 l met 100 l gevuld
		
		System.out.println("Pomp over liter: ");
		vat1.pompOver(sc.nextInt(),vat2);
		vat1.schrijf(); //sop: vat van 100 l met 10 l gevuld
		vat2.schrijf(); //sop: vat van 500 l met 90 l gevuld
		sc.close();
	}
}