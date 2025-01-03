package Punt;
import java.math.*;

public class Punt {
	private int x,y;
	
	public Punt() {
		this.x = 0;
		this.y = 0;
	}
	
	public Punt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Punt(Punt p) {
		this.x = p.x;
		this.y = p.y;
	}
	
	public void schrijf() {
		System.out.println("X: " + this.x);
		System.out.println("Y: " + this.y);
	}
	
	public void verschuif(int deltaX, int deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}
	
	public double afstandTotOorsprong() {
		double tussenAfstand = Math.pow(this.x, 2) + Math.pow(this.y, 2);
		double afstand = Math.sqrt(tussenAfstand);
		return afstand;
	}
	
	public int getXCoordinaat() {
		return this.x;
	}
	
	public int getYCoordinaat() {
		return this.y;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("x: " + this.x + " y: " + this.y);
		return sb.toString();
	}
}
