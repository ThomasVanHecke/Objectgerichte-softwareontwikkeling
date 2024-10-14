
public class Fibonacci {
	private int aantalGetallen;
	private int g1, g2, g3;
	
	public Fibonacci(int aantal) {
		aantalGetallen = aantal;
		g1 = 1;
		g2 = 1;
		g3 = 0;
	}
	
	public void schrijfFibonacci() {
		System.out.println(g1);
		System.out.println(g2);
		for(int i = 1; i <= aantalGetallen; i++) {
			g3 = g1 + g2;
			System.out.println(g3);
			g1 = g2;
			g2 = g3;
		}
	}
}
