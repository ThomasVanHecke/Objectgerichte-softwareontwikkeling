
public class Onderzoek {
	private double g;
	private boolean even;
	
	public Onderzoek(double getal) {
		g = getal;
		even = false;
	}
	
	public void berekenOnderzoek() {
		if((g % 2) == 0) {
			even = true;
		}
		else {
			even = false;
		}
	}
	
	public void schrijfOnderzoek() {
		if(even) {
			System.out.println("Het getal is EVEN");
		}
		else {
			System.out.println("Het getal is ONEVEN");
		}
	}
}
