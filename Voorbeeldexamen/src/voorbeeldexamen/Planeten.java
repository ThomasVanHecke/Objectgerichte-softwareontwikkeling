package voorbeeldexamen;

import java.util.LinkedList;
import java.util.List;

public class Planeten {
	private List<Planeet> planeten; //groepering Planeet
	
	public Planeten() {
		this.planeten = new LinkedList<Planeet>();
	}
	
	public void voegPlaneetToe(Planeet planeet) {
		this.planeten.add(planeet);
	}

	public void schrijf() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Planeet p: this.planeten) {
			sb.append(p.toString() + System.lineSeparator());
		}
		return sb.toString();
	}

	public Planeet getPlaneet(String string) {
		boolean gevonden = false;
		int index = 0;
		while(index < this.planeten.size()) {
			if(this.planeten.get(index).getNaam().compareTo(string) == 0) {
				gevonden = true;
				break;
			}
			else {
				index ++;
			}
		}
		if(gevonden) {
			return this.planeten.get(index);
		}
		else {
			return null;
		}
	}
}