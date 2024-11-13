package meubels1;

public class Tafel extends Meubels {
	private int aantalPersonen;
	
	// 3 parameter constructor
	public Tafel(double g, double p, int aantalP) {
		super(g, p);
		this.aantalPersonen = aantalP;
	}
	
	// Getter
	public int getAantalPersonen() {
		return this.aantalPersonen;
	}
	
	// Write method
	public void schrijf() {
		System.out.println("Gewicht: " + this.getGewicht());
		System.out.println("Positie : " + this.getPositie());
		System.out.println("Aantal personen: " + this.aantalPersonen);
	}
}
