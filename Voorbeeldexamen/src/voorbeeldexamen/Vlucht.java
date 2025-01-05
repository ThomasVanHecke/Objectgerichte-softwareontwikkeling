package voorbeeldexamen;

public class Vlucht {
	private Planeet vertrek;
	private Planeet aankomst;
	private int aantalPassagiers;
	private Ruimteschip ruimteschip;
	
	public Vlucht(Planeet vertrek, Planeet aankomst, Ruimteschip r) {
		this.vertrek = vertrek;
		this.aankomst = aankomst;
		this.ruimteschip = r;
	}
	
	// If aantalPassagiers not defined = 0
	public String toString() {
		StringBuilder sb = new StringBuilder(this.vertrek + "," + this.aankomst + "," + this.aantalPassagiers + "," + this.ruimteschip);
		return sb.toString();
	}
	
	public int vergelijkVertrek(Vlucht v) {
		if(this.vertrek.getNaam().compareTo(v.getVertrek().getNaam()) == 0) {
			return this.vergelijkAankomst(v);
		}
		else {
			return this.vertrek.getNaam().compareTo(v.getVertrek().getNaam());
		}
	}
	
	public Planeet getVertrek() {
		return this.vertrek;
	}
	
	public int vergelijkAankomst(Vlucht v) {
		return this.aankomst.getNaam().compareTo(v.getAankomst().getNaam());
	}
	
	public Planeet getAankomst() {
		return this.aankomst;
	}

	public void voegPassagiersToe(int i) throws CapaciteitOverschredenException{
		int tijdelijkAantalPassagiers = this.aantalPassagiers + i;
		if(tijdelijkAantalPassagiers > this.ruimteschip.getCapaciteit()) {
			throw new CapaciteitOverschredenException("Te veel passagiers!");
		}
		else {
			this.aantalPassagiers = tijdelijkAantalPassagiers;
		}
		
	}
}
