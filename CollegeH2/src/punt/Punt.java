/* gebruik van statische methode en instantiemethode */

package punt;

public class Punt {
	private double x, y;
	
	public Punt(double w, double v) { // constructor -> geeft private attributen een waarde
		x = w;
		y = v;
	}
	
	public static double getAfstandTussen(Punt p1, Punt p2) { // statische methode -> niet gehecht aan een object
		double dx = p1.x - p2.x;
		double dy = p1.y - p2.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
	
	public double getAfstandTot(Punt anderPunt) { // instantie methode -> wel gehecht aan een object
		double dx = x - anderPunt.x;
		double dy = y - anderPunt.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
}
