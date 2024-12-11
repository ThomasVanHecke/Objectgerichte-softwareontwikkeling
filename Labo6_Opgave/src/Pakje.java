import java.util.*;

public class Pakje {
	
//attributen niet wijzigen en geen toevoegen
	
	private int id ;
	private String regio ;
	private int volume ;
	private Toestand toestand ;
	
	public Pakje() {
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setRegio(String regio) {
		this.regio = regio;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void setToestand(int toestand) {
		switch (toestand) {
		case 0: this.toestand = Toestand.AANWEZIG; break;
		case 1: this.toestand = Toestand.TOEGEKEND; break;
		case 2: this.toestand = Toestand.GELEVERD; break;
		}
	}
}
