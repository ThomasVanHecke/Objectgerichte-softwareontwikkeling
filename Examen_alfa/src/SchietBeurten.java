import java.util.LinkedList;
import java.util.List;

public class SchietBeurten {
	private static int totaalAantalSchietBeurten;
	private List<SchietBeurt> schietBeurten; //groepering SchietBeurt
	
	public static void setAantalSchietBeurten(int aantal) {
		totaalAantalSchietBeurten = aantal;
	}
	
	public SchietBeurten() {
		this.schietBeurten = new LinkedList<SchietBeurt>();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getAantalGemisteSchoten());
		return sb.toString();
	}
	
	public void voegSchietBeurtToe(int gemist) throws OnmogelijkeWaardeException{
		SchietBeurt schietBeurt = new SchietBeurt(gemist);
		if(this.schietBeurten.size() == SchietBeurten.totaalAantalSchietBeurten) {
			throw new OnmogelijkeWaardeException("Deze atleet het geen schietbeurten meer over.");
		}
		else {
			this.schietBeurten.add(schietBeurt);
		}
	}

	public int getAantalGemisteSchoten() {
		int gemisteSchoten = 0;
		for(SchietBeurt s: this.schietBeurten) {
			gemisteSchoten += s.getGemisteSchoten();
		}
		return gemisteSchoten;
	}
}
