

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Makelaar bestHA = new Makelaar();
		
		//deel 1
		//inlezen woningen uit woningen.txt
		//per woning 1 lijn: id (int), type (String), plaats (String) en aantalSlaapkamers
		//(int) telkens gescheiden door een komma
		//gebruik een methode voegWoningToe om een woning aan bestHA toe te voegen
		
		//hier moeten jullie code schrijven
		//......
		
		
		
		//ter controle schrijven naar het scherm
		//alle gegevens van de makelaar: eerst alle gegevens van de woningen
		//dan alle gegevens van de klanten (nu nog geen klanten)
		System.out.println(bestHA);
		
		//deel 2
		//sorteren
		bestHA.sorteerWoningenOpId();
		System.out.println(bestHA);
		bestHA.sorteerWoningenOpPlaatsDanTypeDanAantalSlaapkamers();
		//bij gelijke plaats naar type kijken en bij gelijk type naar aantalSlaapkamers
		System.out.println(bestHA);
		
		//deel 3
		//inlezen gegevens klanten uit klanten.txt
		//per klant is er 1 lijn met gebruikersNaam, email en voorkeuren gescheiden door
		//komma's
		//elke voorkeur is van volgende vorm: type=waarde
		//gebruik een methode voegKlantToe 
		//als er al een klant is met die naam moet de methode of een onderliggende methode
		//een FouteNaamException opgooien die hier moet worden opgevangen
		//deze klant voeg je dan niet toe
		
		//hier moeten jullie code schrijven
		//......
		
		
		
		System.out.println(bestHA);
		
		//deel 4	
		//emails van alle personen fittend voor 1 woning naar tekstbestand contacteer.txt
		//zorg dat eerst de gegevens van de woning naar het tekstbestand worden geschreven.
		Woning woning = bestHA.getWoningMetId(51); //51 = id van woning
		List<String> emails = bestHA.getEmailsInteresseVoorWoning(woning); 
		//hier moeten jullie code schrijven
		//......
	}
}
