class Elemento {
    static Object getElemento (Elemento elemento) {
        if (elemento instanceof Inteiro) {
            Inteiro el = (Inteiro)elemento;
            return el.getInteiro();
        } else if (elemento instanceof Texto) {
            Texto el = (Texto)elemento;
            return el.getTexto();
        } else if (elemento instanceof Flutuante) {
            Flutuante el = (Flutuante)elemento;
            return el.getFlutuante();
        }
        return new String("");
    }

    // static int getElemento (Elemento elemento, Inteiro inteiro) {
    //     return ((Inteiro)elemento).getInteiro();
    // }

    // static String getElemento (Elemento elemento, Texto texto) {
    //     return ((Texto)elemento).getTexto();
    // }

    // static Float getElemento (Elemento elemento, Flutuante flutuante) {
    //     return ((Flutuante)elemento).getFlutuante();
    // }
}