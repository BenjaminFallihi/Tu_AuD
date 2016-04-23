
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

	}

}
