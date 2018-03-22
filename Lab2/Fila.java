import java.util.ArrayList; 

class Fila extends Conjunto{

    ArrayList<Conjunto> f = new ArrayList<Conjunto>();

    Fila(){
    }

    public boolean estaVazia(){
        if (f.size() == 0){
            return true;
        }
        return false;
    }

    public void adicionar(Conjunto sub){
        if(checkSubSet(sub)){
            f.add(sub);
        }
    }

    public boolean checkSubSet(Conjunto sub){
        for (Conjunto subconjunto : f){
            if(subconjunto.equals(sub)){
                return false;
            }                
        }
        return true;
    }

    public Conjunto remover(){
        Conjunto elemento = null;
        if (!estaVazia()){
            elemento = f.get(0);
            f.remove(elemento);
        }
        return elemento;
    }

    public Conjunto get(int index){
        return f.get(index);
    }

    public ArrayList<Conjunto> getFila(){
        return this.f;
    }

    public void mostrar(){
        for (Conjunto elemento : f) {
            for (int element : elemento.getElements()){
                System.out.print(element + " - ");
            }
            System.out.println("");
        }
    }
}