import java.util.Scanner;

public class GebruikDriehoek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geef 3 zijden: ");
		Driehoek d = new Driehoek(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		d.berekenDriehoek();
		d.schrijfDriehoek();
		sc.close();
	}
}
