
public class NaamComparator implements ComparatorDier {
	@Override
	public int compare(Dier d1, Dier d2) {
		return d1.vergelijkNaam(d2);
	}
}
