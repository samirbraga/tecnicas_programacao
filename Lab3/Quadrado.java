class Quadrado extends Figura{
	
	float height;
	float width;

	Quadrado(){}

	public Quadrado(float height, float width){
		this.height = height;
		this.width = width;
	}

	public void desenhar(){
		System.out.println(this.toString());
	}

	public void mover(float dx, float dy){
		this.x = dx;
		this.y = dy;
	}

	public float calcularArea(){
		float area = this.height * this.width;
		return area;
	}

	// public String toString(){
	// 	return "Quadrado";
	// }
}