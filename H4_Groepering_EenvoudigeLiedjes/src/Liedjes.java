import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Liedjes {
	private List<Lied> liedjes;
	
	public Liedjes() {
		this.liedjes = new LinkedList<Lied>();
	}
	
	public void voegLiedToe(Lied l) {
		this.liedjes.add(l);
	}
	
	public void sorteerOpTitel() {
		Collections.sort(liedjes, new Comparator<Lied>() {
			public int compare(Lied l1, Lied l2) {
				return l1.vergelijkTitel(l2);
			}
		});
	}
	
	public void sorteerOpDuurMetComparator() {
		Collections.sort(liedjes, new ComparatorVoorDuur());
	}
	
	public void sorteerOpDuurMetLambda() {
		Collections.sort(liedjes, (Lied l1, Lied l2) -> l1.vergelijkDuur(l2));
	}
	
	public Liedjes getGeselecteerdeLiedjesMetInTitel(String titel) {
		Liedjes geselecteerdeLiedjes = new Liedjes();
		
		for(Lied l: this.liedjes) {
			if(l.getTitel().compareTo(titel) == 0) {
				geselecteerdeLiedjes.voegLiedToe(l);
			}
		}
		
		return geselecteerdeLiedjes;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Lied l: this.liedjes) {
			sb.append(l + System.lineSeparator());
		}
		return sb.toString();
				
	}
}
