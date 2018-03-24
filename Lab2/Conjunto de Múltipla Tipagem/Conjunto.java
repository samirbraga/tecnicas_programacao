import java.util.ArrayList;

class Conjunto {
    ArrayList<Object> set = new ArrayList<Object>();
    
    Conjunto() {

    }

    Conjunto(Object element) {
        append(element);
    }

    Conjunto(Object[] elements) {
        for (Object element : elements) {
            append(element);
        }
    }

    Conjunto(int[] elements) {
        for (Object element : elements) {
            append(element);
        }
    }
    
    /* Adiciona elementos em um conjunto */
    public boolean append(Object newEl) {
        if (!checkElement(newEl)) {
            set.add(newEl);
            return true;
        }
        return false;
    }

    public int size() {
        int i = 0;

        for (Object element : this.getElements()) {
            i++;
        }

        return i;
    }

    public boolean checkElement(Object newEl) {
        if (set.contains(newEl)) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (set.size() > 0) {
            return false;
        }
        return true;
    }

    /* Verifica se B é subconjunto de A */
    public boolean checkSubset(Conjunto B) {
        for (Object element : B.getElements()) {
            if (!this.checkElement(element)) {
                return false;
            }
        }
        return true;
    }

    /* Retorna um Arraylist com os elementos de um conjunto */
    public Object[] getElements() {
        Object[] returnedArray = new Object[set.size()];
        set.toArray(returnedArray);
        return returnedArray;
    }

    /* União dos conjuntos A e B */
    public Conjunto union(Conjunto B) {
        Conjunto unionSet = new Conjunto();

        // Copia os elementos de A para setUnion
        for (Object element : set) {
            if (!unionSet.checkElement(element)) {
                unionSet.append(element);
            }
        }

        // Copia os elementos de B para setUnion
        for (Object element : B.getElements()) {
            if (!unionSet.checkElement(element)) {
                unionSet.append(element);
            }
        }

        return unionSet;
    }

    /* Interseção entre os conjuntos A e B */
    public Conjunto intersection(Conjunto B) {
        Conjunto intersectionSet = new Conjunto();

        for (Object element : B.getElements()) {
            if (this.checkElement(element)) {
                intersectionSet.append(element);
            }
        }
        return intersectionSet;
    }

    /* Diferença entre os conjuntos A e B */
    public Conjunto difference(Conjunto B) {
        Conjunto differenceSet = new Conjunto();

        for (Object element : this.getElements()) {
            if (!B.checkElement(element)) {
                differenceSet.append(element);
            }
        }
        return differenceSet;
    }

    public boolean equals(Conjunto B) {
        for (Object element : B.getElements()) {
            if (!this.checkElement(element)) {
                return false;
            }
        }

        for (Object element : this.getElements()) {
            if (!B.checkElement(element)) {
                return false;
            }
        }
        return true;
    }

    /* Produto cartesiano de A x B */
    public ArrayList cartesianProduct(Conjunto B) {
        ArrayList<Object> product = new ArrayList<Object>();

        for (Object elementA : this.getElements()) {
            for (Object elementB : B.getElements()) {
                product.add("(" + elementA + ", " + elementB + ")");
            }
        }
        return product;
    }
}
