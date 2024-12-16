import java.util.List ;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;



public class PakjesDienst {
	
	
//attributen niet wijzigen en geen toevoegen
	
	
	Pakjes allePakjes ;
	
	List <Bestelwagen> bestelwagens ;
	
	public PakjesDienst(int aantalBestelwagens) {
		// Creating the list bestelwagens
		bestelwagens = new ArrayList<Bestelwagen>();
		
		// Creating a object of class Pakjes
		allePakjes = new Pakjes();
		
		for(int i = 0; i < aantalBestelwagens; i ++) {
			Bestelwagen b = new Bestelwagen(i, 100);
			bestelwagens.add(b);
			//System.out.println("toString PakjesDienst");
			//System.out.println("Bestelwagen: " + b);
		}
		//System.out.println("Lijst bestelwagens: " + bestelwagens.toString());
	}
	
	// Reads a file with lines representing individual pakjes and adding them to the list pakjes in class Pakjes
	public void voegPakjeToe(Pakje p) throws NietUniekException, FileNotFoundException {
		List <Pakje> pakjes = this.allePakjes.getPakjes();
		//System.out.println("Pakjesdienst");
		boolean uniek = true;
		
		// Checking if there isn't already a pakje with the same id
		for(Pakje pakje: pakjes) {
			//System.out.println("In for-loop");
			
			if (pakje.getId() == p.getId()) {
				//System.out.println("Exception");
				uniek = false;
				throw new NietUniekException("Geen uniek id!");
			}
		}
		
		if(uniek == true) {
			pakjes.add(p);
			uniek = true;
		}
	}
	
	// Does not work
	public void verdeelPakjesOverBestelwagen() {
		List <Pakje> pakjes = this.allePakjes.pakjes;
		
		pakjes.sorteerOpRegio();
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Bestelwagens met toegekende pakjes : " + System.lineSeparator());
		
		// Looping throug list bestelwagens
		for(Bestelwagen b: this.bestelwagens) {
			sb.append("Bestelwagen: " + b + System.lineSeparator());
		}
		
		// Adding new line
		sb.append(System.lineSeparator());
		
		sb.append( "Nog te vervoeren pakjes : " + System.lineSeparator());
		
		// Looking in Pakjes-class with AANWEZIG
		for(Pakje p: this.allePakjes.pakjes) {
			// Making difference between AANWEZIG and GELEVERD
			if(p.getToestand() ==  Toestand.AANWEZIG) {
				sb.append(p + System.lineSeparator());
			}
		}
		
		// Adding new line
		sb.append(System.lineSeparator());
		
		sb.append("Reeds geleverde pakjes: ");
		
		// Looking in Pakjes-class with GELEVERD
		for(Pakje p: this.allePakjes.pakjes) {
			// Making difference between AANWEZIG and GELEVERD
			if(p.getToestand() ==  Toestand.GELEVERD) {
				sb.append(p + System.lineSeparator());
			}
		}
		
		return sb.toString();
	}
	
	// toString-methode
	/*public String toString() {
		// Creating a StringBuilder-object once
		StringBuilder sb = new StringBuilder();
		
		List<Pakje> pakjes = this.allePakjes.getPakjes();
		
		List<Pakje> pakjesToegekend = new ArrayList<Pakje>();
		List<Pakje> pakjesAanwezig = new ArrayList<Pakje>();
		List<Pakje> pakjesGeleverd = new ArrayList<Pakje>();
		
		// Looping through every pakje in the list
		for(Pakje p: pakjes) {
			// Checking the toestand
			if (p.getToestand() == Toestand.TOEGEKEND) {
				pakjesToegekend.add(p);
			}
			
			else if (p.getToestand() == Toestand.AANWEZIG) {
				pakjesAanwezig.add(p);
			}
			
			else {
				pakjesGeleverd.add(p);
			}
		}
		sb.append("Bestelwagens met toegekende pakjes: " + System.lineSeparator() + pakjesToegekend.toString() + System.lineSeparator());
		sb.append("Nog te vervoeren pakjes: " + System.lineSeparator() + pakjesAanwezig.toString() + System.lineSeparator());
		sb.append("Reeds geleverd pakjes " + System.lineSeparator() + pakjesGeleverd.toString() + System.lineSeparator());
		
		// Converting StringBuilder-object to String type
		return sb.toString();
	}*/
}
