import java.util.Random;

public class Lab3 {
	public static void main(String[] args) {
		
		System.out.println("\n######################################\n#   TESTE - CLASSE ABSTRATA FIGURA   #\n######################################\n");

		Figura[] figuras = new Figura[10];

		figuras[0] = new Quadrado(new Ponto());
		figuras[1] = new Quadrado(new Ponto(), 10);

		figuras[2] = new Circulo(new Ponto());
		figuras[3] = new Circulo(new Ponto(2, 3), 10);
		

		for (int i = 0; i < 4; i++) {
			System.out.println("Área do " + figuras[i].toString() + String.format(" %.3f", figuras[i].calcularArea()));
			figuras[i].mover(5 + 2*i, 5 + 5*i);
			figuras[i].desenhar();
		}
		
		System.out.println("\n\n######################################\n#     TESTE - INTERFACE COLORIDA     #\n######################################\n");

		Figura[] figuras2 = new Figura[10]; // cria um vetor com 10 figuras
		for (int i = 0; i < 10; i++) { // percorre o vetor figuras2
			Random rand = new Random(); // cria um objeto Random

			// gera uma posição x aleatória para a figura a cada iteração
			int x = rand.nextInt(5) + 1;
			// gera uma posição y aleatória para a figura a cada iteração
			int y = rand.nextInt(8) + 1;

			// gera um raio r aleatório para a figura a cada iteração
			int r = rand.nextInt(100) + 1;

			// escolhe aleatoriamente se o elemento criado sera instancia de circulo ou quadrado
			if (rand.nextInt(2) == 1) {
				figuras2[i] = new Circulo(new Ponto(x, y), r);
			} else {
				figuras2[i] = new Quadrado(new Ponto(x, y), r);
			}
		}
		
		// percorre novamente o vetor
		for (int i = 0; i < 10; i++) {
			// verifica se e intancia da interface Colorida
			// no caso apenas quadrados sao instancias de Colorida
			if (figuras2[i] instanceof Colorida) {
				// caso seja, imprime sua area
				System.out.printf("Área da figura colorida: %.2f --  Quadrado\n", figuras2[i].calcularArea());
			} else {
				System.out.println("Figura não colorida -- Círculo");
			}
		}
	}
}

