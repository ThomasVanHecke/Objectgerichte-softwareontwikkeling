import java.util.Comparator;


public class ComparatorVolgensNaamDeelnemer implements Comparator<Deelnemer>{
	public int compare(Deelnemer d1, Deelnemer d2 ){
		// DONT CALL THE ATTRIBUTES, INSTEAD DEFINE A METHOD FOR THIS AND CALL THE METHOD
		return d1.getNaam().compareTo(d2.getNaam());
	}
	

}
