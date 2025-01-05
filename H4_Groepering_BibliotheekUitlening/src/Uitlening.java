import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Uitlening {
	private LocalDateTime tijdstip;
	private Lid lid;
	private Boek boek;
	
	public Uitlening(Lid lid, Boek boek) {
		this.tijdstip = LocalDateTime.now();
		this.lid = lid;
		this.boek = boek;
	}

	public boolean heeftLidBoek(Lid l, Boek b) {
		return lid.equals(l) && boek.equals(b);
	}
	
	public int getAantalDagenUitgeleend(LocalDateTime nu) {
		return (int) Duration.between(tijdstip, nu).toDays();
	}

	
	
	public int getAantalDagenTeLaat() {
		return Math.max(0, getAantalDagenUitgeleend(LocalDateTime.now()) - bibliotheek.MAX_DUUR_UITLENING_IN_DAGEN);
	}

	public boolean isTeLaat() {
		return getAantalDagenTeLaat()>0;
	}
	
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String tijd = tijdstip.format(formatter);
		return tijd+","+lid.toStringCSV()+","+boek.toStringCSV();
	}
	
	public String toStringCSV() {
		return tijdstip+","+lid.toStringCSV()+","+boek.toStringCSV();
	}
}
