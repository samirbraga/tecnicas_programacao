class Teste {
    public static void main (String[] args) {
        Conjunto meuConjunto = new Conjunto();

        Inteiro meuInteiro = new Inteiro(4);
        Texto meuTexto = new Texto("Hello");
        Flutuante meuFlutuante = new Flutuante(22.4f);

        meuConjunto.addElemento(meuInteiro);
        meuConjunto.addElemento(meuTexto);
        meuConjunto.addElemento(meuFlutuante);

        for (Elemento elemento : meuConjunto.getElementos()) {
            System.out.println(Elemento.getElemento(elemento));
        }
    }
}
