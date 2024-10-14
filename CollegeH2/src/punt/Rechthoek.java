package punt;

public class Rechthoek {
	private double lengte, breedte; // goede gewoonte om attributen van een klasse private te zetten zodat er niet rechtstreeks mee geknoeid kan worden
	
	public double getOppervlak() {
		return lengte * breedte;
	}

	public double getOmtrek() {
		return 2*(lengte + breedte);
	}
	
	public double getLengte() {
		return lengte;
	}
	
	public void setLengte(double l) { // GEEN return-waarde => datatype = void
		lengte = (l>0) ? l : 1.0; // als l positief is dan l, anders 1
	}
	
	public double getBreedte() {
		return breedte;
	}
	
	public void setBreedte(double b) {
		breedte = (b>0) ? b : 1.0; 
	}
	
	public void schrijfGegevens() {
		System.out.println("De lengte is: " + lengte);
		System.out.println("De breedte is: " + breedte);
	}
	
}
