
public class Driehoek {
	private double z1, z2, z3, pythagoras, langste;
	
<<<<<<< HEAD
	public Driehoek(double zijde1, double zijde2, double zijde3) { // 3 parameter constructor
		z1 = zijde1;
		z2 = zijde2;
		z3 = zijde3;
		pythagoras = 0;
		langste = 0;
	}
	
	public void berekenDriehoek() { // method
		if(z1 >= z2 && z1 >= z3) {
			langste = z1;
			pythagoras = Math.sqrt(z2*z2 + z3*z3);
		}
		else if(z2 >= z1 && z2 >= z3){
			langste = z2;
			pythagoras = Math.sqrt(z1*z1+z3*z3);
		}
		else {
			langste = z3;
			pythagoras = Math.sqrt(z1*z1+z2*z2);
		}
	}
	
	public void schrijfDriehoek() { // method
=======
	public Driehoek(double zijde1, double zijde2, double zijde3) {
		z1 = zijde1;
		z2 = zijde2;
		z3 = zijde3;
		pythagoras = 0;
		langste = 0;
	}
	
	public void berekenDriehoek() {
		if(z1 >= z2 && z1 >= z3) {
			langste = z1;
			pythagoras = Math.sqrt(z2*z2 + z3*z3);
		}
		else if(z2 >= z1 && z2 >= z3){
			langste = z2;
			pythagoras = Math.sqrt(z1*z1+z3*z3);
		}
		else {
			langste = z3;
			pythagoras = Math.sqrt(z1*z1+z2*z2);
		}
	}
	
	public void schrijfDriehoek() {
>>>>>>> refs/remotes/origin/master
		if(langste == pythagoras) {
			System.out.println("Het is een rechthoekige driehoek");
			System.out.println(z1);
			System.out.println(z2);
			System.out.println(z3);
			System.out.println(langste);
			System.out.println(pythagoras);
		}
		else {
			System.out.println("Het is geen rechthoekige driehoek");
			System.out.println(z1);
			System.out.println(z2);
			System.out.println(z3);
			System.out.println(langste);
			System.out.println(pythagoras);
		}
	}
}
