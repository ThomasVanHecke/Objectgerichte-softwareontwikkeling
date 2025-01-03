
public class Vat {
	private int maxVolume;
	private int huidigVolume;
	
	public Vat() {
		
	}
	
	public Vat(int maxVolume) {
		this.maxVolume = maxVolume;
		this.huidigVolume = 0;
	}
	
	public Vat(Vat v) {
		this.maxVolume = v.maxVolume;
		this.huidigVolume = v.huidigVolume;
	}
	
	public void vulMet(int volumeBijGieten) {
		int tijdelijkHuidigVolume = this.huidigVolume + volumeBijGieten;
		if(tijdelijkHuidigVolume < this.maxVolume || tijdelijkHuidigVolume == this.maxVolume) {
			this.huidigVolume += volumeBijGieten;
		}
		else {
			this.huidigVolume = this.maxVolume;
		}
	}
	
	public void pompOver(int volumeOverGieten, Vat v) {
		int tijdelijkHuidigVolume = this.huidigVolume - volumeOverGieten;
		
		if(tijdelijkHuidigVolume > 0) {
			v.vulMet(volumeOverGieten);
			this.huidigVolume = tijdelijkHuidigVolume;
		}
		else {
			v.vulMet(this.huidigVolume);
			this.huidigVolume = 0;
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("sop: vat van " + this.maxVolume + "l met " + this.huidigVolume + "l gevuld.");
		
		return sb.toString();
	}
}
