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
