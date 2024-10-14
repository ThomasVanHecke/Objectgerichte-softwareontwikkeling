package labo1;

public class Gemiddelde {
	private double g1, g2, g3;
	
	public Gemiddelde(double getal1, double getal2, double getal3) {
		g1 = getal1;
		g2 = getal2;
		g3 = getal3;
	}
	
	public double berekenGemiddelde() {
		return (g1+g2+g3)/3;
	}
	
	public void schrijfGemiddelde() {
		System.out.println(berekenGemiddelde());
	}
}
