
public class Tijd {
	private int uurWaarde;
	private int minuutWaarde;
	private int secondWaarde;
	
	// default-constructor
	public Tijd() {
		uurWaarde = 0;
		minuutWaarde = 0;
		secondWaarde = 0;
	}
	
	// drie parameter-constructor
	public Tijd(int uW, int mW, int sW) {
		uurWaarde = uW;
		minuutWaarde = mW;
		secondWaarde = sW;
	}
	
	// copy-constructor
	public Tijd(Tijd t) {
		uurWaarde = t.uurWaarde;
		minuutWaarde = t.minuutWaarde;
		secondWaarde = t.secondWaarde;
	}
	
	public void schrijfTijd() {
		System.out.println("Tijd: " + uurWaarde + "/" + minuutWaarde + "/" + secondWaarde);
	}
	
	public void resetOpNul() {
		uurWaarde = 0;
		minuutWaarde = 0;
		secondWaarde = 0;
	}
	
	public void setTijd(Tijd t) {
		uurWaarde = t.uurWaarde;
		minuutWaarde =  t.minuutWaarde;
		secondWaarde = t.secondWaarde;
	}
}