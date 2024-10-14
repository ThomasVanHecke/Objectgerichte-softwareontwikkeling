package punt;

public class Afstanden {

	public static void main(String[] args) {
		Punt p1 = new Punt(1,1);
		Punt p2 = new Punt(4,5);
		
		System.out.println("afstand via statische methode: " + Punt.getAfstandTussen(p1, p2));
		// bevinden in klasse Afstanden -> "klassennaam." gebruiken om statische methode op te roepen uit ander klassen
		System.out.println("afstand via instantie methode: " + p1.getAfstandTot(p2));
		// objectgebonden -> voorafgegaan door "referentieNaarObject."
	}

}
