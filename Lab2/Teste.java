import java.util.ArrayList;

public class Teste {
	public static void main (String[] args) {
		Conjunto test;

		int[] empty = new int[0];
		Conjunto A = new Conjunto(empty);
		A.append(9);
		A.append(8);
		A.append(1);
		A.append(10);
		A.append(19);


		Conjunto B = new Conjunto(empty);
		B.append(9);
		B.append(1);
		B.append(8);
		B.append(5);

		test = A.union(B);
		System.out.println("Teste de União entre conjuntos");
		for(int element : test.getElements()){
			System.out.print(element + " - ");
		}

		System.out.println("\n ==================================== \n");

		test = A.intersection(B);
		System.out.println("Teste de Interseção entre conjuntos");
		for(int element : test.getElements()){
			System.out.print(element + " - ");
		}

		System.out.println("\n ==================================== \n");

		test = A.difference(B);	
		System.out.println("Teste de Diferença entre conjuntos");
		for(int element : test.getElements()){
			System.out.print(element + " - ");
		}


		System.out.println("\n ==================================== \n");

		test = A.difference(B).union(A);	
		System.out.println("Teste de Diferença e União entre conjuntos");
		for(int element : test.getElements()){
			System.out.print(element + " - ");
		}


		System.out.println("\n ==================================== \n");


		System.out.println("Teste entre conjuntos");
		if (A.checkSubset(B)) {
			System.out.println("É subconjunto");
		} else {
			System.out.println("Não é subconjunto");
		}

	}
}
