import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Wedstrijd {
	private List<Atleet> atleten; //groepering Atleet

	public Wedstrijd() {
		this.atleten = new LinkedList<Atleet>();
	}
	
	public void setAantalSchietBeurten(int aantalSchietBeurten) {
		SchietBeurten.setAantalSchietBeurten(aantalSchietBeurten);
	}

	public void voegAtleetToe(Atleet atleet) {
		this.atleten.add(atleet);
	}

	public void schrijf() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Atleet a: this.atleten) {
			sb.append(a.toString() + System.lineSeparator());
		}
		return sb.toString();
	}

	public String getStartLijst() {
		this.sorteerOpStartNummer();
		return this.toString();
	}
	
	public List<Atleet> sorteerOpStartNummer(){
		Collections.sort(this.atleten, new Comparator<Atleet>() {
			public int compare(Atleet t1, Atleet t2) {
				return t1.vergelijkStartNummer(t2);
			}
		});
		return this.atleten;
	}

	public void verwerkSchietBeurt(int nummerAtleet, int gemist) throws OnmogelijkeWaardeException{
		Atleet atleet = this.getAtleet(nummerAtleet);
		if(atleet != null) {
			atleet.getSchietBeurten().voegSchietBeurtToe(gemist);
		}
		else {
			System.out.println("Deze atleet bestaat niet.");
		}
		
	}
	
	public Atleet getAtleet(int nummerAtleet) {
		boolean gevonden = false;
		int index = 0;
		while(index < this.atleten.size()) {
			if(this.atleten.get(index).getStartNummer() == nummerAtleet) {
				gevonden = true;
				break;
			}
			else {
				index ++;
			}
		}
		if(gevonden) {
			return this.atleten.get(index);
		}
		else {
			return null;
		}
	}

	public void verwerkFinish(int nummerAtleet, double eindTijd) throws OnmogelijkeWaardeException{
		Atleet atleet = this.getAtleet(nummerAtleet);
		if(atleet != null) {
			atleet.voegEindTijdToe(eindTijd);
		}
		else {
			System.out.println("Deze atleet heeft nooit meegedaan.");
		}
		
	}

	public void verwerkNietVetrokken(int nummerAtleet) throws OnmogelijkeWaardeException {
		Atleet atleet = this.getAtleet(nummerAtleet);
		atleet.voegEindTijdToe(-2);
		
	}
	
	public String toStringResultaat() {
		StringBuilder sb = new StringBuilder();
		List<Atleet> atletenPlaatsNummer = this.sorteerPlaatsNummer();
		int plaatsnummer = 1;
		Atleet winnaar = atletenPlaatsNummer.get(0);
		for(Atleet a: atletenPlaatsNummer) {
			sb.append(plaatsnummer + "," + a.toStringResultaat(winnaar) + System.lineSeparator());
			plaatsnummer ++;
		}
		return sb.toString();
	}
	
	public List<Atleet> sorteerPlaatsNummer() {
		List<Atleet> atletenVertrokkenAangekomen = new LinkedList<Atleet>();
		for(Atleet a: this.atleten) {
			if(a.getEindTijd() != -2) {
				atletenVertrokkenAangekomen.add(a);
			}
		}
		Collections.sort(atletenVertrokkenAangekomen, (Atleet t1, Atleet t2) -> t1.vergelijkScore(t2));
		return atletenVertrokkenAangekomen;
	}
}
