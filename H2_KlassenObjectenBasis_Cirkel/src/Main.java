
public class Main {
	public static void main(String[] args) {
		Cirkel c1 = new Cirkel();
		Cirkel c2 = new Cirkel(5);
		Cirkel c3 = new Cirkel(c2);
		
		System.out.println("Omtrek cirkle 1: " + c1.getOmtrek());
		System.out.println("Omtrek cirkle 2: " + c2.getOmtrek());
		System.out.println("Omtrek cirkle 3: " + c3.getOmtrek());
		
		c3.schaal(10);
		System.out.println("Cirkel 3 na schaling: " + c3.getOmtrek());
	}
}
