package labo1;

import java.util.Scanner;

public class GebruikOmzetten {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // reading from System.in
		System.out.println("Geef een reël getal: ");
		Omzetten o = new Omzetten(sc.nextInt());
		o.berekenOmzetten();
		o.schrijfOmzetten();
		sc.close();

	}
}
