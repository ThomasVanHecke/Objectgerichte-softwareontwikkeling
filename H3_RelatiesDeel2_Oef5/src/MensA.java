
public class MensA implements Beweegbaar{
	private String naam;
	
	public MensA(String n) {
		this.naam = n;
	}
	
	public void beweeg() {
		System.out.println("Mens " + this.naam + " beweegt.");
	}
}
