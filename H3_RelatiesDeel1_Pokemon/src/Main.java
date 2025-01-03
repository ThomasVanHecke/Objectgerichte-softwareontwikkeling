
public class Main {
	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon("Pikachu","elektriciteit");
		Pokemon charmander = new Pokemon("Charmander","vuur");
		Pokemon eevee = new Pokemon("Eevee","normaal");
		Pokemon poliwag = new Pokemon("Poliwag","water");
		Pokemon mew = new Pokemon("Mew","psychisch");
		Persoon ash = new Persoon("Ash",'m');
		Persoon gary = new Persoon("Gary",'m');
		Persoon misty = new Persoon("Misty",'v');
		pikachu.setEigenaar(ash);
		//charmander.setEigenaar(gary);
		eevee.setEigenaar(gary);
		poliwag.setEigenaar(misty);
		pikachu.schrijf();
		mew.schrijf();
		if (pikachu.heeftZelfdeEigenaar(charmander)) {
			System.out.println("zelfde eigenaar");
		}
		
		else {
			System.out.println("andere eigenaar");
		}
	}
}
