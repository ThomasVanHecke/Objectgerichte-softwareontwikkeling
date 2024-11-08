
public class DrukPriemgetallen {
	private boolean priemgetal;
	
	public DrukPriemgetallen() { // Default constructor
		priemgetal = true; // Assuming every getal is a primenumber
	}
	
	public void setPriemgetal() { // Set-method (setter)
		priemgetal = true;
	}
	
	public boolean isPriem(int getal) {
		priemgetal = true; // na een false update -> priemgetal terug op true zetten!
		for(int i = 2; i < getal; i++) {
			if((getal % i) == 0) {
				priemgetal = false;
			}
		}
		return priemgetal;
	}
}
