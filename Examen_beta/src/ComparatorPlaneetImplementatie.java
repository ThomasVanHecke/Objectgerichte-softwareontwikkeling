
public class ComparatorPlaneetImplementatie implements ComparatorPlaneet {
	
	public int compare(Planeet p1, Planeet p2) {
		return p1.vergelijkNaam(p2);
	}
}
