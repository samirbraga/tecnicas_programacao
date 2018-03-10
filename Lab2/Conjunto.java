import java.util.ArrayList;

class Conjunto {
	ArrayList<Integer> set = new ArrayList<Integer>();

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
		if (set.contains(newEl)) {
			return true; 
		}
		return false;
	}

	/* Verifica se B é subconjunto de A */
	public boolean checkSubset (Conjunto B) {
		for (int element : B.getElements()) {
			if (!set.contains(element)) {
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
	public ArrayList union(Conjunto B){
		Conjunto conjuntoUniao = new Conjunto;
		ArrayList<Integer> setUnion = new ArrayList<Integer>();

		// Copia os elementos de A para setUnion
		for (int element : set){
			if (!setUnion.contains(element)) {
				setUnion.add(element);
			}
		}

		// Copia os elementos de B para setUnion
		for (int element : B.getElements()){
			if (!setUnion.contains(element)) {
				setUnion.add(element);
			}
		}
		return setUnion;
	}

	/* Interseção entre os conjuntos A e B */
	public ArrayList intersection(Conjunto B){
		ArrayList<Integer> setIntersection = new ArrayList<Integer>();

		for (int element : B.getElements()){
			if (set.contains(element)) {
				setIntersection.add(element);
			}
		}
		return setIntersection;
	}

	/* Diferença entre os conjuntos B e A */
	public ArrayList difference(Conjunto B){
		ArrayList<Integer> setDifference = new ArrayList<Integer>();

		for (int element : B.getElements()){
			if (!set.contains(element)){
				setDifference.add(element);
			}
		}
		return setDifference;
	}
}