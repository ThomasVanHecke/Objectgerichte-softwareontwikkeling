import java.io.FileReader;
import java.io.IOException ;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException, NietUniekException {
	
		/* 
	       Deel 1: initialisatie van pakjesdienstbedrijf	      
	     
	       parameter in constructor (hier vb 4) = aantal bestelwagens dat het bedrijf heeft. 	     
	       Daar moet je in de constructor voor zorgen. Elke bestelwagen heeft een nummer ([0,aantalBestelwagens[)
	       en een totaalVolume van 100.		
	     
	     */
		
		
		PakjesDienst bedrijf = new PakjesDienst(4) ; 
		
		
		/* 
		   Deel 2: inlezen van de pakjesgegevens uit pakjes.txt
		
		
		
		   id (int), regio (String) en volume (int) gescheiden door komma's.
		   Via bedrijf.voegPakjeToe moet het pakje in allePakjes komen.
		
		   Als er een pakje een id heeft dat gelijk is aan het id van een vroeger pakje,
		   dan moet er een NietUniekException ergens worden opgegooid en hier opgevangen.
		   
		   Je moet de fout uitschrijven en het pakje overslaan (= niet toevoegen).
		
		   Pakjes krijgen initieel de toestand AANWEZIG.		   
		   
		   .....   schrijf hier de code voor deel 2 
		 		
		
		*/
		FileReader fR = new FileReader("pakjes.txt");
		Scanner sc = new Scanner(fR);
		
		// Reading the file as long there is a next line
		while (sc.hasNextLine()) {
			//System.out.println("Entering while loop");
				
			// Reading the entire line as ONE string
			String pakjeString = sc.nextLine();
				
			// Splitting the entire string with given regex (regular expression)
			String[] pakjeArray = pakjeString.split(",");
				
			String id = pakjeArray[0];
			String regio = pakjeArray[1];
			String volume = pakjeArray[2];
				
			int iD = Integer.parseInt(id);
			int vOlume = Integer.parseInt(volume);
				
			// For every line, creating a new object of class Pakje
			Pakje p = new Pakje(iD, regio, vOlume);
				
			try{
				//System.out.println("Pakje toevoegen");
				bedrijf.voegPakjeToe(p);
				
			}
			
			catch(NietUniekException nue){
				
				System.out.println(nue.getMessage());
				
			}
			//System.out.println("Pakje: " + p);
		}
		System.out.println("Lijst pakjes: " + bedrijf.allePakjes.pakjes.toString());
			
		/* 
		   Deel 3: alle gegevens naar het scherm schrijven		
		
		   Eerst de gegevens van de bestelwagens met de pakjes die aan hen zijn toegekend
		   (toestand = TOEGEKEND), in het begin geen enkele.
		   gebruik als hoofding "Bestelwagens met toegekende pakjes : "
		 
		   Daarna de pakjes die nog niet aan een bestelwagen zijn toegekend (toestand = AANWEZIG),
		   gebruik als hoofding "Nog te vervoeren pakjes : ", initieel zijn alle pakjes zo.
		 
		   Als laatste de pakjes die geleverd zijn (toestand = GELEVERD), 
		   gebruik als hoofding  "Reeds geleverde pakjes", in het begin geen enkele.		
		
		*/
		
						
		
		System.out.println(bedrijf) ; // Roept automatisch de toString()-methode op van object bedrijf
		
		
		
		/* 
		   Deel 4: eenvoudige, niet-realistische toekenning van pakjes aan bestelwagens	
		
		   in verdeelPakjesOverBestelwagens doe je het volgende:
		   
		   stap 1: vraag aan allePakjes de pakjes met toestand AANWEZIG
		   stap 2: sorteer deze op regio en bij gelijke regio's op grootte
		   stap 3: zolang er nog bestelwagens zijn en zolang er nog pakjes zijn
		   
		            neem volgende pakje
		            als het in bestelwagen past, laad het in die bestelwagen
		            anders ga je naar de volgende bestelwagen
		
		   wanneer past een pakje in een bestelwagen ?
		   
		   als er nog geen regio is toegekend aan de bestelwagen 
		   of als de regio van het pakje hetzelfde is als de regio van de bestelwagen
		   en natuurlijk als het ingenomen volume dan het totale volume niet overschrijdt
		
		
		*/
		
		//bedrijf.verdeelPakjesOverBestelwagens() ;
		
		
		/* 
		   Deel 5: alle gegevens naar een tekstbestand ("routes.txt") schrijven
		
		   op dezelfde manier als in deel 3
		
		   ... schrijf hier de code voor deel 5 
		
				
		*/
		
		
		/*
				
		   Deel 6: de parameter in onderstaande is het nummer van de bestelwagen		
		   waarvan de pakjes geleverd zijn en die dus de toestand GELEVERD moeten krijgen.
		   
		   Deze bestelwagen moet terug in initiele toestand gebracht worden.
		
		
		*/
		
						
		//bedrijf.setGeleverdDoorBestelwagen(2) ;
		
		
		
		// om te controleren of alles correct is		
		
		
		//System.out.println(bedrijf) ;
		
		
	}
}
