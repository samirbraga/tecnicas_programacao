class Quadrado extends Figura{
	
	float height;
	float whidth;

	Quadrado(){}

	public Quadrado(float height, float whidth){
		this.height = height;
		this.whidth = whidth;
	}

	public void desenhar(){
		System.out.println("Quadrado");
	}

	public void mover(float dx , float dy){
		this.x = dx;
		this.y = dy;
	}

	public float calcularArea(){
		float area = this.x * this.y;
		return area;
	}

	public String toString(){
		return "Quadrado";
	}
}