import java.lang.Math;

public class Quadrado extends Figura{
	
	private double lado;
	private Ponto central;

	Quadrado(Ponto central){
		this(central, 0);
	}

	Quadrado(Ponto central, double lado){
		this.central = central;
		this.lado = lado;
	}

	public void desenhar(){
		System.out.println(this.toString());
	}

	public void mover(double dx, double dy){
		this.central.setX(this.central.getX() + dx);
		this.central.setY(this.central.getY() + dy);
	}

	public double calcularArea(){
		return Math.pow(this.lado, 2);
	}

	public String toString(){
		return "Quadrado";
	}
}