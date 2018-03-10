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
		if (set.contains(newEl)) {
			return false; 
		}
		set.add(newEl);
		return true;
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
}