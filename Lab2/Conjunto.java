import java.util.ArrayList;

class Conjunto {
	ArrayList<Integer> set = new ArrayList<Integer>();

	Conjunto (){

	}

	Conjunto (int element) {
		append(element);
	}

	Conjunto (Integer[] elements) {
		for (int element : elements) {
			append(element);
		}
	}

	Conjunto (int[] elements) {
		for (int element : elements) {
			append(element);
		}
	}

	/* Adiciona elementos em um conjunto */
	public boolean append (int newEl) {
		if (!checkElement(newEl)) {
			set.add(newEl);
			return true;
		}
		return false; 
	}

	public int size(){
		int i = 0;

		for (int element : this.getElements()) {
			i++;
		}
		return i;
	}

	public boolean checkElement (int newEl) {
		if (set.contains(newEl)){
			return true; 
		}
		return false;
	}

	public boolean isEmpty(){
		if (set.size() > 0) {
			return false;
		}
		return true;
	}

	/* Verifica se B é subconjunto de A */
	public boolean checkSubset (Conjunto B) {
		for (int element : B.getElements()) {
			if (!this.checkElement(element)) {
				return false;
			}
		}
		return true;
	}

	/* Retorna um Arraylist com os elementos de um conjunto */
	public Integer[] getElements () {
		Integer[] returnedArray = new Integer[set.size()];
		set.toArray(returnedArray);
		return returnedArray;
	}

	/* União dos conjuntos A e B */
	public Conjunto union (Conjunto B) {
		Conjunto unionSet = new Conjunto();

		// Copia os elementos de A para setUnion
		for (int element : set) {
			if (!unionSet.checkElement(element)) {
				unionSet.append(element);
			}
		}

		// Copia os elementos de B para setUnion
		for (int element : B.getElements()) {
			if (!unionSet.checkElement(element)) {
				unionSet.append(element);
			}
		}
		return unionSet;
	}

	/* Interseção entre os conjuntos A e B */
	public Conjunto intersection (Conjunto B) {
		Conjunto intersectionSet = new Conjunto();

		for (int element : B.getElements()) {
			if (this.checkElement(element)) {
				intersectionSet.append(element);
			}
		}
		return intersectionSet;
	}

	/* Diferença entre os conjuntos A e B */
	public Conjunto difference (Conjunto B){
		Conjunto differenceSet = new Conjunto();

		for (int element : this.getElements()) {
			if (!B.checkElement(element)){
				differenceSet.append(element);
			}
		}
		return differenceSet;
	}

	public boolean equals (Conjunto B){
		for(int element : B.getElements()) {
			if(!this.checkElement(element)) {
				return false;
			}
		}

		for(int element : this.getElements()) {
			if(!B.checkElement(element)) {
				return false;
			}
		}
		return true;
	}

	/* Produto cartesiano de A x B */
	public ArrayList cartesianProduct (Conjunto B) {
		ArrayList<Object> product = new ArrayList<Object>();

		for (int elementA : this.getElements()) {
			for (int elementB : B.getElements()) {
				product.add("(" + elementA + ", " + elementB + ")");
			}
		}
		return product;
	}

	/* Conjunto potência de A */
	public ArrayList parties () {
		/* Cada elemento do conjunto A será transformado em um conjunto e guardado em initialSet */
		boolean verificador;
		int i = -1;
		Conjunto setElement;
		Conjunto nextElement;
		Conjunto excluded;
		
		/* List que contem os conjuntos dos elementos de A */
		ArrayList<Conjunto> initialSet = new ArrayList<Conjunto>();

		/* Conjunto potencia de A */
		ArrayList<Conjunto> potencySet = new ArrayList<Conjunto>();
		
		Fila permutacoes = new Fila();

		for (int element : this.getElements()) {
			setElement = new Conjunto(element);
			initialSet.add(setElement);
		}

		while (i < initialSet.size() - 1){ // verificar validade do -1 
			verificador = false;
			if(permutacoes.estaVazia()){
				i++;
				permutacoes.adicionar(initialSet.get(i));
			}

			for (int element : this.getElements()){
				
				nextElement = new Conjunto(permutacoes.get(0).getElements());

				if(nextElement.append(element)){
					permutacoes.adicionar(nextElement);
				}
			}
			
			excluded = permutacoes.remover();

			for (Conjunto potencyElement : potencySet) {
				if(potencyElement.equals(excluded)) verificador = true;
			}

			if(!verificador) potencySet.add(excluded);
		}
		return potencySet;
	}
}