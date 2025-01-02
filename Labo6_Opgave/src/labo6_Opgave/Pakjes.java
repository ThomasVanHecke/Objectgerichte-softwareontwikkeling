package labo6_Opgave;
import java.util.List ;
import java.util.ArrayList ;
import java.util.*;



public class Pakjes {
	
//attributen niet wijzigen en geen toevoegen
	
	
	List <Pakje> pakjes ;
	
	// Default constructor
	public Pakjes() {
		
		pakjes = new ArrayList<Pakje>();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		//System.out.println("toString Pakjes");
		sb.append(this.pakjes);
		return sb.toString();
	}
	
	public List<Pakje> getPakjes() {
		return this.pakjes;
	}
	
	// WORKS
	public List<Pakje> getPakjesAanwezig(){
		List<Pakje> pakjesAanwezig = new ArrayList<Pakje>();
		for(Pakje p: this.pakjes) {
			if(p.getToestand() == Toestand.AANWEZIG) {
				pakjesAanwezig.add(p);
			}
		}
		
		return pakjesAanwezig;
	}
	
	// Does not work
	public List<Pakje> sorteerOpRegio(List<Pakje> pakjesAanwezig) {
		// Sorting method via anonieme innerklasse
		Collections.sort(pakjes, new Comparator<Pakje>() {
			public int compare(Pakje p1, Pakje p2) {
				return p1.vergelijkRegio(p2);
			}
		});
		return this.pakjes;
	}

	public void sorteerOpVolumeZelfdeRegio(List<Pakje> pakjesAanwezig) {
		// Sorting method via anonieme innerklasse
		Collections.sort(pakjes, new Comparator<Pakje>() {
			public int compare(Pakje p1, Pakje p2) {
				return p1.vergelijkVolumeZelfdeRegio(p2);
			}
		});
		
	}
}