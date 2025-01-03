
public class Pokemon {
	private String naam, element;
	private Persoon persoon;
	
	public Pokemon() {
		
	}
	
	public Pokemon(String naam, String element) {
		this.naam = naam;
		this.element = element;
	}
	
	// Pokemon heeft-een Persoon (heeft-een-relatie)
	public void setEigenaar(Persoon persoon) {
		this.persoon = persoon;
	}
	
	public void schrijf() {
		try {
			StringBuilder sb = new StringBuilder(this.naam + " heeft als eigenaar " + this.persoon.getNaam() + ".");
			System.out.println(sb.toString());
		}
		catch(NullPointerException npe) {
			StringBuilder sb = new StringBuilder(this.naam + " heeft geen eigenaar.");
			System.out.println(sb.toString());
		}
		
	}
	
	public boolean heeftZelfdeEigenaar(Pokemon pokemon) {
		if(this.persoon == pokemon.persoon) {
			return true;
		}
		else {
			return false;
		}
	}
}
