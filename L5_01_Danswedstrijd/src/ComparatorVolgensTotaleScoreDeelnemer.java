import java.util.Comparator;

public class ComparatorVolgensTotaleScoreDeelnemer implements Comparator<Deelnemer>{
	public int compare(Deelnemer d1, Deelnemer d2) {
		// DONT CALL THE ATTRIBUTES, INSTEAD DEFINE A METHOD FOR THIS AND CALL THE METHOD
		int tussenResultaat = d2.getTotaleScore()-d1.getTotaleScore();
		return tussenResultaat;
	}

}
