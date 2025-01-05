
public class Main {

	public static void main(String[] args) throws IOException {
	    
		BabbelKamers babbelKamers = new BabbelKamers();
		
		//deel 1
		//inlezen gegevens van alle personen uit tekstbestand personen.txt
		//voor elke persoon is er 1 lijn met id (int), gebruikersNaam (String) 
		//en contactGegevens (String) gescheiden door komma's
		//deze gegevens moeten aan babbelKamers worden toegevoegd
		//via een methode voegPersoonToe die het aan allePersonen moet toevoegen. 
		
		//hier moeten jullie code schrijven
		//......
		
		//ter controle schrijven we alle gegevens uit:
		//eerst de gegevens van alle personen
		//allePersonen:
		//voor elke persoon zijn/haar gegevens
		//dan de gegevens van de babbelkamers
		//babbelKamers:
		//voor elke babbelKamer de gegevens
		//is voorlopig leeg
		System.out.println(babbelKamers);
		
		//deel 2
		//inlezen babbelkamers uit kamers.txt
		//elke lijn bevat de gegevens van 1 babbelKamer
		//id, naam, id's van de leden (personen) telkens gescheiden door een komma
		//gebruik een methode babbelKamers.getPersoonMetId om het persoon-object
		//met het juiste id te krijgen. Deze methode (of een onderliggende methode) 
		//moet een OngeldigeIdException opgooien als er geen persoon is met dat id
		//Dit moet hier worden opgevangen; bij een fout wordt de persoon niet
		//toegevoegd aan de babbelKamer 
		//gebruik een methode voegKamerToe om de babbelKamer aan babbelKamers
		//toe te voegen
				
		//hier moeten jullie code schrijven
		//....
		
		
		System.out.println(babbelKamers);
		
		//deel 3
		//berichten toevoegen aan babbelkamers
		//hardcoded zodat jullie niets moeten intikken
		//bij voegBerichtToe: eerste parameter is id babbelkamer
		
			Persoon p = babbelKamers.getPersoonMetId(2067);
			Bericht b = new Bericht("hoe laat?",p);
			babbelKamers.voegBerichtToe(834,b); 
			p = babbelKamers.getPersoonMetId(825);
			b = new Bericht("om 10u?",p);
			babbelKamers.voegBerichtToe(834,b); 
			p = babbelKamers.getPersoonMetId(418);
			b = new Bericht("kom ook",p);
			babbelKamers.voegBerichtToe(834,b); 
			
			p = babbelKamers.getPersoonMetId(34);
			b = new Bericht("pakje aangekomen",p);
			babbelKamers.voegBerichtToe(420,b); 
			
			p = babbelKamers.getPersoonMetId(34);
			b = new Bericht("ook aan het regenen daar?",p);
			babbelKamers.voegBerichtToe(913,b); 
			p = babbelKamers.getPersoonMetId(44);
			b = new Bericht("pijpenstelen",p);
			babbelKamers.voegBerichtToe(913,b); 
		
		
		System.out.println(babbelKamers);
		
		//deel 4
		//sorteren van babbelkamers op naam
		babbelKamers.sorteerOpNaam();
		System.out.println(babbelKamers);
		
		//sorteren van babbelkamers op aantal berichten
		babbelKamers.sorteerOpAantalBerichten();
		System.out.println(babbelKamers);
		
		//alle gegevens van babbelkamers naar tekstbestand alles.txt schrijven
		//hier moeten jullie code schrijven
		//......
	}
}
