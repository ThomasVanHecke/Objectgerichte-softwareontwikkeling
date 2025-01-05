package voorbeeldexamen;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

        Planeten planeten = new Planeten();

        //deel 1

		//inlezen van de gegevens van planeten uit csv-bestand (planeten.txt) 
		//per lijn 1 planeet
		//met naam, x, y en z-coordinaat alles gescheiden door komma's
		//coordinaten zijn gehele getallen (int)
		//gebruik planeten.voegPlaneetToe om een planeet toe te voegen aan planeten
		
		FileReader fr = new FileReader("planeten.txt");
		Scanner sc = new Scanner(fr);
		while(sc.hasNextLine()) {
			String naamXYZ = sc.nextLine();
			String[] arrayNaamXYZ = naamXYZ.split(",");
			String naam = arrayNaamXYZ[0];
			String xString = arrayNaamXYZ[1];
			String yString = arrayNaamXYZ[2];
			String zString = arrayNaamXYZ[3];
			int x = Integer.parseInt(xString);
			int y = Integer.parseInt(yString);
			int z = Integer.parseInt(zString);
			Planeet planeet = new Planeet(naam, x, y, z);
			planeten.voegPlaneetToe(planeet);
		}
		sc.close();
		planeten.schrijf();
		
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
		
		vluchten.schrijf();
		
		
		//deel 3		
        //vluchten sorten op naam van vertrekplaneet, en als deze gelijk zijn 
        //op naam van aankomstplaneet 
		vluchten.sorteer();
		System.out.println(vluchten);
		
		
		//deel 4
		
		v = vluchten.getVlucht(1); // 1 = index van vlucht in lijst 
		try {
			v.voegPassagiersToe(300);
		}
		catch(CapaciteitOverschredenException coe) {
			System.out.println(coe.getMessage());
		}
		
		
		//deel 4 bis	
        //als bij het toevoegen van passagiers in deel 4 de capaciteit van het 
        //ruimteschip word overschreden
        //dan moet er een CapaciteitOverschredenException worden opgegooid 
        //die in deze main moet worden opgevangen
		
		
		//deel 5
		
		//schrijf alle gegevens van alle vluchten uit naar een tekstbestand (vluchten.txt)
		FileWriter fw = new FileWriter("vluchten.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.println(vluchten.toString());
		
		/*
		//deel 6
		
		//neem alle vluchten die vertrekken van Terminus en 
		//neem de namen van de aankomstplaneten van die vluchten
		//en plaats deze in een List<String>
		List<String> aankomstNamen = vluchten.getNamenAankomstenVertrekkendVan("Terminus");
		for (String s : aankomstNamen) System.out.println(s);*/
	}
}
