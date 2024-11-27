import java.util.ArrayList;
import java.util.List;

public class Deelnemer{
	
	private int inschrijvingsNummer;
	private String naam;
	private List<Score> scoreLijst;
	
	// Default constructor
	public Deelnemer() {
		inschrijvingsNummer = 0;
		naam = null;
		scoreLijst = new ArrayList<Score>();
	}
	
	// Parameterized constructor
	public Deelnemer(int inschrijvingsNummer, String naam) {
		this.inschrijvingsNummer = inschrijvingsNummer;
		this.naam = naam;
		scoreLijst = new ArrayList<Score>(); 
	}
	
	// Getter
	public String getNaam() {
		return naam;
	}
	
	// Setter
	public void setNaam(String naam) {
		this.naam = naam;
	}

	// Getter
	public int getInschrijvingsNummer() {
		return inschrijvingsNummer;
	}
	
	// Setter
	public void setInschrijvingsNummer(int inschrijvingsNummer) {
		this.inschrijvingsNummer = inschrijvingsNummer;
	}
	
	// Getter
	public List<Score> getScorelijst() {
		return scoreLijst;
	}
	
	// Setter
	public void setScoreLijst(List<Score> scorelijst) {
		this.scoreLijst = scorelijst;
	}
	
	public void voegScoreToe(Score s){
		scoreLijst.add(s);
	}
	
	public boolean checkInschrijvingsNummer(int inschrijvingsNummer){
		return this.inschrijvingsNummer == inschrijvingsNummer;
	}
	
	// Getter
	public int getTotaleScore(){
		int totaal = 0;
		//int aantal = scoreLijst.size();
		//for(int i=0; i<aantal; i++){
		//	Score s = scoreLijst.get(i); 
		//	totaal += s.getWaarde();
		//}
		for (Score s:scoreLijst)
			totaal += s.getWaarde();
		return totaal;
	}
	
	@Override
	public String toString() {
		StringBuffer hulp = new StringBuffer(inschrijvingsNummer + ". " + naam+ "\t");
		//int aantal = scoreLijst.size();
		//for(int i=0; i<aantal; i++){
		//	Score s = scoreLijst.get(i);
		//	hulp.append(s.toString());
		//}
		for (Score s:scoreLijst)
			hulp.append(s.toString());
		return hulp.toString() + System.getProperty("line.separator");
	}
	
	
	
	
	
	
}
