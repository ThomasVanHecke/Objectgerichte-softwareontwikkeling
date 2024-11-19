import java.util.Scanner;

public class GebruikDrukPriemgetal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Grenswaarde: ");
		int grens = sc.nextInt();
<<<<<<< HEAD
		DrukPriemgetallen p = new DrukPriemgetallen(); // New object with reference name p
=======
		DrukPriemgetallen p = new DrukPriemgetallen();
>>>>>>> refs/remotes/origin/master
		for (int i=2; i<=grens; i++) { // elk getal controleren op priemgetal tot grens
			System.out.println("i: " + i);
			if (p.isPriem(i)) { // getal controleren met methode
				System.out.println("Priemgetal: " + i);
				System.out.println("Grens: " + grens);
			}
		}
		sc.close();
	}

}
