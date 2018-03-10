import java.util.ArrayList;

public class Lab2 {
	public static void main (String[] args) {
		Conjunto test;

		int[] empty = new int[0];

		int[] vetorNaturais = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] vetorPares = {2, 4, 6, 8, 10};
		int[] vetorImpares = {1, 3, 5, 7, 9};
		int[] vetorPrimos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

		Conjunto naturais = new Conjunto(vetorNaturais);
		Conjunto pares = new Conjunto(vetorPares);
		Conjunto impares = new Conjunto(vetorImpares);
		Conjunto primos = new Conjunto(vetorPrimos);

		System.out.print("--- Conjuntos--- \n1 - Conjunto dos naturais\n2 - Conjunto dos pares\n3 - Conjunto dos impares\n4 - Conjunto dos primos\n  ");

		System.out.println("\n ==================================== \n");

		System.out.println("Conjunto 4 é subconjunto de si mesmo");
		if (primos.checkSubset(primos)) {
			System.out.println("É subconjunto");
		} else {
			System.out.println("Não é subconjunto");
		}

		System.out.println("\n ==================================== \n");

		System.out.println("A pertinência dos conjuntos 2, 3 e 4 no conjunto 1");

		System.out.println("\n ==================================== \n");

		System.out.println("A união de 2 e 3 é igual ao conjunto 1");
		if(pares.union(impares).equals(naturais)){
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}

		System.out.println("\n ==================================== \n");

		System.out.println("A intersecção dos conjuntos 1 e 2 é vazia");
		if(naturais.intersection(pares).isEmpty()){
			System.out.println("É vazio");
		} else {
			System.out.println("Não é vazio");
		}
		
		System.out.println("\n ==================================== \n");

		System.out.println("A diferença entre os conjuntos 1 e 2");

		Conjunto diferenca = naturais.difference(pares);
		if(!diferenca.isEmpty()){
			for(int element : diferenca.getElements()){
				System.out.print(element + " - ");	
			}
		}else{
			System.out.println("É vazio");
		}

		System.out.print("\n");
		

		


		

	}
}
