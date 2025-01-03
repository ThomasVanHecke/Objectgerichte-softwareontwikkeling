import java.math.*;

public class Cirkel {
	private double straal;
	
	public Cirkel() {
		this.straal = 1;
	}
	
	public Cirkel(double straal) {
		this.straal = straal;
	}
	
	public Cirkel(Cirkel c) {
		this.straal = c.straal;
	}
	
	public void schaal(int factor) {
		this.straal *= factor;
	}
	
	public double getOmtrek() {
		return(Math.PI * Math.pow(this.straal, 2));
	}
}
