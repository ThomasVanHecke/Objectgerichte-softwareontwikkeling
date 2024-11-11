
import java.util.List;
import java.util.LinkedList;

public class IbanLijst {
	private List<String> volledigeLijst;
	private List<String> geldigeLijst;
	
	// Default constructor
	public IbanLijst() {
		this.volledigeLijst = new LinkedList<String>();
		this.geldigeLijst = new LinkedList<String>();
	}
	
	// Voegtoe-method
	public void voegToeVolledigeLijst(String s) {
		this.volledigeLijst.add(s);
	}
	
	public void voegToeGeldigeLijst(String s) {
		this.geldigeLijst.add(s);
	}
	
	// ToString-methode
	public String toString() {
		StringBuilder sB1 = new StringBuilder(this.volledigeLijst.size()*50);
		StringBuilder sB2 = new StringBuilder(this.geldigeLijst.size()*50);
		String nl = System.getProperty("line.separator");
		for (String s : this.volledigeLijst) sB1.append(s).append(nl);
		for (String s : this.geldigeLijst) sB2.append(s).append(nl);
		return sB1.toString() + sB2.toString();
	}
	
	// Getter-method
	public List<String> getVolledigeLijst(){
		return this.volledigeLijst;
	}
	
	public List<String> getGeldigeLijst(){
		return this.geldigeLijst;
	}
}
