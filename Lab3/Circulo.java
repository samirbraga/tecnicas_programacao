import java.lang.Math;

public class Circulo extends Figura {
	
	private double radius;
	private Ponto central;

	Circulo(Ponto central) {
		this(central, 0);
	}

	Circulo(Ponto central, double radius) {
		this.radius = radius;
		this.central = central;
	}

	public void desenhar() {
		System.out.println(this.toString());
	}

	public void mover(double dx, double dy) {
		this.central.setX(this.central.getX() + dx);
		this.central.setY(this.central.getY() + dy);
	}

	public double calcularArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	public String toString() {
		return "Circulo";
	}
}