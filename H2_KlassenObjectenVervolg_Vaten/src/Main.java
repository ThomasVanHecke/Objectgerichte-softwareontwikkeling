
public class Main {
	public static void main(String[] args) {
		Vat vat1 = new Vat(100); //leeg vat van max 100 liter
		Vat vat2 = new Vat(500); //leeg vat van max 500 liter
		vat1.vulMet(35); //voeg 35 l vloeistof toe
		System.out.println(vat1.toString()); //sop: vat van 100 l met 35 l gevuld
		vat1.vulMet(80); //voeg 80 l toe, 15 l gaat verloren
		System.out.println(vat1.toString()); //sop: vat van 100 l met 100 l gevuld
		vat1.pompOver(90,vat2);
		System.out.println(vat1.toString()); //sop: vat van 100 l met 10 l gevuld
		System.out.println(vat2.toString()); //sop: vat van 500 l met 90 l gevuld
	}
}
