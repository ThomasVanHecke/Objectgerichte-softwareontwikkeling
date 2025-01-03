
public class XWing {
	private String naam;
	private Pilot pilot; // XWing heeft een piloot (heeft-een-relatie = aggregatie)
	private AstroDroid astroDroid; // XWing heeft een astrodroid (heeft-een-relatie = aggregatie)
	
	public XWing() {
		
	}
	
	public XWing(String naam) {
		this.naam = naam;
	}
	
	// Setting the link between the XWing and the given pilot reference to the object
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}
	
	// IDEM
	public void setAstroDroid(AstroDroid astroDroid) {
		this.astroDroid = astroDroid;
	}
	
	public void schrijf() {
		try {
			System.out.println(this.naam + " heeft als piloot " + this.pilot.getNaam() + " en als astrodroid " + this.astroDroid.getNaam() + ".");
		}
		catch(NullPointerException npe) {
			System.out.println(this.naam + " heeft geen piloot en geen astrodroid.");
		}
	}
	
	public void tanken(int aantalLiterBrandstof) {
		System.out.println("Er is " + aantalLiterBrandstof + "L brandstof bijgetankt.");
	}
}
