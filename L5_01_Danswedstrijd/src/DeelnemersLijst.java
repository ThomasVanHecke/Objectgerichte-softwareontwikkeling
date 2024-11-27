import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DeelnemersLijst {

	private List<Deelnemer> deelnemers;
	
	// Default constructor
	public DeelnemersLijst() {
		deelnemers = new ArrayList<Deelnemer>();
	}
	
	// Getters
	public Deelnemer getDeelnemer(int index){
		return deelnemers.get(index);
	}
	
	public int getAantalDeelnemers(){
		return deelnemers.size();
	}
	
	public Deelnemer getWinnaarDeelnemers() {
		// Holds the value of the biggest totaleScore so far
		int totaleScore = 0;
		
		// Holds the object with the biggest totaleScore
		Deelnemer w = null;
		
		// Looping through every object of the list deelnemers
		for(Deelnemer d : deelnemers) {
			if(d.getTotaleScore() > totaleScore) {
				totaleScore = d.getTotaleScore();
				w = d;
			}
		}
		
		// After we looped through every object return the object with the biggest totaleScore
		return w;
	}
	
	public List<Score> getScoresDeelnemer(Deelnemer d) {
		return d.getScorelijst();
	}
	
	public void voegDeelnemerToe(Deelnemer d){
		deelnemers.add(d);
	}
	
	public int zoekDeelnemerOpInschrijvingsNummer(int inschrijvingsNummer){
		int aantal = deelnemers.size();
		boolean gevonden = false;
		int i=0;
		while (i<aantal && !gevonden){ // ! = logical NOT -> !gevonden = not false = true
			Deelnemer d = deelnemers.get(i);
			if (d.checkInschrijvingsNummer(inschrijvingsNummer)) 
				gevonden = true;
			else 
				i++;
		}
		if (gevonden) return i; else return -1;
	}
	
	public int zoekDeelnemerOpNaam(String naam) {
		// We will loop trough every name in the list assuming that there are identical names in the list
		int index = 0;
		
		// Looping through every object in the list
		for(Deelnemer d : deelnemers) {
			if(d.getNaam().equals(naam)) {
				return index;
			}
			
			// Even if name found, index should be incremented afterwards
			index++;
		}
		
		// If no name found return -1
		return -1;
	}
	
	public void verwijderDeelnemer(int inschrijvingsNummer){
		int index = this.zoekDeelnemerOpInschrijvingsNummer(inschrijvingsNummer);
		if (index >= 0) deelnemers.remove(index);
	}

	public void sorteerOpNaamDeelnemer(){
		Collections.sort(deelnemers, new ComparatorVolgensNaamDeelnemer());
	}
	
	public void sorteerOpTotaleAflopendeScoreDeelnemer(){
		// nog te schrijven door student
		Collections.sort(deelnemers, new ComparatorVolgensTotaleScoreDeelnemer());
	}
	
	public void sorteerOpInschrijvingsNummerDeelnemer(){
		// nog te schrijven door student
		Collections.sort(deelnemers, new ComparatorVolgensInschrijvingsnummerDeelnemer());
	}
	
	@Override
	public String toString() {
		StringBuffer hulp = new StringBuffer();
		//int aantal = deelnemers.size();
		//for(int i=0; i<aantal; i++){
		//	Deelnemer d = deelnemers.get(i);
		//	hulp.append(d.toString());
		//}
		for (Deelnemer d:deelnemers)
			hulp.append(d.toString());
		return hulp.toString();
	}
	
	
}
