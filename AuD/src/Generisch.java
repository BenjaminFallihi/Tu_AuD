
/**
 * T1 und T2 sind Platzhalter und TypParameter der Klasse Generisch
 * 
 * @author benjamin
 *
 * @param <T1>
 * @param <T2>
 */
public class Generisch<T1, T2> {

	private T1 attribut1;
	private T2 attribut2;

	/**
	 * Kosntruktor der Klasse
	 * 
	 * @param a1
	 * @param a2
	 */
	 public Generisch(T1 a1, T2 a2) {
	 this.attribut1 = a1;
	 this.attribut2 = a2;
	 }

	static Integer i = new Integer(123);// eine Variable und ein Objekt wird
									// eingerrichtet
	static Double d = new Double(3.14);

	/*
	 * ein Objekt wird erzeugt. um T1 T2 fest zu legen, werden die Typen in <>
	 * reingeschrieben
	 */
	static Generisch<Integer, Double> generisch = new Generisch<Integer, Double>(i, d);

	public T1 getAttribut1() {
		return attribut1;
	}

	public void setAttribut1(T1 a1) {
		this.attribut1 = a1;
	}

	public T2 getAttribut2() {
		return attribut2;
	}

	public void setAttribut2(T2 a2) {
		this.attribut2 = a2;
	}

	public static void main(String[] args) {

		 Integer i1 = generisch.getAttribut1();
		 System.out.println(i1);
		 Integer neueWert = new Integer(234);
		 generisch.setAttribut1(neueWert);
		 Integer i3 = generisch.getAttribut1();
		 System.out.println(i3.intValue());

	}

}
