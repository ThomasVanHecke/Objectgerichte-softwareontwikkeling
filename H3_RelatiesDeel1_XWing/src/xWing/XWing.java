package xWing;

public class XWing {
	private String naam;
	private Pilot pilot; // XWing heeft een piloot (heeft-een-relatie = aggregatie)
	private AstroDroid astroDroid; // XWing heeft een astrodroid (heeft-een-relatie = aggregatie)
	private float brandstofPercentage;
	private float huidigBrandstof, maxBrandstof;
	
	
	public XWing() {
		
	}
	
	public XWing(String naam) {
		this.naam = naam;
		this.maxBrandstof = 100;
		this.huidigBrandstof = 0;
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
			if(this.pilot == null && this.astroDroid != null) {
				System.out.println(this.naam + " heeft geen piloot en" + this.astroDroid.getNaam() + " als astrodroid.");
			}
			else if(this.pilot != null && this.astroDroid == null) {
				System.out.println(this.naam + " heeft als piloot " + this.pilot.getNaam() + " en heeft geen astrodroid");
			}
			else {
				System.out.println(this.naam + " heeft als piloot " + this.pilot.getNaam() + " en als astrodroid " + this.astroDroid.getNaam());
			}
		}
	}
	
	public void tanken(float aantalLiterBrandstof) {
		float tijdelijkHuidigBrandstof = aantalLiterBrandstof + this.huidigBrandstof;
		if(tijdelijkHuidigBrandstof > this.maxBrandstof) {
			this.huidigBrandstof = this.maxBrandstof;
			this.berekenBrandstofPercentage();
		}
		else {
			this.huidigBrandstof += aantalLiterBrandstof;
			this.berekenBrandstofPercentage();
		}
	}
	
	public void vertrek() throws GeenPilootException, NietVoldoendeBrandstofException{
		this.berekenBrandstofPercentage();
		if(this.pilot == null) {
			throw new GeenPilootException(this.naam + " heeft geen piloot!");
			
		}
		else if(this.brandstofPercentage < 20) {
			throw new NietVoldoendeBrandstofException(this.naam + " heeft onvoldoende brandstof!");
		}
		System.out.println("Fijne reis " + this.naam + " met piloot: " + this.pilot.getNaam() + " er zit nog " + brandstofPercentage + " procent brandstof in de tank.");
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(this.pilot != null && this.astroDroid != null) {
			sb.append(this.naam + "," + this.pilot.getNaam() + "," + this.astroDroid.getNaam() + "," + this.maxBrandstof + "L," + this.huidigBrandstof + "L," + this.brandstofPercentage + "%");
		}
		else if(this.pilot != null && this.astroDroid == null) {
			sb.append(this.naam + "," + this.pilot.getNaam() + "," + "geen astrodroid" + "," + this.maxBrandstof + "L," + this.huidigBrandstof + "L," + this.brandstofPercentage + "%");
		}
		else if(this.pilot == null && this.astroDroid != null) {
			sb.append(this.naam + "," + "geen piloot" + "," + this.astroDroid.getNaam() + "," + this.maxBrandstof + "L," + this.huidigBrandstof + "L," + this.brandstofPercentage + "%");
		}
		else {
			sb.append(this.naam + "," + "geen piloot" + "," + "geen astrodroid" + "," + this.maxBrandstof + "L," + this.huidigBrandstof + "L," + this.brandstofPercentage + "%");
		}
		return sb.toString();
	}
	public void berekenBrandstofPercentage() {
		this.brandstofPercentage = (this.huidigBrandstof/this.maxBrandstof) * 100;
	}
}
