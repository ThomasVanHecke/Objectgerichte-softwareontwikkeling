//Mathias Dupont
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
	
	    Planeten allePlaneten = new Planeten();
	    //Steden planeetSteden = new Steden();
	    Steden alleSteden = new Steden();
		
//deel 1		
		//lees alle gegevens van alle planeten uit een tekstbestand
		//planeten.txt
		//en voeg die toe aan allePlaneten (hierboven gedeclareerd)
		//de eerste regel bevat het aantalPlaneten
		//dan volgen er per planeet een aantal regels waarvan
		//de eerste regel 3 delen bevat gescheiden door ;
		//nl naamPlaneet;naamSter;info over planeet
		//de tweede regel bevat het aantal gegeven steden (kan 0 zijn)
		//daarna volgen aantalSteden regels met per regel de naam van de stad 
		//en het aantal inwoners gescheiden door een ;
		
		Scanner scFile = new Scanner(new FileReader("planeten.txt"));
		while (scFile.hasNextLine()) {
			String lijn = scFile.nextLine(); //Inlezen van totaal aantal planeten in het .txt-bestand
			if (lijn.length()!=0) {
				int aantalPlaneten = Integer.parseInt(lijn); //We bepalen voor hoeveel planeten we onderstaande for-loop moeten doorlopen (lijn 0)
				for (int i=0;i<aantalPlaneten;i++) {
					String [] planeetDelen = scFile.nextLine().split(";"); //Opsplitsen van naamPlaneet, naamSter, info op lijn 1 van planeet i
					int aantalSteden = Integer.parseInt(scFile.nextLine()); //Inlezen van aantal steden op lijn 2 van planeet i
					Steden planeetSteden = new Steden(); //Enkel geldig in deze for-loop! (iedere iteratie nieuwe value)
					for (int j=0;j<aantalSteden;j++) {
						String [] stadDelen = scFile.nextLine().split(";"); //Opsplitsen van naam, aantalInwoners op lijn j van planeet i
						planeetSteden.voegStadToe(new Stad(stadDelen[0], Integer.parseInt(stadDelen[1])));
						alleSteden.voegStadToe(new Stad(stadDelen[0], Integer.parseInt(stadDelen[1]))); // Logboek van alle steden aanvullen
					}
					allePlaneten.voegPlaneetToe(new Planeet(planeetDelen[0], planeetDelen[1], planeetDelen[2], planeetSteden));
				}
			}
		}
		System.out.println(allePlaneten); //Print-out nog niet zo 'mooi'
		System.out.println(alleSteden);   //Print-out nog niet zo 'mooi'
	}
}

///////////////////////////////////////////////  |
/////////////////////TO-DO/////////////////////  |
///////////////////////////////////////////////  V
		
//deel 2		
		
		//System.out.println("alle planeten gesorteerd op naam(planeet)");
		//allePlaneten.sorteerOpNaam();
		//System.out.println(allePlaneten);
		
		//System.out.println("alle planeten gesorteerd op ster (bij gelijke ster: op naam)");
		//allePlaneten.sorteerOpSter(); //als ster null -> achteraan, 
		//System.out.println(allePlaneten);
		
//deel 3		
		//beschrijving = info
		//System.out.println("alle planeten met Atreides:");
		//Planeten atreidesPlaneten = allePlaneten.zoekPlanetenMetInBeschrijving("Atreides");
		//System.out.println(atreidesPlaneten);
		
		
//deel 3bis		
//als er in het bovenstaande (=deel 3) geen planeet gevonden wordt moet de methode 
		//zoekPlanetenMetInBeschrijving een zelf te definieren GeenPlaneetGevondenException
		//opwerpen die in deze main moet worden opgevangen
	
//deel 4		
		
		//p = allePlaneten.getPlaneetMetStad("Sietch Tabr");
		//System.out.println("gegevens planeet met Sietch Tabr: ");
		//System.out.println(p);
		
//deel 5		
		//maak een lijst met alle namen van alle steden gesorteerd op naam (stad)
		//schrijf de lijst stedenGesorteerd uit naar een tekstbestand
		//List<String> stedenGesorteerd = allePlaneten.getAlleStedenGesorteerdOpNaam();
		///...
	//}
//}
