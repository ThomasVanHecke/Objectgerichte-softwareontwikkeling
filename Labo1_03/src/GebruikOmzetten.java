<<<<<<< HEAD
import java.util.Scanner;

public class GebruikOmzetten {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // reading from System.in
		System.out.println("Geef een reël getal: ");
		// creating new object from class Omzetten and using 1 parameter constructor to give object attributes values
		Omzetten o = new Omzetten(sc.nextInt()); 		
		o.berekenOmzetten(); // calling object method
		o.schrijfOmzetten(); // calling object method
=======
package labo1;

import java.util.Scanner;

public class GebruikOmzetten {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // reading from System.in
		System.out.println("Geef een reël getal: ");
		Omzetten o = new Omzetten(sc.nextInt());
		o.berekenOmzetten();
		o.schrijfOmzetten();
>>>>>>> refs/remotes/origin/master
		sc.close();

	}
}
