import java.util.Scanner;

public class GebruikGrootste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geef 2 getallen: ");
		Grootste g = new Grootste(sc.nextDouble(), sc.nextDouble()); // twee inputs nodig, anders niet gedefinieerd
		g.berekenGrootste();
		g.schrijfGrootste();
		sc.close();
	}

}
