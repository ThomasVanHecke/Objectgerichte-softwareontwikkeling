import java.util.List ;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;



public class PakjesDienst {
	
	
//attributen niet wijzigen en geen toevoegen
	
	
	Pakjes allePakjes ;
	
	List <Bestelwagen> bestelwagens ;
	
	public PakjesDienst(int aantalBestelwagens) {
		for(int i = 0; i < aantalBestelwagens; i ++) {
			Bestelwagen b = new Bestelwagen(i, 100);
			bestelwagens.add(b);
		}
	}
	
	// Reads a file with lines representing individual pakjes and adding them to the list pakjes in class Pakjes
	public void voegPakjeToe() throws NietUniekException {
		FileReader fR = new FileReader("pakjes.txt");
		Scanner sc = new Scanner(fR);
		
		// Changing the default pattern to a punctuation
		Pattern pattern = Pattern.compile("\p{Punct}");
		sc.useDelimiter(pattern);
		
		// Creating an object of class Pakjes ONCE
		allePakjes = new Pakjes(); // Already have a reference, is a attribute
		
		// Reading the file as long there is a next line
		while sc.hasNextLine(){
			// For every line creating a new object of class Pakje
			Pakje p = new Pakje();
			
			// Creating a index i to differentiate between different attributes
			int i = 0;
			
			// Creating a flag uniekId which indicates if a pakje has unique id or not
			boolean uniekId = true;
			
			// Reading the next token as long there is a next token
			while sc.hasNext(pattern){
				String s = sc.next();
				
				// Based on the index we can decide which attribtute the readed token is
				if i == 0 {
					int id = Integer.parseInt(s);
					p.setId(id);
				}
				
				else if i == 1 {
					p.setRegio(s);
				}
				
				else {
					int volume = Integer.parseInt(s);
					p.setVolume(volume);
				}
				
				// Increment index i
				i ++;
			}
			
			// Checking if there isn't already a pakje with the same id
			for(Pakje pakje : allesPakjes.pakjes) {
				if pakje.getId() == p.getId {
					throw new NietUniekException("Deze ID bestaat al.");
					uniekId = false;
				}
			}
			
			// Only adding a pakje if it has a unique id
			if uniekId {
				// Hard coding the toestand integer because in when added to the list the toestand will always be AANWEZIG
				int toestand = 0;
				
				// Just before adding a pakje to the list set the attribute toestand of class Toestand to AANWEZIG
				p.setToestand(toestand);
				
				// After one line in the file add object p to list pakjes off class Pakjes
				allePakjes.pakjes.add(p);
			}
			
		}
	}
	

}
