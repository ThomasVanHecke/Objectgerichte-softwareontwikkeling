package labo6_Opgave;
import java.util.*;

public class Pakje {
	
//attributen niet wijzigen en geen toevoegen
	
	private int id ;
	private String regio ;
	private int volume ;
	private Toestand toestand ;
	
	public Pakje() {
		
	}
	
	public Pakje(int id, String regio, int volume) {
		this.id = id;
		this.regio = regio;
		this.volume = volume;
		this.toestand = Toestand.AANWEZIG;
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
	
	public Toestand getToestand() {
		return this.toestand;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getRegio() {
		return this.regio;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public String toString() {
		
		//System.out.println("toString Pakje");
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.id + "/" + this.regio + "/" + this.volume + "/" + this.toestand);
		
		return sb.toString();
	}

	public int vergelijkRegio(Pakje p2) {
		String regio1 = this.getRegio();
		String regio2 = p2.getRegio();
		
		if(regio1.compareTo(regio2) == 0) {
			return this.vergelijkVolumeZelfdeRegio(p2);
		}
		
		else {
			return regio1.compareTo(regio2);
		}
	}

	public int vergelijkVolumeZelfdeRegio(Pakje p2) {
		int volume1 = this.getVolume();
		int volume2 = p2.getVolume();
		
		return Integer.compare(volume2, volume1);
	}
}
