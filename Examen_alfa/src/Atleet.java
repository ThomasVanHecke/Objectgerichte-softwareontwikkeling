public class Atleet { 
	private int startNummer;
	private String naam;
	private String land;
	private double startTijd;
	private double eindTijd;
	private SchietBeurten schietBeurten;
	
	public Atleet(int startnummer, String naam, String land, double starttijd) {
		this.startNummer = startnummer;
		this.naam = naam;
		this.land = land;
		this.startTijd = starttijd;
		this.schietBeurten = new SchietBeurten();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(this.startNummer + "," + this.naam + "," + this.land + "," + this.startTijd + "," + this.eindTijd + ",");
		if(this.schietBeurten != null) {
			sb.append(this.schietBeurten.toString());
		}
		return sb.toString();
	}

	public int vergelijkStartNummer(Atleet t2) {
		return Integer.compare(this.startNummer, t2.getStartNummer());
	}
	
	public int getStartNummer() {
		return this.startNummer;
	}
	
	public SchietBeurten getSchietBeurten() {
		return this.schietBeurten;
	}

	public void voegEindTijdToe(double eindTijd) throws OnmogelijkeWaardeException{
		if(eindTijd != -2 && eindTijd < this.eindTijd) {
			throw new OnmogelijkeWaardeException("Deze atleet finisht voor zijn starttijd.");
		}
		else {
			this.eindTijd = eindTijd;
		}
	}
	
	// Laag naar Hoog
	public int vergelijkScore(Atleet t) {
		double score1 = this.berekenScore();
		double score2 = t.berekenScore();
		return Double.compare(score1, score2);
	}
	
	public double berekenScore() {
		double totaleTijd = this.eindTijd - this.startTijd;
		int totaalGemisteSchoten = this.schietBeurten.getAantalGemisteSchoten();
		double tijdOptellen = totaalGemisteSchoten * 30;
		totaleTijd += tijdOptellen;
		return totaleTijd;
	}

	public String toStringResultaat(Atleet a) {
		StringBuilder sb = new StringBuilder(this.startNummer + "," + this.naam + "," + this.land + "," + this.schietBeurten.getAantalGemisteSchoten() + "," + this.tijdVerschil(a));
		return sb.toString();
	}
	
	public int tijdVerschil(Atleet a) {
		int tijdVerschil = (int) (this.berekenScore() - a.berekenScore());
		return tijdVerschil;
	}

	public int getEindTijd() {
		return (int) this.eindTijd;
	}
}
