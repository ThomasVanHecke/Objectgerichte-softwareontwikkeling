package Punt;

public class Main {
	public static void main(String[] args) {
		Punt p1 = new Punt();
		Punt p2 = new Punt(3, 4);
		Punt p3 = new Punt(p2);
		
		p1.schrijf();
		p2.schrijf();
		p3.schrijf();
		
		p2.verschuif(3, 3);
		p2.schrijf();
		
		double afstandTotOorsprong = p3.afstandTotOorsprong();
		System.out.println("Punt 3 afstand tot oorsprong: " + afstandTotOorsprong);
	}
}
