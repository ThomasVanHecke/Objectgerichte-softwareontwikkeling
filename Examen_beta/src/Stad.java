//Mathias Dupont
import java.util.Objects;

public class Stad {
	private String naam;
	private int aantalInwoners;
	
	public Stad(String naam, int aantalInwoners) {
		super();
		this.naam = naam;
		this.aantalInwoners = aantalInwoners;
	}
	
	public String getNaam() {
		return naam;
	}
	public int getAantalInwoners() {
		return aantalInwoners;
	}

	@Override
	public String toString() {
		return "Stad [naam=" + naam + ", aantalInwoners=" + aantalInwoners + "]";
	}
	
	
	
}