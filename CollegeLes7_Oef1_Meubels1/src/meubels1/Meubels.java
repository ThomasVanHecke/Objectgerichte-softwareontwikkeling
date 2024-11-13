package meubels1;

public class Meubels {
	private double gewicht;
	private double positie;
	
	// 2 parameter constructor
	public Meubels(double g, double p) {
		this.gewicht = g;
		this.positie = p;
	}
	
	// Getter -> asking attributes of a object
	public double getGewicht() {
		return this.gewicht;
	}
	
	// Getter
	public double getPositie() {
		return this.positie;
	}
	
	// Setter
	public void verplaats(double nieuwePositie) {
		this.positie = nieuwePositie;
	}
	
	// Write method
	public void schrijf() {
		System.out.println("Gewicht: " + this.gewicht);
		System.out.println("Positie: " + this.positie);
	}
}
