import java.util.Comparator;

public class StudiNamensComparator implements Comparator<Studi> {
	public int compare(Studi s1, Studi s2) {
		if (s1.nachname.compareTo(s2.nachname) == 0)
			return s1.vorname.compareTo(s2.vorname);
		return s1.nachname.compareTo(s2.nachname);
	}

}
