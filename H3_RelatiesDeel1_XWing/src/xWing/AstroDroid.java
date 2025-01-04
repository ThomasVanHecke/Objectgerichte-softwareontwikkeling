package xWing;

public class AstroDroid {
	private String naam;
	
	public AstroDroid() {
		
	}
	
	public AstroDroid(String naam) {
		this.naam = naam;
	}
	
	public String getNaam() {
		StringBuilder sb = new StringBuilder(this.naam);
		
		return sb.toString();
	}

}
