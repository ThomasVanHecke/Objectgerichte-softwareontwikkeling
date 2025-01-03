
public class AutoA implements Beweegbaar{
	private String nummerplaat;
	
	public AutoA(String n) {
		this.nummerplaat = n;
	}
	
	public void beweeg() {
		System.out.println("Auto " + this.nummerplaat + " beweegt.");
	}
}
