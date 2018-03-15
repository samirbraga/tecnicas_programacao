import java.util.ArrayList;

class Conjunto {
	ArrayList<Integer> set = new ArrayList<Integer>();

	Conjunto (){

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
	public ArrayList powerPackage () {
		ArrayList<Conjunto> potency = new ArrayList<Object>();
	}
}