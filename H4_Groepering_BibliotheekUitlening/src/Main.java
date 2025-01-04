import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Bibliotheek mijnBibliotheek = new Bibliotheek();
		
		/* INLEZEN BOEKEN */
		FileReader fr1 = new FileReader("Boeken.txt");
		Scanner sc1 = new Scanner(fr1);
		while(sc1.hasNextLine()) {
			String codeTitelAuteur = sc1.nextLine();
			String[] arrayCodeTitelAuteur = codeTitelAuteur.split(",");
			String code = arrayCodeTitelAuteur[0];
			String titel = arrayCodeTitelAuteur[1];
			String auteur = arrayCodeTitelAuteur[2];
			//System.out.println(code + "/" + titel  + "/" + auteur);
			Boek boek = new Boek(code, titel, auteur);
			mijnBibliotheek.voegBoekToe(boek);
		}
		sc1.close();
		
		/* INLEZEN LEDEN */
		FileReader fr2 = new FileReader("Leden.txt");
		Scanner sc2 = new Scanner(fr2);
		while(sc2.hasNextLine()) {
			String nummerNaamEmail = sc2.nextLine();
			String[] arrayNummerNaamEmail = nummerNaamEmail.split(",");
			int nummer = Integer.parseInt(arrayNummerNaamEmail[0]);
			String naam = arrayNummerNaamEmail[1];
			String email = arrayNummerNaamEmail[2];
			//System.out.println(nummer + "/" + naam + "/" + email);
			Lid lid = new Lid(nummer, naam, email);
			mijnBibliotheek.voegLidToe(lid);
		}
		sc2.close();
		
		/* CONTROLE */
		mijnBibliotheek.schrijf();
		
		Scanner sc = new Scanner(System.in);
		int keuze = 0;
		String boekId;
		int lidNummer;
		Lid l;
		Boek b;
		
		do{
			System.out.println("0: stoppen");
			System.out.println("1: voeg uitlening toe");
			System.out.println("2: verwijder uitlening");
			System.out.println("3: bewaar lijst van uitleningen");
			System.out.println("4: geef lijst van te laat");
			keuze = Integer.parseInt(sc.nextLine());
			switch (keuze){
			case 0: System.out.println("programma stopt."); 
					break;
			
			/* WORKS */
			case 1:
				System.out.println("lidnummer:");
				lidNummer = Integer.parseInt(sc.nextLine());
				l = mijnBibliotheek.getLid(lidNummer);
				if (l!=null) {
					System.out.println("boekCodes, 1/lijn, stop met -1:");
					while (!(boekId=(sc.nextLine())).equals("-1")){
						b = mijnBibliotheek.getBoek(boekId);
						if (b!=null) mijnBibliotheek.voegUitleningToe(l,b);
					}
				}
				mijnBibliotheek.schrijf();
				break;
				
			case 2:
				double boete = 0;
				System.out.println("lidnummer:");
				lidNummer = Integer.parseInt(sc.nextLine());
				l = mijnBibliotheek.getLid(lidNummer);
				if (l!=null) {
					System.out.println("boekCodes, 1 per lijn, stop met -1:");
					while (!(boekId=(sc.nextLine())).equals("-1")){
						b = mijnBibliotheek.getBoek(boekId);
						if (b!=null) {
							boete += mijnBibliotheek.verwijderUitleningEnBepaalBoete(l,b);
						}
					}
				}
				System.out.println("Betaal " + boete + " euro boete.");
				mijnBibliotheek.schrijf();
				break;
			
			/*
			case 3:
				Uitleningen alleUitleningen = mijnBibliotheek.getUitleningen("alle");
				//schrijven naar een tekstbestand (csv)
				
				break;
			
			case 4:
				Uitleningen teLaat = mijnBibliotheek.getUitleningen("teLaat");
				System.out.println(teLaat);
				break;*/
				
			}
		}
		while (keuze!=0);
		sc.close();
	}
}
