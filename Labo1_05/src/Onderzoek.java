
public class Onderzoek {
	private double g;
	private boolean even;
	
	public Onderzoek(double getal) { // 1 parameter constructor 
		g = getal;
		even = false;
	}
	
	public void berekenOnderzoek() { // method
		if((g % 2) == 0) {
			even = true;
		}
		else {
			even = false;
		}
	}
	
	public void schrijfOnderzoek() { // method
		if(even) {
			System.out.println("Het getal is EVEN");
		}
		else {
			System.out.println("Het getal is ONEVEN");
		}
	}
}
