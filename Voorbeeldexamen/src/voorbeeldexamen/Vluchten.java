package voorbeeldexamen;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Vluchten {
	private List<Vlucht> vluchten; //groepering Vlucht
	
	public Vluchten() {
		this.vluchten = new LinkedList<Vlucht>();
	}

	public void voegVluchtToe(Vlucht v) {
		this.vluchten.add(v);
	}
	
	public void schrijf() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Vlucht v: this.vluchten) {
			sb.append(v.toString() + System.lineSeparator());
		}
		return sb.toString();
	}

	public void sorteer() {
		Collections.sort(this.vluchten, (Vlucht v1, Vlucht v2) -> v1.vergelijkVertrek(v2));
	}

	public Vlucht getVlucht(int i) {
		return this.vluchten.get(i);
	}

	public List<String> getNamenAankomstenVertrekkendVan(String vertrekPlaneet) {
		List<String> aankomstNamen = new LinkedList<String>();
		for(Vlucht v: this.vluchten) {
			if(v.getVertrek().getNaam().compareTo(vertrekPlaneet) == 0) {
				aankomstNamen.add(v.getAankomst().getNaam());
			}
		}
		return aankomstNamen;
	}
}
