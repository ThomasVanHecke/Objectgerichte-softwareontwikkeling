package Kaarten;

public class Main {
	public static void main(String[] args) {
		Kaart k1 = new Kaart(Waarde.TWEE, Soort.SCHOPPEN);
		Kaart k2 = new Kaart(Waarde.TWEE, Soort.SCHOPPEN);
		Kaart k3 = new Kaart(Waarde.VIER, Soort.SCHOPPEN);
		Kaart k4 = new Kaart(Waarde.VIER, Soort.KLAVEREN);
		
		System.out.println("k1 is hoger dan k2?" + k1.isHogerDan(k2));
		System.out.println("k1 is hoger dan k3?" + k1.isHogerDan(k3));
		System.out.println("k3 is hoger dan k4?" + k3.isHogerDan(k4));
	}
}
