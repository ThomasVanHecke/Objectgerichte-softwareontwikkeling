package tekstbestand;

import java.util.LinkedList;
import java.util.List;

public class Programma2LinkedList {
	/* To create a LinkedList that will store integers we need to store objects of the class Integer */
	private List<Integer> getallen; // List(Attribute) which will hold integer values
	
	// Default constructor
	public Programma2LinkedList() {
		// List 'getallen' will be a LinkedList with initialy 10 spaces
		getallen = new LinkedList<Integer>();
	}
	
	public void voegToe(Integer getal) {
		getallen.add(getal);
	}
	
	/* If we do not have a toString-method for our List, when printing the List will result in: 'tekstbestand.Programma2@3d494fbf' */
	
	public String toString() {
		StringBuilder sB = new StringBuilder(getallen.size()*50);
		String nl = System.getProperty("line.separator");
		for (Integer g : getallen) sB.append(g).append(nl);
		return sB.toString();
	}
}
