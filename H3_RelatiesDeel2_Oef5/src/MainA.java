
public class MainA {
	
	public static void laatBewegen(Beweegbaar b) {
		b.beweeg();
	}
	
	public static void main(String[] args) {
		MensA m = new MensA("Thomas");
		laatBewegen(m);
		
		AutoA a = new AutoA("1-ABC-123");
		laatBewegen(a);

	}

}
