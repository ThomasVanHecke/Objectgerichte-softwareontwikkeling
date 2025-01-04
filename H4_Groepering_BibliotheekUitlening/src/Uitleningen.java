import java.util.HashMap;
import java.util.Map;

/* HASHMAP UITLENINGEN IS EEN STATISCHE VARIABELE(=KLASSEVARIABELE)
 * => OPVRAGEN VIA KLASSE
 *  */

public class Uitleningen {
	private static Map<Boek, Lid> uitleningen;
	
	public Uitleningen() {
		Uitleningen.uitleningen = new HashMap<Boek, Lid>();
	}
	
	public void voegUitleningToe(Lid l, Boek b) {
		Uitleningen.uitleningen.put(b, l);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("Uitleningen: " + System.lineSeparator());
		sb.append(Uitleningen.uitleningen.entrySet());
		return sb.toString();
	}
	
	public boolean verwijderUitlening(Lid l, Boek b) {
		if(Uitleningen.uitleningen.remove(b, l)) {
			//System.out.println(true);
			return true;
		}
		else {
			//System.out.println(false);
			return false;
		}
	}
}
