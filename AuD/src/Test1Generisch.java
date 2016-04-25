import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test1Generisch<Typ1, Typ2> {
	private Typ1 attribut1;
	private Typ2 attribut2;

	public Typ1 getAttribut1() {
		return attribut1;
	}

	public void setAttribut1(Typ1 a1) {
		this.attribut1 = a1;
	}

	public Typ2 getAttribut2() {
		return attribut2;
	}

	public void setAttribut2(Typ2 a2) {
		this.attribut2 = a2;
	}

	public Test1Generisch(Typ1 a1, Typ2 a2) {
		attribut1 = a1;
		attribut2 = a2;
	}

	public static void main(String[] args) {
		Test1Generisch<Integer, Integer> generisch = new Test1Generisch<Integer, Integer>(null, null);
		generisch.setAttribut1(12);
		System.out.println(generisch.getAttribut1());

		Studi student1 = new Studi("Fallihi", "Benjamin", 123);
		Studi student2 = new Studi("Shakib", "Khaled", 345);
		StudiNamensComparator vergleich1 = new StudiNamensComparator();
		MatrikelnummerComparator vergleich2 = new MatrikelnummerComparator();

		System.out.println(vergleich1.compare(student1, student2));
		System.out.println(vergleich2.compare(student1, student2));

		Collection<Number> c1 = new ArrayList<Number>();
		Collection<Number> c2 = new HashSet<Number>();
		Collection<Number> c3 = new Vector<Number>();
		Collection<String> coll = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			c1.add(new Integer(i));
			c2.add(new Double(i));
			c3.add(new Float(i));
		}

		String str1 = new String("Hallo");
		String str2 = new String("Mittag");

		coll.add(str1);
		if (coll.contains(str2))
			System.out.println("passt");
		else {
			System.out.println("passt nicht");
		}

		List<Studi> list = new LinkedList<Studi>();
		for (int i = 0; i < 10; i++) {
			Studi s = new Studi();
			s.matrikelnummer = ((24567 * i) % 235);
			System.out.print(s.matrikelnummer +" ");
			list.add(s);
		}
		
		System.out.println();
		
		Iterator<Number> it1 = c1.iterator();
		while (it1.hasNext())
			System.out.print(it1.next().intValue() + " ");
		
	}

}
