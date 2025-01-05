import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

        Wedstrijd wedstrijd = new Wedstrijd();

        //deel 1

		//inlezen gegevens uit csv-bestand startlijst.txt
		//startnummer,naam,land,starttijd (int,String,String,double)
		//starttijd = aantal seconden na start wedstrijd
		//eerste heeft starttijd 0;
		//gebruik wedstrijd.voegAtleetToe(...) om een atleet aan de wedstrijd toe te voegen
		//iedere atleet krijgt eindTijd -1;
		
		FileReader fr = new FileReader("startlijst.txt");
		Scanner sc = new Scanner(fr);
		while(sc.hasNextLine()) {
			String startnummerNaamLandStarttijd = sc.nextLine();
			String[] arrayStartnummerNaamLandStarttijd = startnummerNaamLandStarttijd.split(",");
			
			String startnummerString = arrayStartnummerNaamLandStarttijd[0];
			String naamString = arrayStartnummerNaamLandStarttijd[1];
			String landString = arrayStartnummerNaamLandStarttijd[2];
			String starttijdString = arrayStartnummerNaamLandStarttijd[3];
			
			int startnummer = Integer.parseInt(startnummerString);
			double starttijd = Double.parseDouble(starttijdString);
			Atleet atleet = new Atleet(startnummer, naamString, landString, starttijd);
			wedstrijd.voegAtleetToe(atleet);
		}
		sc.close();
		fr.close();
		wedstrijd.schrijf();
		
		
		//deel 2		

		//startlijst uitschrijven volgens oplopend startnummer
		//opgelet startlijst.txt is niet noodzakelijk correct gesorteerd
		System.out.println(wedstrijd.getStartLijst());

		
		//deel 3

		//inlezen en verwerken simulatie.txt
		//eerste lijn: aantal schietbeurten (2,4 of 8)
		//gebruik wedstrijd.setAantalSchietBeurten(aantalSchietBeurten);
		//met aantalSchietBeurten het eerste ingelezen getal
		
		//daarna, aantal lijnen met 3 mogelijkheden:
		//nietVertrokken startnummerAtleet
		//schiet startnummerAtleet aantalGemist
		//finish startnummerAtleet aantalSecondenSindsStartWedstrijd
		
		fr = new FileReader("simulatie.txt");
		sc = new Scanner(fr);
		//System.out.println(sc.nextLine());
		String aantalSchietBeurtenString = sc.nextLine();
		int aantalSchietBeurten = Integer.parseInt(aantalSchietBeurtenString);
		//System.out.println(aantalSchietBeurten);
		wedstrijd.setAantalSchietBeurten(aantalSchietBeurten);
		//System.out.println(sc.nextLine());
		
		while(sc.hasNextLine()) {
			int nummerAtleet;
			int gemist;
			double eindTijd;
			
			String string = sc.nextLine();
			String[] arrayString = string.split(" ");
			//System.out.println(arrayString.toString());
			String string1 = arrayString[0];
			System.out.println(string1);
			
			switch (string1) {
				case "schiet": nummerAtleet = Integer.parseInt(arrayString[1]);
							   gemist = Integer.parseInt(arrayString[2]);
							   //schietbeurt toevoegen bij juiste atleet via
							   try {
								   wedstrijd.verwerkSchietBeurt(nummerAtleet,gemist);
							   }
							   catch(OnmogelijkeWaardeException owe){
								   System.out.println(owe.getMessage());
							   }
							   break;
							   
				case "finish": nummerAtleet = Integer.parseInt(arrayString[1]);
							   eindTijd = Double.parseDouble(arrayString[2]);
							   //eindTijd invullen bij juiste atleet via
							   try {
								   wedstrijd.verwerkFinish(nummerAtleet,eindTijd);
							   }
							   catch(OnmogelijkeWaardeException owe) {
								   System.out.println(owe.getMessage());
							   }
							   break;
							   
				case "nietVertrokken": nummerAtleet = Integer.parseInt(arrayString[1]);
				                       //eindTijd moet op -2 worden gezet bij juiste atleet via
										try {
											wedstrijd.verwerkNietVetrokken(nummerAtleet);
										}
										catch(OnmogelijkeWaardeException owe) {
											System.out.println(owe.getMessage());
										}
									   
									   break;
									   
				default: System.out.println("foute mogelijkheid"); break;
			}	
		}
		fr.close();
		sc.close();
		wedstrijd.schrijf();
		
		
		
		
		
		//deel 3 bis
		
		//exceptions toevoegen aan verwerken simulaties (=in deel 3)
		
		//nummer 1
		//Als je een schietBeurt toevoegt, dan moet je een OnmogelijkeWaardeException opgooien
		//als de atleet daarvoor al aantalSchietBeurten keren geschoten heeft.
		//Deze Exception moet in de main worden opgevangen en dan moet je enkel de fout uitschrijven.
		
		//nummer 2
		//als je een finish verwerkt, dan moet je ook een OnmogelijkeWaardeException opgooien
		//als de eindTijd voor de startTijd ligt
		//Ook deze Exception moet in de main worden opgevangen (en enkel de fout uitschrijven).
		
		
		//deel 4

		//finale stand schrijven naar tekstbestand "resultaat.txt"
		//plaatsnummer startnummer naam land aantalGemistSchiett1 + aantalGemistSchiet2 (+...) tijdsVerschilMetEerste
		//volgens oplopend plaatsnummer, d.w.z snelste eerst
		//wie niet gefinisht is moet DNF hebben ipv tijdsVerschilMetEerste
		//wie niet gestart is moet DNS hebben ipv tijdsVerschilMetEerste
		//DNF en DNS moeten achteraan in de lijst staan.
		
		FileWriter fw = new FileWriter("resultaat.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.println(wedstrijd.toStringResultaat());
		System.out.println(wedstrijd.toStringResultaat());
		pw.close();

	}
}
