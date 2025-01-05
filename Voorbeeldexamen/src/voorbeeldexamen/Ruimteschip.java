package voorbeeldexamen;

public class Ruimteschip {
	private String naam;
	private int capaciteit;
	
	public Ruimteschip(String string, int i) {
		this.naam = string;
		this.capaciteit = i;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(this.naam + "," + this.capaciteit);
		return sb.toString();
	}

	public int getCapaciteit() {
		return this.capaciteit;
	}
}

