import java.util.Scanner;
import java.util.List;

public class DanswedstrijdMain {

	public static void drukMenu() {
		System.out.println("Hoofdmenu" + System.getProperty("line.separator"));
		System.out.println("\t  1. Toevoegen deelnemer");
		System.out.println("\t  2. Toevoegen jurylid");
		System.out.println("\t  3. Toevoegen alle scores");
		System.out.println("\t  4. Tonen deelnemersLijst");
		System.out.println("\t  5. Tonen juryleden");
		System.out.println("\t  6. Verwijderen deelnemer");
		System.out.println("\t  7. Ordenen deelnemerslijst alfabetisch op naam");
		System.out.println();
		System.out.println("\t  8. Ordenen deelnemerslijst op inschrijvingsnummer");
		System.out.println("\t  9. Ordenen deelnemerslijst op behaalde totale aflopende score");
		System.out.println("\t 10. Zoek deelnemer op naam en toon scores");
		System.out.println("\t 11. Toon winnaar");
		System.out.println("\t 12. Verwijder JuryLid en al zijn gegeven scores (NOG NIET GEACTIVEERD)");
		System.out.println();		
		System.out.println("\t 0. Stoppen");
		System.out.println();
		System.out.print("Keuze: ");
	}
	
	public static void wisScherm(){
		for (int i=0; i<100; i++) System.out.println();
	}
	
	public static void waitUntilKeypressed() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Druk <enter> om verder te gaan: ");
		sc.nextLine();
		/*DO NOT: sc.close() -> No more input for keuze available!*/
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DeelnemersLijst l = new DeelnemersLijst();
		JuryLedenLijst jl = new JuryLedenLijst();
		
		int keuze;	
		int nummer;
		String naam;
		
		do {
			wisScherm();
			drukMenu();		
			keuze = Integer.parseInt(sc.nextLine()); // Conversing String to int -> used for switch-instruction		
			switch (keuze){
				case 0:
					break;
					
				case 1: // voeg deelnemer toe							
					System.out.print("Inschrijvingsnummer: ");	
					nummer = Integer.parseInt(sc.nextLine());
					System.out.print("Naam: ");
					naam = sc.nextLine();
					Deelnemer d = new Deelnemer(nummer, naam);
					l.voegDeelnemerToe(d); 
					break;
					
				case 2: // voeg jurylid toe
					System.out.print("Id: ");
					nummer = Integer.parseInt(sc.nextLine());
					System.out.print("Naam: ");
					naam = sc.nextLine();
					JuryLid jurylid = new JuryLid(nummer, naam);
					jl.voegJuryLidToe(jurylid);
					break;
					
				case 3: // voeg alle scores toe
					int waarde;
					for (int i=0; i<l.getAantalDeelnemers(); i++){
						Deelnemer deelnemer = l.getDeelnemer(i);
						System.out.println("score voor " + deelnemer.getNaam() + ": ");
						// Every jurylid has to give one deelnemer a score, therefore 2 nested for loops
						for (int j=0; j<jl.getAantalJuryLeden(); j++){
							JuryLid lid = jl.getJuryLid(j);
							System.out.print("\t" + lid.getNaam() + ": ");
							waarde = Integer.parseInt(sc.nextLine()); // Conversing given value by jurylid
							Score s = new Score(waarde, lid); // Here the s object is created
							deelnemer.voegScoreToe(s); // Here the object is added to the ArrayList in the Deelnemer class
							}
						}
					break;
					
				case 4: // toon deelnemerslijst
					wisScherm();
					System.out.println(l.toString());
					waitUntilKeypressed();
					break;
					
				case 5: // toon juryledenlijst
					wisScherm();
					System.out.println(jl.toString());
					waitUntilKeypressed();
					break;
					
				case 6: // verwijderDeelnemer
					System.out.print("Inschrijvingsnummer: ");
					nummer = Integer.parseInt(sc.nextLine());
					if (l.zoekDeelnemerOpInschrijvingsNummer(nummer)<0) 
						System.out.println(nummer + " bestaat niet");
					else{
						l.verwijderDeelnemer(nummer);
						System.out.println("deelnemer " + nummer + " is verwijderd");
					}
					waitUntilKeypressed();
					break;
				
				// WORKS
				case 7: // sorteer deelnemerslijst op naam
					l.sorteerOpNaamDeelnemer();
					System.out.println("Ok");
					waitUntilKeypressed();
					break;
				
				// WORKS
				case 8: // sorteer deelnemerslijst op inschrijvingsnummer
					l.sorteerOpInschrijvingsNummerDeelnemer();
					System.out.println("Ok");
					waitUntilKeypressed();
					break;
				
				// WORKS
				case 9: // sorteer deelnemerslijst op aflopende totale score
					l.sorteerOpTotaleAflopendeScoreDeelnemer();
					System.out.println("Ok");
					waitUntilKeypressed();
					break;
				
				// WORKS	
				case 10:
					System.out.print("Geef de naam van de deelnemer: ");
					naam = sc.nextLine();
					int index = l.zoekDeelnemerOpNaam(naam);
					if(index != -1) {
						d = l.getDeelnemer(index);
						List<Score> scoreLijstDeelnemer = d.getScorelijst();
						System.out.println(scoreLijstDeelnemer);
						waitUntilKeypressed();
						break;
					}
					else {
						System.out.println("Deelnemer niet gevonden");
						waitUntilKeypressed();
						break;
					}
				
				// WORKS
				case 11:
					System.out.println("De winnaar is: ");
					System.out.println(l.getWinnaarDeelnemers().toString());
					waitUntilKeypressed();
					break;
					
									
				default:System.out.println("Ongeldige keuze!");
				waitUntilKeypressed();
				break;
			}
		} while (keuze != 0);
		System.out.println("Good bye");
		sc.close();
	}
}
