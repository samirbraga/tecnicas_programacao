import java.lang.Math;

public class Quadrado2 extends Figura{
	
	private Ponto supEsquerdo = new Ponto();
	private Ponto infDireito = new Ponto();
	private double largura;

	Quadrado2(){
		this(0);
	}

	Quadrado2(double largura){
		this.largura = largura;

		infDireito.setX(this.supEsquerdo.getX() + largura);
		infDireito.setY(this.supEsquerdo.getY() + largura);
	}

	public void desenhar(){
		System.out.println(this.toString());
	}

	public void mover(double dx, double dy){
		this.supEsquerdo.setX(this.supEsquerdo.getX() + dx);
		this.supEsquerdo.setY(this.supEsquerdo.getY() + dy);
		this.infDireito.setX(this.infDireito.getX() + dx);
		this.infDireito.setY(this.infDireito.getY() + dy);
	}

	public double calcularArea(){
		return Math.pow(largura, 2);
	} 
}