package punt;

public class GebruikRechthoek {
	public static void main(String[] args) {
		Rechthoek r1 = new Rechthoek();
		r1.breedte = 5.0;
		r1.lengte = 3.0;
		System.out.println("opp: " + r1.getOppervlak());
		
		Rechthoek r2 = new Rechthoek();
		r2.breedte = 4.0;
		r2.lengte = 6.0;
		System.out.println("opp : " + r2.getOppervlak());
	}

}
