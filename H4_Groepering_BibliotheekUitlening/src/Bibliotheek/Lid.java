package Bibliotheek;

public class Lid {
	private int nummer;
	private String naam, email;
	
	public Lid() {
		
	}
	
	public Lid(int nummer, String naam, String email) {
		this.nummer = nummer;
		this.naam = naam;
		this.email = email;
	}
	
	public Lid(Lid l) {
		this.nummer = l.nummer;
		this.naam = l.naam;
		this.email = l.email;
	}

	public int getNummer() {
		return this.nummer;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("Nummer: " + this.nummer + " Naam: " + this.naam + " Email: " + this.email);
		return sb.toString();
	}
	
}
