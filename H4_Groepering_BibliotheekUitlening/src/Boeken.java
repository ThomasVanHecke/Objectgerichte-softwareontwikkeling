import java.util.LinkedList;
import java.util.List;

public class Boeken {
	private List<Boek> boekenLijst;
	
	public Boeken() {
		this.boekenLijst = new LinkedList<Boek>();
	}

	public List<Boek> getBoekenLijst() {
		return this.boekenLijst;
	}

	public void voegToe(Boek boek) {
		this.boekenLijst.add(boek);
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for(Boek boek: this.boekenLijst) {
			sb.append("Boek" + i + " " + boek.toString() + System.lineSeparator());
			i++;
		}
		return sb.toString();
	}
	
}
