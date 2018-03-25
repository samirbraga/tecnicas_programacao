class Circulo extends Figura{
	
	float radius;

	Circulo(float radius){
		this.radius = radius;
	}

	public void desenhar(){
		System.out.println("Circulo");
	}

	public void mover(float dx , float dy){
		this.x = dx;
		this.y = dy;
	}

	public float calcularArea(){
		float area =(float) (this.radius * this.radius * ((float)3.141592));
		return area;
	}

	public String toString(){
		return "Circulo";
	}
}