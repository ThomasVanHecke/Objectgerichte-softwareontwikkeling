import java.io.IOException ;


public class Main {

	public static void main(String[] args) throws IOException {
	
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
		
		try {
			bedrijf.voegPakjeToe();
		}
		
		catch (NietUniekException nUE) {
			System.out.println(nUE.getMessage());
		}
		
		
		
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
		
						
		
		System.out.println(bedrijf) ;
		
		
		
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
		
		bedrijf.verdeelPakjesOverBestelwagens() ;
		
		
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
		
						
		bedrijf.setGeleverdDoorBestelwagen(2) ;
		
		
		
		// om te controleren of alles correct is		
		
		
		System.out.println(bedrijf) ;
		
		
	}
}
