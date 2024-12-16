import java.util.List ;
import java.util.ArrayList ;



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
	
	// Does not work
	public void sorteerOpRegio() {
		List<Pakje> pakjesAanwezig = new ArrayList<Pakje>();
		for(Pakje p: this.pakjes) {
			if(p.getToestand() == Toestand.AANWEZIG) {
				pakjesAanwezig.add(p);
			}
		}
		
		pakjesAanwezig.sort(new sorteerRegio(pakjesAanwezig) {
			public int compare(Pakje p1, Pakje p2) {
				p1.vergelijk(p2);
			}
		});
	}
}