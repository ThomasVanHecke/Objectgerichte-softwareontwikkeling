package Bibliotheek;
import java.util.HashMap;
import java.util.Map;

/* HASHMAP UITLENINGEN IS EEN STATISCHE VARIABELE(=KLASSEVARIABELE)
 * => OPVRAGEN VIA KLASSE
 *  */

public class Uitleningen {
	private Map<Boek, Lid> uitleningen;
	
	public Uitleningen() {
		this.uitleningen = new HashMap<Boek, Lid>();
	}
	
	public void voegUitleningToe(Lid l, Boek b) {
		this.uitleningen.put(b, l);
		this.controleerVoegUitleningToe(l, b);
	}
	
	public void controleerVoegUitleningToe(Lid l, Boek b) {
		boolean containsKey = this.uitleningen.containsKey(b);
		System.out.println("ContainsKey: " + containsKey);
		boolean containsValue = this.uitleningen.containsValue(l);
		System.out.println("ContainsValue: " + containsValue);
		
		if(containsKey && containsValue) {
			System.out.println("Key and Value in map.");
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("Uitleningen: " + System.lineSeparator());
		sb.append(this.uitleningen.entrySet() + System.lineSeparator());
		return sb.toString();
	}
	
	public boolean verwijderUitlening(Lid l, Boek b) {
		try {
			System.out.println(l.toString() + System.lineSeparator());
			System.out.println(b.toString() + System.lineSeparator());
			
			boolean containsKey = this.uitleningen.containsKey(b);
			System.out.println("ContainsKey: " + containsKey);
			boolean containsValue = this.uitleningen.containsValue(l);
			System.out.println("ContainsValue: " + containsValue);
			
			if(containsKey && containsValue) {
				System.out.println("Key and Value in map.");
			}
			boolean entryRemoved = this.uitleningen.remove(b, l);
			//System.out.println(true);
			return entryRemoved;
		}
		catch(UnsupportedOperationException uoe) {
			System.out.println(uoe.getMessage());
			return false;
		}
		catch(ClassCastException cce) {
			System.out.println(cce.getMessage());
			return false;
		}
		catch(NullPointerException npe) {
			System.out.println(npe.getMessage());
			return false;
		}
	}
}
