
public class Persoon {
	private String naam;
	private char geslacht;
	
	public Persoon() {
		
	}
	
	public Persoon(String naam, char geslacht) {
		this.naam = naam;
		this.geslacht = geslacht;
	}

	public String getNaam() {
		return this.naam;
	}
}
