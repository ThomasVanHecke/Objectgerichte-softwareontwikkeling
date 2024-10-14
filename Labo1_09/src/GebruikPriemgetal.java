import java.util.Scanner;

public class GebruikPriemgetal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geef een getal: ");
		Priemgetal p = new Priemgetal(sc.nextInt());
		p.berekenPriemgetal();
		sc.close();
	}

}
