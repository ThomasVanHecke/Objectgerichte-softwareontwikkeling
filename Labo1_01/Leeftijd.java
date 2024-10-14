package labo1;

public class Leeftijd {
	private double geboorteJaar, toekomstigJaar;
	
	public void setInstantieVariabelen(double gJ, double tJ) { // setter-methode
		geboorteJaar = gJ;
		toekomstigJaar = tJ;
	}
	
	public double berekenJaarIn() { // bereken-methode
		return toekomstigJaar-geboorteJaar;
	}
	
	public void schrijfBerekenJaarIn() {
		System.out.println(berekenJaarIn());
	}
}
