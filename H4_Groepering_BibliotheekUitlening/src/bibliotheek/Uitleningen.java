package bibliotheek;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Uitleningen {
	private List<Uitlening> uitleningen;
	
	public Uitleningen() {
		this.uitleningen = new LinkedList<Uitlening>();
	}

	public void voegUitleningToe(Lid l, Boek b) {
		Uitlening uitlening = new Uitlening(l, b);
		this.uitleningen.add(uitlening);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Uitlening u: this.uitleningen) {
			sb.append(u.toString() + System.lineSeparator());
		}
		return sb.toString();
	}

	public Boek getUitleningBoek(Boek b) {
		boolean gevonden = false;
		int index = 0;
		while(index < this.uitleningen.size()) {
			if(this.getUitleningViaIndex(index).getBoek().equals(b)) {
				gevonden = true;
				break;
			}
			else {
				index ++;
			}
		}
		if(gevonden) {
			return this.getUitleningViaIndex(index).getBoek();
		}
		else {
			return null;
		}
	}

	public Uitlening getUitleningViaIndex(int index) {
		return this.uitleningen.get(index);
	}

	public boolean verwijderUitlening(Lid l, Boek b) {
		Uitlening uitlening = this.getUitleningViaLidBoek(l, b);
		if( uitlening != null) {
			return this.uitleningen.remove(uitlening);
		}
		else {
			return this.uitleningen.remove(uitlening);
		}
		
	}
	
	public Uitlening getUitleningViaLidBoek(Lid l, Boek b) {
		if(this.getUitleningOpIndex(b) != -1) {
			int index = this.getUitleningOpIndex(b);
			Uitlening uitlening = this.getUitleningViaIndex(index);
			if(uitlening.getBoek().equals(b) && uitlening.getLid().equals(l)) {
				return uitlening;
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}

	public int getUitleningOpIndex(Boek b) {
		boolean gevonden = false;
		int index = 0;
		while(index < this.uitleningen.size()) {
			if(this.getUitleningViaIndex(index).getBoek().equals(b)) {
				gevonden = true;
				break;
			}
			else {
				index ++;
			}
		}
		if(gevonden) {
			return index;
		}
		return -1; // -1 indicates the book was not found
	}
	
	public String uitSchrijven() {
		StringBuilder sb = new StringBuilder();
		for(Uitlening u: this.uitleningen) {
			sb.append(u.uitSchrijven() + System.lineSeparator());
		}
		return sb.toString();
	}

	public Uitleningen getUitleningTeLaat() {
		Uitleningen uitleningenTeLaat = new Uitleningen();
		for(Uitlening utl: this.uitleningen) {
			if(utl.teLaat()) {
				uitleningenTeLaat.uitleningen.add(utl);
			}
		}
		return uitleningenTeLaat;
	}
}
