
public class Priemgetal {
	private int getal;
	private boolean priemgetal;
	
	public Priemgetal(int g) {
		getal = g;
<<<<<<< HEAD
		priemgetal = true; // Assuming that every number is a primenumber
	}
	
	public void berekenPriemgetal() {
		// Initial value of i = 2; As long as i < getal run the loop; Afterwards increment i by 1
		for(int i = 2; i < getal; i++) {
			System.out.print(i);
			// Taking the modulo of getal, to check if i is a divisor (deler) of getal
			if((getal % i) == 0) { 
=======
		priemgetal = true;
	}
	
	public void berekenPriemgetal() {
		for(int i = 2; i < getal; i++) {
			System.out.print(i);
			if((getal % i) == 0) {
>>>>>>> refs/remotes/origin/master
				priemgetal = false;
			}
		}
		
		if(priemgetal == true) {
			System.out.println("EEN priemgetal: " + getal);
		}
		
		else {
			System.out.println("GEEN priemgetal: " + getal);
		}
	}
}
