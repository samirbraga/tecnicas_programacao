class QuadradoColorido extends Quadrado implements Colorida{
	String cor;

	QuadradoColorido(Ponto central) {
		super(central, 0);
	}

	QuadradoColorido(Ponto central, double lado) {
		super(central, lado);
	}

	QuadradoColorido(Ponto central, double lado, String cor) {
		super(central, lado);
		this.cor = cor;
	}

	public void desenhar(){
		System.out.println(this.toString());
	}

	public double calcularArea() {
		return super.calcularArea();
	}

	public void mover(double dx, double dy) {
		super.mover(dx, dy);
	}

	public String toString() {
		return "Quadrado " + cor;
	}
}