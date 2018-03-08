import java.util.ArrayList;

class Conjunto {
	ArrayList<Integer> set = new ArrayList<Integer>();

	Conjunto () {
	}

	Conjunto (int[] elements) {
		for (int element : elements) {
			append(element);
		}
	}

	public boolean append (int newEl) {
		if (set.contains(newEl)) {
			return false; 
		}

		set.add(newEl);
		return true;
	}

	public boolean checkSubset (Conjunto B) {
		for (int element : B.getElements()) {
			if (!set.contains(element)) {
				return false;
			}
		}
		return true;
	}

	public Conjunto union (Conjunto B) {
		Conjunto unionResult = new Conjunto();
		for (int element : B.getElements()) {
			unionResult.append(element);
		}
		for (int element : this.getElements()) {
			unionResult.append(element);
		}
		return unionResult;
	}

	public Integer[] getElements () {
		Integer[] returnedArray = new Integer[set.size()];
		set.toArray(returnedArray);
		return returnedArray;
	}
}
