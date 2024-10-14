import java.util.Scanner;

 public class GebruikAquarium  {
	 
	public static void main (String [] args) 	{
		
	 Scanner sc = new Scanner ( System.in);	
	 
	 Aquarium a1 = new Aquarium ();
	 System.out.print("Gegevens van a1: ");
	 a1.schrijfAquarium();
	 // lengte=20.5; breedte=10.5; hoogte=15.5; prijs=30.75 ;aantal_in_stock=100; 
	 
	 Aquarium a2 = new Aquarium (50,20,30,60,70) ;
	 System.out.print("Gegevens van a2: ");
	 a2.schrijfAquarium();
	 
	 //  maak een kopie van a2 met een nieuwe lengte=35 
	 Aquarium a3 = new Aquarium (a2,35);
	 System.out.print("Gegevens van a3: ");
	 a3.schrijfAquarium();
	 
	 //  maak een kopie van a1 met een nieuwe breedte=17 
	 Aquarium a4 = a1.kopieerAquarium(17);
	 System.out.print("Gegevens van a4: ");
	 a4.schrijfAquarium();
	 	 
	 System.out.println("geef de verkochte hoeveelheden in van a1 en a2");
	 int va1 =sc.nextInt(); 
	 int va2 =sc.nextInt();
	 
	 
	 double inkomsten=a1.ontvangenAquarium(va1) + a2.ontvangenAquarium(va2);
	 System.out.println("inkomsten= " + inkomsten);
	 
	 // Schrijf de nieuwe gegevens van a1 en a2 uit met aangepaste stock 
	 System.out.print("Gegevens van a1: ");
	 a1.schrijfAquarium();
	 
	 System.out.print("Gegevens van a2: ");
	 a2.schrijfAquarium();
	 sc.close();
	 
 }
}