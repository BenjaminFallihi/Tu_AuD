
public class Test2Arrays {

	public static void main(String[] args) {
		double[] a = new double[10];
		int index = 0;

		for (int i = 1; i < a.length; i++) {
			a[i] = (2478 * i) / 232;
			System.out.print(a[i] + " ");

		}
		System.out.println();

		for (int i = 1; i < a.length; i++)
			if (a[i] < a[index])
				index = i;
		System.out.println("Kleinseste Zahl ist: "+a[index]);

	}

}
