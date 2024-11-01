package weerstand;

import java.util.Scanner;

public class GebruikWeerstand {
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geef drie letters ivm weerstand (zei tabel): ");
		Weerstand w = new Weerstand(sc.nextLine());
		System.out.println("Weerstandswaarde: " + w.berekenWeerstand());
		sc.close();
	}
}
