
public class Planeet {
	private double versnelling; // g
	public double massa = 8.259; // constante waarden mogen public
	private double gewicht; // G = m(massa) * g(zwaarteveldsterkte)
	private double gemiddelde;
	
	public Planeet(double versnelling1) {
		versnelling = versnelling1;
		
	}
	
	public void getMassa() {
		System.out.println(massa);
	}
	
	public void getGewicht() {
		gewicht = massa * versnelling;
		System.out.println(gewicht);
	}
	
	public void gemiddeldeZwaartekracht(double g1, double g2, double g3) {
		gemiddelde = (g1+g2+g3)/3;
		System.out.println("Gemiddelde zwaartekracht: " + gemiddelde);
	}
}
