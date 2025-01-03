
public class Dier {
	private String naam;
	
	public Dier(String n) {
		this.naam = n;
		
	}
	
	public String getNaam() {
		return this.naam;
	}
	
	public boolean komtVoor(Dier d2, ComparatorDier c) {
		return c.compare(this, d2)<0;
	}
	
	public int compare(Dier d1, Dier d2) {
		return d1.vergelijkNaam(d2);
	}

	public int vergelijkNaam(Dier d2) {
		String naam2 = d2.getNaam();
		return this.getNaam().compareTo(naam2);
	}
}
