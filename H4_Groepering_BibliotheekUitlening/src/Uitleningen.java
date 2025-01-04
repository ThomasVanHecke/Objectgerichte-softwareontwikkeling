import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Uitleningen {
	private List<Uitlening> uitleningen;
	private final double BOETE_PER_DAG_IN_EURO = 0.10;
	private final int MAX_DUUR_UITLENING_IN_DAGEN = 31;
	
	public Uitleningen() {
		uitleningen = new ArrayList<>();
	}

	public void voegUitleningToe(Lid l, Boek b) {
		Uitlening u =  new Uitlening(l,b);
		voegUitleningToe(u);
	}
	
	public void voegUitleningToe(Uitlening u) {
		if (!uitleningen.contains(u)) uitleningen.add(u);
		else System.out.println("Je hebt dit boek al uitgeleend.");
	}
	
	public Uitlening getUitlening(Lid l, Boek b) {
		Uitlening u = null;
		int i=0;
		boolean gevonden = false;
		while (i<uitleningen.size() && !gevonden) {
			u = uitleningen.get(i);
			if (u.heeftLidBoek(l,b)) gevonden = true;
			else i++;
		}
		return u;
	}
	
	public double verwijderUitleningEnBepaalBoete(Lid l, Boek b) {
		double boete = 0.0;
		Uitlening u = null;
		int i=0;
		boolean gevonden = false;
		while (i<uitleningen.size() && !gevonden) {
			u = uitleningen.get(i);
			if (u.heeftLidBoek(l,b)) gevonden = true;
			else i++;
		}
		if (gevonden) {
			int aantalDagenTeLaat = Math.max(0, u.getAantalDagenUitgeleend(LocalDateTime.now()) - MAX_DUUR_UITLENING_IN_DAGEN);
			boete = BOETE_PER_DAG_IN_EURO * aantalDagenTeLaat;
			uitleningen.remove(i);
		}
		return boete;
	}
	
	public String toStringCSV() {
		StringBuilder sb = new StringBuilder();
		String nl = System.getProperty("line.separator");
		for (Uitlening u : uitleningen) sb.append(u.toStringCSV()).append(nl);
		return sb.toString();
	}

	public Uitleningen getUitleningen(Predicate<Uitlening> pred) {
		Uitleningen res = new Uitleningen();
		for (Uitlening u : uitleningen) if (pred.test(u)) res.voegUitleningToe(u);
		return res;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String nl = System.getProperty("line.separator");
		for (Uitlening u : uitleningen) sb.append(u).append(nl);
		return sb.toString();
	}
	
}
