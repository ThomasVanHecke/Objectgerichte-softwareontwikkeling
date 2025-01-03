import java.util.Scanner;

public class GebruikPlaneet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Planeet aarde = new Planeet(9.807, "Aarde");
		Planeet mars = new Planeet(3.711, "Mars");
		Planeet jupiter = new Planeet(24.79, "Jupiter");
		
		System.out.print("Massa aarde: ");
		aarde.getMassa();
		System.out.print("Gewicht aarde: ");
		aarde.getGewicht();
		System.out.print("Massa mars: " );
		mars.getMassa();
		System.out.print("Gewicht mars: ");
		mars.getGewicht();
		System.out.print("Massa jupiter: ");
		jupiter.getMassa();
		System.out.print("Gewicht jupiter: ");
		jupiter.getGewicht();
		System.out.print("Gemiddelde zwaartekracht: ");
		aarde.gemiddeldeZwaartekracht(81, 31, 205);
		sc.close();
	}

}
