import java.util.ArrayList;

public class FilaAplicacao {
    
    public static void main(String[] args) {

        int[] vetorNaturais = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] vetorNaturais2 = {1, 2, 3, 4, 5, 6, 7, 8};

        Fila f = new Fila();        
        Conjunto naturais = new Conjunto(vetorNaturais);
        
		ArrayList set = naturais.cartesianProduct(naturais);
		
		// set.add(4);
		// set.add(3);
		// set.add(1);


        f.adicionar(2);
        f.adicionar(3);
        f.adicionar(4);
        // f.mostrar();
        System.out.println(f.remover());
        System.out.println(f.remover());
        // f.mostrar();
        
    }
}