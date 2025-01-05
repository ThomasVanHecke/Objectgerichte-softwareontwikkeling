//Mathias Dupont
import java.util.HashMap;
import java.util.Map;

public class Steden {
	private Map<String, Stad> steden;
	
	public Steden() {
		steden = new HashMap<>() ;
	}
		
	public void voegStadToe(Stad s) {
		if (steden.containsKey(s.getNaam())) {
			System.out.println("Al stad met deze naam, wordt niet toegevoegd.");
		}
		else {
			steden.put(s.getNaam(), s);
		}
	}

	@Override
	public String toString() {
		return "Steden [steden=" + steden + "]";
	}
	
	
}