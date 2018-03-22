import java.util.ArrayList;

class Conjunto {
    ArrayList<Elemento> conjunto = new ArrayList<Elemento>();

    void addElemento (Elemento novoElemento) {
        if (!conjunto.contains(novoElemento)){
            conjunto.add(novoElemento);
        }
    }
    
    Elemento[] getElementos () {
        Elemento[] elementos = new Elemento[conjunto.size()];
        conjunto.toArray(elementos);
        return elementos;
    }
}
