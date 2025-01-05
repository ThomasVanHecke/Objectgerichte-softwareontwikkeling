//Mathias Dupont
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Planeten {
	private Map<String, Planeet> planeten;
	
	public Planeten( ) {
		planeten = new HashMap<>();
	}
	public void voegPlaneetToe(Planeet p) {
		if (planeten.containsKey(p.getNaamPlaneet())) {
			System.out.println("al planeet met deze naam, wordt niet toegevoegd.");
		}
		else {
			planeten.put(p.getNaamPlaneet(), p);
		}
	}
	public Planeet getPlaneet(String naam) {
		Planeet p = planeten.get(naam);
		if (p==null) {
			System.out.println("Geen lid met dit nummer.");
		}
		return p;
	}
	
	public void sorteerOpNaam() {
		//Collections.sort(planeten.get(), new ComparatorPlaneetImplementatie);
	}
	@Override
	public String toString() {
		return "Planeten [planeten=" + planeten + "]";
	}
	
	
}