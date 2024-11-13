package meubels1;

public class Kast extends Meubels {
	private double legOppervlak;
	
	// 1 parameter constructor
	/* Class Kast inherites class Meubels (extends), the constructor of Meubels needst to be defined aswell */
	public Kast(double g, double p, double legOpp) {
		super(g, p); // Super calls the constructor of the basisclass, needs to be done first
		this.legOppervlak = legOpp;
	}
	
	// Getter
	public double getLegOppervlak() {
		return this.legOppervlak;
	}
	
	// Write method
	/* Write method of inheritent class Kast OVERRIDES write method of basisclass Meubels */
	/* If we want to print all attributes of an object of class Kast we can acces the attribute of class Meubels by calling the getters */
	public void schrijf() {
		System.out.println("Gewicht: " + this.getGewicht());
		System.out.println("Positie: " + this.getPositie());
		System.out.println("Leg Oppervlak: " + this.legOppervlak);
	}
}
