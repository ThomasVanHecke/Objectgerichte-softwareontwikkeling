import java.util.Comparator;

public class ComparatorVoorDuur implements Comparator<Lied> {

	@Override
	public int compare(Lied l1, Lied l2) {
		return l1.vergelijkDuur(l2);
	}

}
