class Texto extends Elemento {
    String valor;

    Texto (String novoValor) {
        valor = novoValor;
    }

    String getTexto () {
        return valor;
    }
}