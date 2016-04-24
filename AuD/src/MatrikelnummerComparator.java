import java.util.Comparator;

public class MatrikelnummerComparator implements Comparator<Studi> {
	public int compare(Studi s1, Studi s2) {
		if (s1.matrikelnummer < s2.matrikelnummer)
			return -1;
		if (s1.matrikelnummer > s2.matrikelnummer)
			return +1;
		return 0;
	}

}
