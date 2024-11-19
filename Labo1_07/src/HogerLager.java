import java.lang.Math;
import java.util.Scanner;

public class HogerLager {
	private int random, g; // random gegenereerd getal
	private int min, max, range; // min.- & max.-waarde voor bereik/range random-method
	private int poging;
	Scanner sc = new Scanner(System.in);
	
	public HogerLager(int minimum, int maximum, int getal) {
		min = minimum;
		max = maximum;
		range = (max-min) +1;
		random = (int) (Math.random()*range) + min;
		poging = 0;
		g = getal;
	}
	
	public void aantalPoging() {
		while(g != random) {
			poging += 1;
			System.out.print("Probeer opnieuw: ");
<<<<<<< HEAD
			g = sc.nextInt(); // Asking new value for g
=======
			g = sc.nextInt(); // g niet vergeten updaten
>>>>>>> refs/remotes/origin/master
		}
		System.out.println("aantal pogingen: " + poging);
		System.out.println("min: " + min);
		System.out.println("max: " + max);
		System.out.println("range: " + range);
		System.out.println("random: " + random);
		System.out.println("getal: " + g);
	}
}
