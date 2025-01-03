import Punt.Punt; // Import from package Punt class Punt
import java.math.*;

public class Lijnstuk{
	private Punt beginPunt; // Lijnstuk heeft-een beginPunt (aggregatie)
	private Punt eindPunt; // Lijnstuk heeft-een eindPunt (aggregatie)
	
	public Lijnstuk() {
		
	}
	
	public Lijnstuk(Punt beginPunt, Punt eindPunt) {
		this.beginPunt = beginPunt;
		this.eindPunt = eindPunt;
	}
	
	public Lijnstuk(Lijnstuk l) {
		this.beginPunt = l.beginPunt; 
		this.eindPunt = l.eindPunt;
	}
	
	public void setBeginPunt(int x, int y) {
		this.beginPunt = new Punt(x, y);
	}
	
	public void setEindPunt(int x, int y) {
		this.eindPunt = new Punt(x, y);
	}
	
	public void schrijf() {
		System.out.println("Het beginpunt is " + this.beginPunt.toString() + " en het eindpunt is " + this.eindPunt.toString());
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("Het beginpunt is " + this.beginPunt.toString() + " en het eindpunt is " + this.eindPunt.toString());
		return sb.toString();
	}
	
	public double getLengte() {
		double tussenResultaatDeltaX = this.beginPunt.getXCoordinaat() - this.eindPunt.getXCoordinaat();
		double deltaX =  Math.abs(tussenResultaatDeltaX);
		
		double tussenResultaatDeltaY = this.beginPunt.getYCoordinaat() - this.eindPunt.getYCoordinaat();
		double deltaY = Math.abs(tussenResultaatDeltaY);
		
		double tussenEindResultaat = Math.pow(deltaX, 2) + Math.pow(deltaY, 2);
		double eindResultaat = Math.sqrt(tussenEindResultaat);
		
		return eindResultaat;
	}
	
	public void verschuif(int dx, int dy) {
		this.beginPunt.verschuif(dx, dy);
		this.eindPunt.verschuif(dx, dy);
	}
}
