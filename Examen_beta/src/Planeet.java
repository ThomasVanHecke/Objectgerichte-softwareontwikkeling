//Mathias Dupont
import java.util.Objects; 

public class Planeet {
	private String naamPlaneet;
	private String naamSter;
	private String info;
	private Steden steden;
	
	public Planeet(String naamPlaneet, String naamSter, String info, Steden steden) {
		super();
		this.naamPlaneet = naamPlaneet;
		this.naamSter = naamSter;
		this.info = info;
		this.steden = steden;
	}

	public String getNaamPlaneet() {
		return naamPlaneet;
	}

	public String getNaamSter() {
		return naamSter;
	}

	public String getInfo() {
		return info;
	}
	
	public Steden getSteden() {
		return steden;
	}
	
	public int vergelijkNaam(Planeet p) {
		return naamPlaneet.compareToIgnoreCase(p.naamPlaneet);
	}

	

	@Override
	public String toString() {
		return "Planeet [naamPlaneet=" + naamPlaneet + ", naamSter=" + naamSter + ", info=" + info + ", steden="
				+ steden + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(info, naamPlaneet, naamSter);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planeet other = (Planeet) obj;
		return Objects.equals(info, other.info) && Objects.equals(naamPlaneet, other.naamPlaneet)
				&& Objects.equals(naamSter, other.naamSter);
	}
	
	
}