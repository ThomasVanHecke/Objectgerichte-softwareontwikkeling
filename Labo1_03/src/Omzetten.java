package labo1;

public class Omzetten {
	private int dagen, uren, minuten, totaalSeconden, restSeconden;
	
	public Omzetten(int s) {
		totaalSeconden = s;
		dagen = 0;
		uren = 0;
		minuten = 0;
		restSeconden = 0;
	}
	
	public void berekenOmzetten() {
		dagen = totaalSeconden / (60*60*24);
		restSeconden = totaalSeconden % (24*60*60);
		totaalSeconden = restSeconden;
		
		uren = restSeconden / (60*60);
		restSeconden = totaalSeconden % (60*60);
		totaalSeconden = restSeconden;
		
		minuten = totaalSeconden / 60;
		restSeconden = totaalSeconden % (60);
		totaalSeconden = restSeconden;
	}
	
	public void schrijfOmzetten() {
		System.out.println("aantal dagen: " + dagen);
		System.out.println("aantal uren: " + uren);
		System.out.println("aantal minuten: " + minuten);
		System.out.println("aantal seconden: " + totaalSeconden);
	}
}
