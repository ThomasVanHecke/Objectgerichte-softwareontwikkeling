public class JuryLid {

	private int id;
	private String naam;
	
	// Default constructor
	public JuryLid() {
		id = 0;
		naam = "onbekend";
	}

	// Parameterized constructor
	public JuryLid(int id, String naam) {
		this.id = id;
		this.naam = naam;
	}
	
	// Getter
	public int getId() {
		return id;
	}
	
	// Setter
	public void setId(int id) {
		this.id = id;
	}
	
	// Getter
	public String getNaam() {
		return naam;
	}

	// Setter
	public void setNaam(String naam) {
		this.naam = naam;
	}

	@Override
	public String toString() {
		return id + ". " + naam;
	}
	
	

}
