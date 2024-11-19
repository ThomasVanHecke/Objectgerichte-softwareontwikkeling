
public class BankRekening {
	private String houder;
	private String nummer;
	private double saldo;
	
	// default-constructor
	public BankRekening() {
		houder = "NA";
		nummer = "NA";
		saldo = 0;
	}
	
	// argumenten-constructor
	public BankRekening(String h, String n, double s) {
		houder = h;
		nummer = n;
		saldo = s;
	}
	
	// setters & getters
	public void setHouder(String h) {
		houder = h;
	}
	
<<<<<<< HEAD
	public String getHouder() { // Returns a value of type string
		return houder;
	}
	
	public void setNummer(String n) {
		nummer = n;
	}
	
	public String getNummer() { // Returns a value of type string
		return nummer;
	}
	
	public void setSaldo(double s) {
		saldo = s;
	}
	
	public double getSaldo() { // Returns a value of type double
=======
	public String getHouder() {
		return houder;
	}
	
	public void setNummer(String n) {
		nummer = n;
	}
	
	public String getNummer() {
		return nummer;
	}
	
	public void setSaldo(double s) {
		saldo = s;
	}
	
	public double getSaldo() {
>>>>>>> refs/remotes/origin/master
		return saldo;
	}
}
