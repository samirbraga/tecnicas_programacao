import java.lang.Math;

public class Circulo extends Figura{
	
	private double radius;
	private Ponto central = new Ponto();

	Circulo(){
		this(0);
	}

	Circulo(double radius){
		this.radius = radius;
	}

	public void desenhar(){
		System.out.println(this.toString());
	}

	public void mover(double dx, double dy){
		this.central.setX(this.central.getX() + dx);
		this.central.setY(this.central.getY() + dy);
	}

	public double calcularArea(){
		return Math.PI * Math.pow(this.radius, 2);
	}
}