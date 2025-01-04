package Bibliotheek;

public class Boek {
	private String code, auteur, titel;
	
	public Boek() {
		
	}
	
	public Boek(String code, String titel, String auteur) {
		this.code = code;
		this.titel = titel;
		this.auteur = auteur;
	}
	
	public Boek(Boek b) {
		this.code = b.code;
		this.auteur = b.auteur;
		this.titel = b.titel;
	}

	public String getCode() {
		return this.code;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder("Code: " + this.code + " Auteur: " + this.auteur + " Titel: " + this.auteur);
		return sb.toString();
	}

	public String uitSchrijven() {
		StringBuilder sb = new StringBuilder(this.code + "," + this.titel + "," + this.auteur);
		return sb.toString();
	}
}
