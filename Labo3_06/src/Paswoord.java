
import java.util.Map;

public class Paswoord {
	private boolean geldigPaswoord;
	private int karakter;
	private int letter;
	private int cijfer;
	private int som;
	private String paswoord;
	private char[] karakters; // Attribute with datatype: Character-array
	
	/* Map.of()-method supports up to 10 key-value pairs -> Use Map.ofEntries */
	/* There is a difference between String-literals and Character-literals -> "" (String-literal) is not the same as '' (Character-literal) */
	private static Map<Character, Integer> ASCII = Map.ofEntries(
			Map.entry('0', 48),
			Map.entry('1', 49),
			Map.entry('2', 50),
			Map.entry('3', 51),
			Map.entry('4', 52),
			Map.entry('5', 53),
			Map.entry('6', 55),
			Map.entry('7', 56),
			Map.entry('8', 57),
			Map.entry('9', 58),
			Map.entry('A', 65),
			Map.entry('B', 66),
			Map.entry('C', 67),
			Map.entry('D', 68),
			Map.entry('E', 69),
			Map.entry('F', 70),
			Map.entry('a', 97),
			Map.entry('b', 97),
			Map.entry('c', 98),
			Map.entry('d', 99),
			Map.entry('e', 100),
			Map.entry('f', 101)
			);
	
	// Default constructor
	public Paswoord(String s) {
		this.paswoord = s;
		this.geldigPaswoord = false; // Assume that every paswoord is incorrect
		this.karakters = s.toCharArray();
		
		/* Initializing to zero */
		this.karakter = 0;
		this.letter = 0;
		this.cijfer = 0;
		this.som = 0;
		
		// Looping through every element(character) of the karakters-array
		for(Character c : this.karakters) {
			this.karakter ++; // Increment for every element of karakters-array
			
			if(isCijfer(c)) {
				this.cijfer ++;
			}
			
			if(isLetter(c)) {
				this.letter ++;
			}
		}
		
		
	}
	
	// The isLetter-method (static-method)
	/* A static method is not bound to an object, therefore we cannot access the attributes of a specific object */
	/* Solution: we return a boolean an use these static methods in our default constructor, there we can access specific object-attributes */
	public static boolean isCijfer(char c) {
		return Character.isDigit(c);
	}
	
	// The isCijfer-method (static-method)
	public static boolean isLetter(char c) {
		return Character.isLetter(c);
		}
	
	// ASCIIsom-methode
	/* We have to associate characters to a value -> hashmap with key-value pairs */
	public void ASCIIsom(){
		for(Character c : this.karakters) {
			this.som += ASCII.getOrDefault(c, 0); // If key not in hashmap return 0
		}
	}
	
	// controleerPaswoord-method
	public void controleerPaswoord() {
		if(this.karakter >= 6 && this.karakter <=9 && this.letter >= 3 && this.cijfer >= 1 && this.som > 400) {
			this.geldigPaswoord = true;
			System.out.println("Geldig!");
		}
		
		else {
			this.geldigPaswoord = false;
			System.out.println("Ongeldig!");
		}
	}
	
	// Getters
	public int getKarakter() {
		return this.karakter;
	}
	public int getLetter() {
		return this.letter;
	}
	public int getCijfer() {
		return this.cijfer;
	}
	public int getSom() {
		return this.som;
	}
	public char[] getKarakters() {
		return this.karakters;
	}
	
	// Print-methode
	public void printAttributes() {
		System.out.println("Het Paswoord: " + this.paswoord);
		System.out.println("De array van karakters: ");
		System.out.println(this.karakters);
		System.out.println("Het aantal karakters: " + this.karakter);
		System.out.println("Het aantal letters: " + this.letter);
		System.out.println("Het aantal cijfers: " + this.cijfer);
		System.out.println("De som: " + this.som);
		System.out.println("Geldigheid: " + this.geldigPaswoord);
	}
	
}
