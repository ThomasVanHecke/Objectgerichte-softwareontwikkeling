
public class MainB {
	
	public static <T> void laatBewegenMetBeweger(T t, Beweger<T> beweger) {
		beweger.beweeg(t);
	}
	
	public static void main(String[] args) {
		MensB m = new MensB("Thomas");
		AutoB a = new AutoB("1-ABC-123");
		
		boolean aparteKlasse = false;
		boolean anoniemeInnerklasse = false;
		boolean lambdaExpressie = true;
		
		// Apart klasse
		if(aparteKlasse) {
			MensBeweger mb = new MensBeweger();
			AutoBeweger ab = new AutoBeweger();
			laatBewegenMetBeweger(m, mb);
			laatBewegenMetBeweger(a, ab);	
		}
		// Anonieme innerklasse
		if(anoniemeInnerklasse) {
			laatBewegenMetBeweger(m, new Beweger<MensB>() {
				public void beweeg(MensB m) {
					m.stap();
				}
			});
			laatBewegenMetBeweger(a, new Beweger<AutoB>() {
				public void beweeg(AutoB a) {
					a.rijdt();
				}
			});
		}
		// Lambda-expressie
		if(lambdaExpressie) {
			laatBewegenMetBeweger(m, (mens) -> {mens.stap();}
			);
			laatBewegenMetBeweger(a, (auto) -> auto.rijdt()
					);
		}
		
	}
}
