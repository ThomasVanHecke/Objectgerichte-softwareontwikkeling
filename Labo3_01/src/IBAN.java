
public class IBAN {
	// Using String before variable, means creating an object of class String
	private String IBANnummer;
	private String s1;
	private String s2;
	private String s3;
	private String s4;
	private String stringDeeltal;
	private long deeltal;
	
	// Default constructor
	public IBAN() {
		this.IBANnummer = "0";
		this.s1 = "0";
		this.s2 = "0";
		this.s3 = "0";
		this.s4 = "0";
		this.stringDeeltal = this.s1 + this.s2 + this.s3;
		this.deeltal = Long.parseLong(stringDeeltal);
	}
	
	// 1 parameter constructor
	public IBAN(String IBANn) {
		this.IBANnummer = IBANn;
		System.out.println("IBAN nummer: " + this.IBANnummer);
		// Substring method is a method of the class String
		// Only works on objects of class String
		this.s1 = IBANn.substring(5,9);
		System.out.println("2de groep: " + this.s1);
		this.s2 = IBANn.substring(10, 14);
		System.out.println("3de groep: " + this.s2);
		this.s3 = IBANn.substring(15, 17);
		System.out.println("4de groep: " + this.s3);
		this.s4 = IBANn.substring(17, 19);
		System.out.println("4de groep: " + this.s4);
		this.stringDeeltal = this.s1 + this.s2 + this.s3;
		System.out.println("String deeltal: " + stringDeeltal);
		this.deeltal = Long.parseLong(stringDeeltal);
		System.out.println("Long deeltan: " + deeltal);
	}
	
	// Instance method
	public boolean controleerIBAN() {
		if(deeltal % 97 == Long.parseLong(this.s4)) {
			return true;
		}
		else {
			return false;
		}
	}
}
