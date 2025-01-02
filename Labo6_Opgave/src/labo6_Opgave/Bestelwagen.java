package labo6_Opgave;
import java.util.List;

public class Bestelwagen {
	
//attributen niet wijzigen en geen toevoegen
	
	
	private int nummer ;
	private int totaalVolume ;
	private int ingenomenVolume ;
	private String regio ;
	private Pakjes teLeveren ;

	public Bestelwagen(int nummer, int totaalVolume) {
		this.nummer = nummer;
		this.totaalVolume = totaalVolume;
		this.ingenomenVolume = 0;
		this.regio = "Onbepaald";
		this.teLeveren = new Pakjes();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		//System.out.println("toString Bestelwagen");
		
		// Dit zal niet werken want er moet nog een object aangemaakt worden van de klasse Pakjes
		sb.append(this.nummer + "/" + this.totaalVolume + "/" + this.ingenomenVolume + "/" + this.regio + "/" + this.teLeveren);
		
		return sb.toString();
	}

	public String getRegio() {
		return this.regio;
	}

	public int getIngenomenVolume() {
		return this.ingenomenVolume;
	}
	
	public int berekenIngenomenVolume(int volume) {
		this.ingenomenVolume += volume;
		return this.ingenomenVolume;
	}

	public int getTotaalVolume() {
		return this.totaalVolume;
	}

	public List<Pakje> getPakjes() {
		return this.teLeveren.pakjes;
	}

	public void setIngenomenVolume(int berekenIngenomenVolume) {
		this.ingenomenVolume = berekenIngenomenVolume;
		
	}

	public void setRegio(int i, List<Pakje> pakjesOpRegioEnVolume) {
		this.regio = pakjesOpRegioEnVolume.get(i).getRegio();
		
	}
	
	public void resetBestelwagen() {
		this.ingenomenVolume = 0;
		this.regio = "Onbepaald";
		
		while(this.teLeveren.pakjes.removeAll(getPakjes()));
	}

}
