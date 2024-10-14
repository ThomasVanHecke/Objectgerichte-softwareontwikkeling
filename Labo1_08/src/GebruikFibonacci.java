import java.util.Scanner;

public class GebruikFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geef een positief geheel getal in: ");
		Fibonacci f = new Fibonacci(sc.nextInt());
		f.schrijfFibonacci();
		sc.close();
	}
}
