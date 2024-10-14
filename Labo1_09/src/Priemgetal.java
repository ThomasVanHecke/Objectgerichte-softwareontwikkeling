
public class Priemgetal {
	private int getal;
	private boolean priemgetal;
	
	public Priemgetal(int g) {
		getal = g;
		priemgetal = true;
	}
	
	public void berekenPriemgetal() {
		for(int i = 2; i < getal; i++) {
			System.out.print(i);
			if((getal % i) == 0) {
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
