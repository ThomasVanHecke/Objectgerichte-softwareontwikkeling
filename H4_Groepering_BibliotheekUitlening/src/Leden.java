import java.util.LinkedList;
import java.util.List;

public class Leden {
	private List<Lid> ledenLijst;
	
	public Leden() {
		this.ledenLijst = new LinkedList<Lid>();
	}

	public List<Lid> getLedenLijst() {
		return this.ledenLijst;
	}

	public void voegToe(Lid l) {
		this.ledenLijst.add(l);
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for(Lid lid: this.ledenLijst) {
			sb.append("Lid" + i + " " + lid.toString() + System.lineSeparator());
			i++;
		}
		return sb.toString();
	}
}
