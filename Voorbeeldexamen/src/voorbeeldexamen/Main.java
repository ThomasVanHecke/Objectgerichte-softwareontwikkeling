package voorbeeldexamen;
public class Main {

	public static void main(String[] args) throws IOException {

        Planeten planeten = new Planeten();

//deel 1

		//inlezen van de gegevens van planeten uit csv-bestand (planeten.txt) 
		//per lijn 1 planeet
		//met naam, x, y en z-coordinaat alles gescheiden door komma's
		//coordinaten zijn gehele getallen (int)
		//gebruik planeten.voegPlaneetToe om een planeet toe te voegen aan planeten
		
		...
		
//deel 2		

        //aan de code van deel 2 mag je niets wijzigen
        //om gemakkelijk te testen aantal hardcoded vluchten toegevoegd 
        //je mag nog extra vluchten toevoegen om te testen
        
		Ruimteschip r1 = new Ruimteschip("Far Star",100);
		Ruimteschip r2 = new Ruimteschip("Unimara",750);
		
		Vluchten vluchten = new Vluchten();
		Vlucht v;
		Planeet vertrek,aankomst;
		//vlucht 1
		vertrek = planeten.getPlaneet("Terminus");
		aankomst = planeten.getPlaneet("Trantor");
		v = new Vlucht(vertrek,aankomst,r1);
		vluchten.voegVluchtToe(v);
		//vlucht 2
		vertrek = planeten.getPlaneet("Aurora");
		aankomst = planeten.getPlaneet("Solaria");
		v = new Vlucht(vertrek,aankomst,r2);
		vluchten.voegVluchtToe(v);
		//vlucht 3
		vertrek = planeten.getPlaneet("Terminus");
		aankomst = planeten.getPlaneet("Anacreon");
		v = new Vlucht(vertrek,aankomst,r2);
		vluchten.voegVluchtToe(v);
		//vlucht 4
		vertrek = planeten.getPlaneet("Trantor");
		aankomst = planeten.getPlaneet("Comporellon");
		v = new Vlucht(vertrek,aankomst,r1);
		vluchten.voegVluchtToe(v);
		
		
		
//deel 3		
        //vluchten sorten op naam van vertrekplaneet, en als deze gelijk zijn 
        //op naam van aankomstplaneet 
		vluchten.sorteer();
		System.out.println(vluchten);
		
//deel 4
		
		v = vluchten.getVlucht(1); // 1 = index van vlucht in lijst 
		v.voegPassagiersToe(300);
		
		
//deel 4 bis	
        //als bij het toevoegen van passagiers in deel 4 de capaciteit van het 
        //ruimteschip word overschreden
        //dan moet er een CapaciteitOverschredenException worden opgegooid 
        //die in deze main moet worden opgevangen
		
//deel 5
		
		//schrijf alle gegevens van alle vluchten uit naar een tekstbestand (vluchten.txt)
		...
		
//deel 6
		
		//neem alle vluchten die vertrekken van Terminus en 
		//neem de namen van de aankomstplaneten van die vluchten
		//en plaats deze in een List<String>
		List<String> aankomstNamen = vluchten.getNamenAankomstenVertrekkendVan("Terminus");
		for (String s : aankomstNamen) System.out.println(s); 
	}
}
