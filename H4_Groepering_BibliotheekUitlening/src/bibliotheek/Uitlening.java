package bibliotheek;

public class Uitlening {

	private Lid lid;
	private Boek boek;

	public Uitlening(Lid l, Boek b) {
		this.lid = l;
		this.boek = b;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(this.boek.toString() + " -> " + this.lid.toString());
		return sb.toString();
	}

	public Boek getBoek() {
		return this.boek;
	}

	public Lid getLid() {
		return this.lid;
	}

	public String uitSchrijven() {
		StringBuilder sb = new StringBuilder(this.boek.uitSchrijven() + "," + this.lid.uitSchrijven() + System.lineSeparator());
		return sb.toString();
	}

	public boolean teLaat() {
		if(this.boek.getCode().contains("B")) {
			return true;
		}
		else {
			return false;
		}
	}
}
