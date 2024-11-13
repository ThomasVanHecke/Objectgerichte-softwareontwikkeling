package meubels1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Meubels m = new Meubels(10, 5);
		Kast k = new Kast(10, 5, 100);
		Tafel t = new Tafel(11, 6, 8);
		
		m.schrijf();
		k.schrijf();
		t.schrijf();
		
		sc.close();
	}
}
