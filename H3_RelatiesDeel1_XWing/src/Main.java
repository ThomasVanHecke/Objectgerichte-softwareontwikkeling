
public class Main {
	public static void main(String[] args) {
		Pilot wedge = new Pilot("Wedge","Antilles");
		Pilot luke = new Pilot("Luke","Skywalker");
		Pilot tycho = new Pilot("Tycho","Celchu");
		AstroDroid r2 = new AstroDroid("R2D2");
		AstroDroid an = new AstroDroid("anonymous");
		XWing xwing1 = new XWing("X65/5");
		XWing xwing2 = new XWing("X65/9");
		XWing xwing3 = new XWing("XJ5/4");
		xwing2.tanken(4);
		xwing1.setPilot(luke);
		xwing1.setAstroDroid(r2);
		xwing2.setPilot(wedge);
		xwing2.setAstroDroid(an);
		xwing3.setPilot(tycho);
		xwing1.schrijf();
		xwing2.schrijf();
		xwing3.schrijf();
	}
}
