
public class Onderzoek {
	private double g;
	private boolean even;
	
<<<<<<< HEAD
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
=======
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
>>>>>>> refs/remotes/origin/master
		if(even) {
			System.out.println("Het getal is EVEN");
		}
		else {
			System.out.println("Het getal is ONEVEN");
		}
	}
}
