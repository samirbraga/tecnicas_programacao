class Teste {
    public static void main (String[] args) {
        Conjunto meuConjunto1 = new Conjunto();
        Conjunto meuConjunto2 = new Conjunto();

        Integer inteiro = new Integer(4);
        String string = "Hello";
        float flutuante = 22.4f;

        meuConjunto1.append(inteiro);
        meuConjunto1.append(string);
        meuConjunto1.append(flutuante);

        meuConjunto2.append(inteiro);
        meuConjunto2.append(string);
        meuConjunto2.append(flutuante);

        for (Object elemento : meuConjunto1.cartesianProduct(meuConjunto2)) {
            System.out.println(elemento);
        }
    }
}
