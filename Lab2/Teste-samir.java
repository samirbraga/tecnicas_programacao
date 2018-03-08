public class Teste {
	public static void main (String[] args) {
		int[] empty = new int[0];
		Conjunto A = new Conjunto();
		A.append(9);
		A.append(8);
		A.append(1);


		Conjunto B = new Conjunto();
		B.append(9);
		B.append(1);
		B.append(8);
		B.append(5);

		for (int el : B.getElements()) {
			System.out.println(el);
		}

		if (A.checkSubset(B)) {
			System.out.println("SHOWWWW");
		} else {
			System.out.println("VALA");
		}

	}
}
