package Kaarten;

public class Kaart {
	private Waarde waarde; // Unidirectionele associatie
	private Soort soort; // IDEM
	
	public Kaart(Waarde waarde, Soort soort) {
		this.waarde = waarde;
		this.soort = soort;
	}
	
	public boolean isHogerDan(Kaart k) {
		if(k.soort.compareTo(this.soort) == 0) {
			if(k.waarde.compareTo(this.waarde) < 0) { // Means k.waarde comes before this.waarde in the enum-class => k.waarde is lower in value than this.waarde
				return true;
			}
			else {
				return false;
			}
		}
		if(k.soort.compareTo(this.soort) > 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
