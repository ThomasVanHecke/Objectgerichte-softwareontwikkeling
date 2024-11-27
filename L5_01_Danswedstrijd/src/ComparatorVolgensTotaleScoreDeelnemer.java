import java.util.Comparator;

public class ComparatorVolgensTotaleScoreDeelnemer implements Comparator<Deelnemer>{
	public int compare(Deelnemer d1, Deelnemer d2) {
		int tussenResultaat = d2.getTotaleScore()-d1.getTotaleScore();
		return tussenResultaat;
	}

}
