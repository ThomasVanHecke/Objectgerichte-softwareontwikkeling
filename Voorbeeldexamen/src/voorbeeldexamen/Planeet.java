package voorbeeldexamen;

public class Planeet {
	private String naam;
	private int x,y,z;

	public Planeet(String naam, int x, int y, int z) {
		this.naam = naam;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(this.naam + "," + this.x + "," + this.y + "," + this.z);
		return sb.toString();
	}
	
	public String getNaam() {
		return this.naam;
	}

}

