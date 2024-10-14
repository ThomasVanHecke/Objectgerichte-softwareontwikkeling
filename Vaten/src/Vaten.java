
public class Vaten {
	private int maxVolume;
	private int volume;
	
	public Vaten() {
		maxVolume = 0;
		volume = 0;
	}
	
	public Vaten(int v) {
		maxVolume = v;
		volume = 0;
	}
	
	public void vulMet(int v) { // rekening houden met MAX VOLUME
		if((volume+v) <= maxVolume) {
			volume += v;
		}
		
		else {
			volume = maxVolume;
		}
	}
	
	public void pompOver(int v, Vaten vat) {
		if(volume >= v && (vat.volume + v) <= vat.maxVolume) {
			vat.volume += v;
			volume -= v;
		}
		
		else if(volume < v && (vat.volume + v) <= vat.maxVolume) {
			vat.volume += volume;
			volume -= volume;
		}
		
		else if(volume < v && (vat.volume + v) > vat.maxVolume) {
			if((vat.volume + volume) <= vat.maxVolume) {
				vat.volume += volume;
				volume -= volume;
			}
			else {
				vat.volume = vat.maxVolume;
			}
		}
		
		else {
			vat.volume = vat.maxVolume;
			volume -= v;
		}
	}
	
	public void schrijf() {
		System.out.println("Volume: " + volume);
		System.out.println("Max volume: " + maxVolume);
	}

}
