import java.util.ArrayList;

public class Lab2 {
	public static void main (String[] args) {

		int[] vetorNaturais = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] vetorPares = {2, 4, 6, 8, 10};
		int[] vetorImpares = {1, 3, 5, 7, 9};
		int[] vetorPrimos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		int[] vectorUniverse = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49};
        	int[] vectorA_5 = {2, 3, 5, 7, 11, 13, 17, 19, 23};
        	int[] vectorB_5 = {13, 17, 19, 23, 29, 31, 37, 41, 43, 47};

		Conjunto naturais = new Conjunto(vetorNaturais);
		Conjunto pares = new Conjunto(vetorPares);
		Conjunto impares = new Conjunto(vetorImpares);
		Conjunto primos = new Conjunto(vetorPrimos);


		System.out.print("--- Conjuntos--- \n1 - Conjunto dos naturais\n2 - Conjunto dos pares\n3 - Conjunto dos impares\n4 - Conjunto dos primos\n  ");

		System.out.println("\n ==================================== \n");

		System.out.println("Conjunto 4 é subconjunto de si mesmo");
		if (primos.checkSubset(pares)) {
			System.out.println("É subconjunto");
		} else {
			System.out.println("Não é subconjunto");
		}

		System.out.println("\n ==================================== \n");

		System.out.println("A pertinência dos conjuntos 2, 3 e 4 no conjunto 1\n");

		if(naturais.checkSubset(pares)){
			System.out.println("O conjunto dos 'PARES' perciste no conjunto dos 'NATURAIS'");
		}else{
			System.out.println("NÃO há percistencia entre o conjunto dos 'NATURAIS' e os 'PARES'!");
		}

		if(naturais.checkSubset(impares)){
			System.out.println("O conjunto dos 'IMPARES' perciste no conjunto dos 'NATURAIS'");
		}else{
			System.out.println("NÃO há percistencia entre o conjunto dos 'NATURAIS' e os 'IMPARES'!");
		}

		if(naturais.checkSubset(primos)){
			System.out.println("O conjunto dos 'PRIMOS' perciste no conjunto dos 'NATURAIS'");
		}else{
			System.out.println("NÃO há percistencia entre o conjunto dos 'NATURAIS' e os 'PRIMOS'!");
		}

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
		

		System.out.println("\n ==================================== \n");

		System.out.println("O produto cartesiano de 2 e 3");


		int i = 0;
	
		ArrayList produtoCartesiano = pares.cartesianProduct(impares);
		for (Object element : produtoCartesiano){
			System.out.print(element + ", ");
			i++;
			if (i % 5 == 0) System.out.println("");
		}

		System.out.print("\n");
		
		System.out.println("\n ==================================== \n");

		System.out.println("O conjunto das partes dos naturais");
		
		ArrayList<Conjunto> potencia = naturais.parties();

		for (Conjunto subconjuntos : potencia){
			for (int elementos : subconjuntos.getElements()) {
				System.out.print(elementos + " - ");
			}
			System.out.println("");
		}

		System.out.print("\n");		

		System.out.println("\n ==================================== \n");

		System.out.println("De Morgan");

		Conjunto universe = new Conjunto(vectorUniverse);
        Conjunto a = new Conjunto(vectorA_5);
		Conjunto b = new Conjunto(vectorA_5);
        Conjunto inverseA = universe.difference(a);
        Conjunto inverseB = universe.difference(b);
        Conjunto a_Intersection_b = a.intersection(b);
        Conjunto a_Union_b = a.union(b);

            
		Conjunto result_1 = universe.difference(a_Union_b);

		Conjunto result_2 = inverseA.intersection(inverseB);
		
		System.out.println("A) Verificando se ¬( A U B) = ¬A ∩ ¬B é uma proposicao valida.");

        if (result_1.equals(result_2)) {

        	System.out.println("VALIDO : ¬( A U B) = ¬A ∩ ¬B");
        	
        }else{

        	System.out.println("A proposicao A) está errada!");

        }

        result_1 = universe.difference(a_Intersection_b);
        result_2 = inverseA.union(inverseB);

        System.out.println("B) Verificando se ¬(A ∩ B) = ¬A U ¬B é uma proposicao valida.");

        if (result_1.equals(result_2)) {
        	System.out.println("VALIDO : ¬(A ∩ B) = ¬A U ¬B");
        }else{
        	System.out.println("A proposicao B) está errada!");
        }

	}
}
