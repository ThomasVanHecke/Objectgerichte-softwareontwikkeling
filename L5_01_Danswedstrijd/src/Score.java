public class Score {
	
	private int waarde;
	private JuryLid jury;
	
	// Default constructor
	public Score() {
		waarde = 0;
		jury = null;
	}
	
	// Two parameter constructor
	public Score(int waarde, JuryLid jury) {
		this.waarde = waarde;
		this.jury = jury;
	}
	
	// Getter
	public int getWaarde() {
		return waarde;
	}
	
	// Setter
	public void setWaarde(int waarde) {
		this.waarde = waarde;
	}
	
	// Getter
	public JuryLid getJury() { // Returntype is a class (Jurylid)
		return jury;
	}

	// Setter
	public void setJury(JuryLid jury) {
		this.jury = jury;
	}

	@Override
	public String toString() {
		return System.getProperty("line.separator") + "\t"+ waarde + "\t\t("+ jury.toString() + ")";
	}
	
	
}
