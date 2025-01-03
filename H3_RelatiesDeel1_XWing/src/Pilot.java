
public class Pilot {
	private String voornaam, achternaam;
	
	public Pilot() {
		
	}
	
	public Pilot(String voornaam, String achternaam) {
		this.voornaam = voornaam;
		this.achternaam = achternaam;
	}

	public String getNaam() {
		StringBuilder sb = new StringBuilder(this.voornaam + " " + this.achternaam);
		
		return sb.toString();
	}
	
}
