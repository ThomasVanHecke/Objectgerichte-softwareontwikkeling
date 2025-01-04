package Bibliotheek;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Bibliotheek {
	private Leden leden;
	private Boeken boeken;
	private Uitleningen uitleningen;
	
	public Bibliotheek() {
		this.leden = new Leden();
		this.boeken = new Boeken();
		this.uitleningen = new Uitleningen();
	}
	
	public Bibliotheek(Bibliotheek b) {
		this.leden = new Leden();
		/* this.leden.addAll(b.leden);-> Dit is maar een oppervlakkige copy
		 * Aanpassingen in de ene lijst worden ook aangepast in de andere
		 *  */
		
		// SOLUTION -> diepe kopie
		for(Lid l: b.leden.getLedenLijst()) {
			this.leden.voegToe(l);
		}
		
		this.boeken = new Boeken();
		/*this.boeken.addAll(b.boeken);-> Dit is maar een oppervlakkige copy
		 * Aanpassingen in de ene lijst worden ook aangepast in de andere
		 *  */
		
		// SOLUTION -> diepe kopie
		for(Boek boek: b.boeken.getBoekenLijst()) {
			this.boeken.voegToe(boek);
		}
	}
	
	public Lid getLid(int lidNummer) {
		int i = 0;
		List<Lid> ledenLijst = this.leden.getLedenLijst();
		while(ledenLijst.get(i).getNummer() != lidNummer && i < ledenLijst.size()) {
			i ++;
		}
		if(ledenLijst.get(i).getNummer() == lidNummer) {
			return ledenLijst.get(i);
		}
		else {
			return null;
		}
	}
	
	public Boek getBoek(String boekId) {
		int i = 0;
		List<Boek> boekenLijst = this.boeken.getBoekenLijst();
		while(boekenLijst.get(i).getCode().compareTo(boekId) != 0 && i < boekenLijst.size()) {
			i ++;
		}
		if(boekenLijst.get(i).getCode().compareTo(boekId) == 0) {
			return boekenLijst.get(i);
		}
		else {
			return null;
		}
	}

	public void voegBoekToe(Boek boek) {
		this.boeken.voegToe(boek);
		
	}

	public void voegLidToe(Lid lid) {
		this.leden.voegToe(lid);
		
	}

	public void schrijf() {
		System.out.println(this.toString());
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("Boekenlijst: " + System.lineSeparator() + this.boeken.toString() + System.lineSeparator());
		sb.append("Ledenlijst: " + System.lineSeparator() + this.leden.toString() + System.lineSeparator());
		sb.append(this.uitleningen);
		return sb.toString();
	}
	
	public void voegUitleningToe(Lid l, Boek b) {
		this.uitleningen.voegUitleningToe(l, b);
	}

	public double verwijderUitleningEnBepaalBoete(Lid l, Boek b) {
		if(this.uitleningen.verwijderUitlening(l, b)) {
			return 10;
		}
		else {
			System.out.println("Uitlening is niet verwijderd!");
			return 0;
		}
	}

	public Uitleningen getUitleningen(String string) {
		if(string.compareTo("alle")  == 0) {
			return this.uitleningen;
		}
		return null;
	}
}
