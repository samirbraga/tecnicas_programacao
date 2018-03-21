class Fila{
    int inicio;
    int fim;
    int tamanho;
    int qtdeElementos;
    Arraylist<Conjunto> f = new Arraylist<Conjunto>();

    public Fila(){
        inicio = fim = -1;
        qtdeElementos = 0;
    }

    public boolean estaVazia(){
        if (qtdeElementos == 0){
            return true;
        }
        return false;
    }

    public void adicionar(Conjunto e){
        
            if (inicio == -1){
                inicio = 0;
            }
            fim++;
            f.add(e);
            qtdeElementos++;
        
    }

    public Conjunto remover(){
        Conjunto elemento = null;
        if (! estaVazia() ){
            elemento = f.get(inicio);
            inicio++;
            qtdeElementos--;
        }
        return elemento;
    }

    // public void mostrar(){
    //     String elementos = "";
    //         for (int i = inicio; i<=fim; i++) {
    //             elementos += f[i]+ " - ";
    //         }
    //         System.out.println(elementos);
    // }
}