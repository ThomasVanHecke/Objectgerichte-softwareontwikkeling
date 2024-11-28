import java.util.ArrayList;
import java.util.List;


public class JuryLedenLijst {

	private List<JuryLid> juryLeden;
	
	// Default constructor
	public JuryLedenLijst(){
		juryLeden = new ArrayList<JuryLid>();
	}
	
	// Getter
	public int getAantalJuryLeden(){
		return juryLeden.size();
	}
	
	// Getter
	public JuryLid getJuryLid(int index){
		return juryLeden.get(index);
	}
	
	public void voegJuryLidToe(JuryLid lid){
		juryLeden.add(lid);
	}
	
	public void wijzigJurylidOpNaam(String orgineel, String nieuw, JuryLedenLijst jL) {
		int index = jL.zoekJurylidOpNaam(orgineel);
		JuryLid j = jL.getJuryLid(index);
		j.setNaam(nieuw);
	}
	
	public int zoekJurylidOpNaam(String naam) {
		int index = 0;
		
		for(JuryLid j : juryLeden) {
			if(j.getNaam().equals(naam)) {
				return index;
			}
			
			// Always increment index
			index ++;
		}
		
		// If no index returned return -1
		return -1;
	}
	public String toString() {
		StringBuffer hulp = new StringBuffer();
		//int aantal = juryLeden.size();
		//for(int i=0; i<aantal; i++){
		//	JuryLid lid = juryLeden.get(i);
		//	hulp.append(lid.toString() + System.getProperty("line.separator"));
		//}
		for (JuryLid lid:juryLeden)
			hulp.append(lid.toString() + System.getProperty("line.separator"));
		return hulp.toString();
	}
}
