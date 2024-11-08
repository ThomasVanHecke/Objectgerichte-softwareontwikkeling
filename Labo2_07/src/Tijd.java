
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
	
	// instantie-methode
	public Tijd modulo12Tijd() {
		if(uurWaarde > 12) {
			return new Tijd((uurWaarde-12), minuutWaarde, secondWaarde); // attributen van object (die methode oproept) blijven onveranderd
		}
		
		else {
			return new Tijd(uurWaarde, minuutWaarde, secondWaarde); // attributen van object (die methode oproept) blijven onveranderd
		}
	}
	
	public void telopTijd(Tijd t) {
		if(t.uurWaarde+uurWaarde < 24) {
			if(t.minuutWaarde+minuutWaarde < 60) {
				if(t.secondWaarde+secondWaarde < 60) {
					uurWaarde += t.uurWaarde;
					minuutWaarde += t.minuutWaarde;
					secondWaarde += t.secondWaarde;
				}
				
				else if(t.secondWaarde+secondWaarde >= 60) {
					uurWaarde += t.uurWaarde;
					minuutWaarde += (t.minuutWaarde + 1);
					secondWaarde = (t.secondWaarde + secondWaarde) - 60;
				}
			}
			
			else if(t.minuutWaarde+minuutWaarde >= 60) {
				if(t.secondWaarde+secondWaarde < 60) {
					uurWaarde += (t.uurWaarde + 1);
					minuutWaarde = (t.minuutWaarde+minuutWaarde-60);
					secondWaarde += t.secondWaarde;
				}
				
				else if(t.secondWaarde+secondWaarde >= 60) {
					uurWaarde += (t.uurWaarde+1);
					minuutWaarde = ((t.minuutWaarde+minuutWaarde-60) + 1);
					secondWaarde = (t.secondWaarde + secondWaarde) - 60;
				}
			}
		}
		
		else if(t.uurWaarde+uurWaarde >= 24) {
			if(t.minuutWaarde+minuutWaarde < 60) {
				if(t.secondWaarde+secondWaarde < 60) {
					uurWaarde = (t.uurWaarde+uurWaarde-24);
					minuutWaarde += t.minuutWaarde;
					secondWaarde += t.secondWaarde;
				}
				
				else if(t.secondWaarde+secondWaarde >= 60) {
					uurWaarde = (t.uurWaarde+uurWaarde-24);
					minuutWaarde += (t.minuutWaarde + 1);
					secondWaarde = (t.secondWaarde + secondWaarde) - 60;
				}
			}
			
			else if(t.minuutWaarde+minuutWaarde >= 60) {
				if(t.secondWaarde+secondWaarde < 60) {
					uurWaarde = (t.uurWaarde+uurWaarde-24 + 1);
					minuutWaarde = (t.minuutWaarde+minuutWaarde-60);
					secondWaarde += t.secondWaarde;
				}
				
				else if(t.secondWaarde+secondWaarde >= 60) {
					uurWaarde = (t.uurWaarde+uurWaarde-24+1);
					minuutWaarde = ((t.minuutWaarde+minuutWaarde-60) + 1);
					secondWaarde = (t.secondWaarde + secondWaarde) - 60;
				}
			}
		}
	}
}