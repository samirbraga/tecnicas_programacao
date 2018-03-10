import java.util.ArrayList;

public class Teste {
	public static void main (String[] args) {

	ArrayList<Integer> test = new ArrayList<Integer>();

		int[] empty = new int[0];
		Conjunto A = new Conjunto(empty);
		A.append(9);
		A.append(8);
		A.append(1);


		Conjunto B = new Conjunto(empty);
		B.append(9);
		B.append(1);
		B.append(8);
		B.append(5);

		test = A.difference(B);
		for(int element : test){
			System.out.println(element);
		}

		test = A.intersection(B);
		for(int element : test){
			System.out.println(element);
		}


		if (A.checkSubset(B)) {
			System.out.println("SHOWWWW");
		} else {
			System.out.println("VALA");
		}

	}
}
