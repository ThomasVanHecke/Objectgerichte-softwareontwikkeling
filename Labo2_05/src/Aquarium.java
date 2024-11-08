
public class Aquarium {
	private int aantalInVoorraad;
	private double lengte, breedte, hoogte, kostprijs;
	
	// default-constructor
	public Aquarium() {
		lengte = 20.5;
		breedte = 10.5;
		hoogte = 15.5;
		kostprijs = 30.75;
		aantalInVoorraad = 100;
	}
	
	// vijf parameter-constructor
	public Aquarium(double l, double b, double h, double k, int aIV) {
		lengte = l;
		breedte = b;
		hoogte = h;
		kostprijs = k;
		aantalInVoorraad = aIV;
	}
	
	// copy-constructor met lengte parameter
	public Aquarium(Aquarium a, int l) {
		lengte = l;
		breedte = a.breedte;
		hoogte = a.hoogte;
		kostprijs = a.kostprijs;
		aantalInVoorraad = a.aantalInVoorraad;
	}
	
	// kopieer-methode met breedte parameter // FOUT
	public Aquarium kopieerAquarium(int b) {
		breedte = b;
		return new Aquarium(lengte, breedte, hoogte, kostprijs, aantalInVoorraad);
	}
	
	// ontvangen-methode
	public double ontvangenAquarium(int va) {
		return (kostprijs * va);
	}
	
	// schrijf-methode
	public void schrijfAquarium() {
		System.out.println(lengte + "/" + breedte + "/" + hoogte + "/" + kostprijs + "/" + aantalInVoorraad);
	}
	
	
}
