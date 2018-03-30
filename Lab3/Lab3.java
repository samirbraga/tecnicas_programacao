public class Lab3{
	public static void main(String[] args) {
		Figura[] figuras = new Figura[10];

		figuras[0] = new Quadrado(new Ponto());
		figuras[1] = new Quadrado(new Ponto(), 10);

		figuras[2] = new Circulo(new Ponto());
		figuras[3] = new Circulo(new Ponto(2, 3), 10);

		for(int i = 0; i < 4; i++){
			System.out.println("Área do " + figuras[i].toString() + String.format(" %.3f", figuras[i].calcularArea()));
			figuras[i].mover(5 + 2*i, 5 + 5*i);
			figuras[i].desenhar();
		}		
	}
}

