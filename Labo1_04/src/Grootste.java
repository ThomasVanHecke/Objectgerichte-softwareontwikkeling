
public class Grootste {
	private double g1, g2, grootste;
	
<<<<<<< HEAD
	public Grootste(double getal1, double getal2) { // 2 parameter constructor
		g1 = getal1;
		g2 = getal2;
		grootste = 0;
	}
	
	public void berekenGrootste() { // method
		if(g1>=g2) {
			grootste = g1;
		}
		else {
			grootste = g2;
		}
	}
	
	public void schrijfGrootste() { // method
=======
	public Grootste(double getal1, double getal2) {
		g1 = getal1;
		g2 = getal2;
		grootste = 0;
	}
	
	public void berekenGrootste() {
		if(g1>=g2) {
			grootste = g1;
		}
		else {
			grootste = g2;
		}
	}
	
	public void schrijfGrootste() {
>>>>>>> refs/remotes/origin/master
		System.out.println("Het grootste getal is: " + grootste);
	}
}
