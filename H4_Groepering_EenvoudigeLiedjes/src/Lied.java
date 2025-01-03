
public class Lied {
	private String titel;
	private double duur;
	
	public Lied(String titel, double duur) {
		this.titel = titel;
		this.duur = duur;
	}

	public int vergelijkTitel(Lied l2) {
		return this.titel.compareTo(l2.titel);
		
	}

	public double getDuur() {
		return this.duur;
	}

	public int vergelijkDuur(Lied l2) {
		return Double.compare(this.duur, l2.getDuur());
	}

	public String getTitel() {
		return this.titel;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("Titel: " + this.titel + " en duur: " + this.duur);
		return sb.toString();
		
	}
}
